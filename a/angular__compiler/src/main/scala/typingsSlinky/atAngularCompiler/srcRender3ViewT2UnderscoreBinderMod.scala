package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundAttribute
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Reference
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Variable
import typingsSlinky.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.BoundTarget
import typingsSlinky.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import typingsSlinky.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.Target
import typingsSlinky.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.TargetBinder
import typingsSlinky.atAngularCompiler.srcSelectorMod.SelectorMatcher
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/t2_binder", JSImport.Namespace)
@js.native
object srcRender3ViewT2UnderscoreBinderMod extends js.Object {
  @js.native
  class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected () extends BoundTarget[DirectiveT] {
    def this(
      target: Target,
      directives: Map[Element | Template, js.Array[DirectiveT]],
      bindings: Map[BoundAttribute | BoundEvent | TextAttribute, DirectiveT | Element | Template],
      references: Map[
            BoundAttribute | BoundEvent | Reference | TextAttribute, 
            Anon_Directive[DirectiveT] | Element | Template
          ],
      exprTargets: Map[AST, Reference | Variable],
      symbols: Map[Reference | Variable, Template],
      nestingLevel: Map[Template, Double],
      usedPipes: Set[String]
    ) = this()
    var bindings: js.Any = js.native
    var directives: js.Any = js.native
    var exprTargets: js.Any = js.native
    var nestingLevel: js.Any = js.native
    var references: js.Any = js.native
    var symbols: js.Any = js.native
    var usedPipes: js.Any = js.native
  }
  
  @js.native
  class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected () extends TargetBinder[DirectiveT] {
    def this(directiveMatcher: SelectorMatcher[DirectiveT]) = this()
    var directiveMatcher: js.Any = js.native
    /* CompleteClass */
    override def bind(target: Target): BoundTarget[DirectiveT] = js.native
  }
  
}

