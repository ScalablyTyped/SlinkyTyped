package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.anon.Directive
import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.r3AstMod.BoundAttribute
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import typingsSlinky.angularCompiler.r3AstMod.Element
import typingsSlinky.angularCompiler.r3AstMod.Reference
import typingsSlinky.angularCompiler.r3AstMod.Template
import typingsSlinky.angularCompiler.r3AstMod.TextAttribute
import typingsSlinky.angularCompiler.r3AstMod.Variable
import typingsSlinky.angularCompiler.selectorMod.SelectorMatcher
import typingsSlinky.angularCompiler.t2ApiMod.BoundTarget
import typingsSlinky.angularCompiler.t2ApiMod.DirectiveMeta
import typingsSlinky.angularCompiler.t2ApiMod.Target
import typingsSlinky.angularCompiler.t2ApiMod.TargetBinder
import typingsSlinky.std.Map
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/t2_binder", JSImport.Namespace)
@js.native
object t2BinderMod extends js.Object {
  
  @js.native
  class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected () extends BoundTarget[DirectiveT] {
    def this(
      target: Target,
      directives: Map[Element | Template, js.Array[DirectiveT]],
      bindings: Map[BoundAttribute | BoundEvent | TextAttribute, DirectiveT | Element | Template],
      references: Map[
            BoundAttribute | BoundEvent | Reference | TextAttribute, 
            Directive[DirectiveT] | Element | Template
          ],
      exprTargets: Map[AST, Reference | Variable],
      symbols: Map[Reference | Variable, Template],
      nestingLevel: Map[Template, Double],
      templateEntities: Map[Template | Null, ReadonlySet[Reference | Variable]],
      usedPipes: Set[String]
    ) = this()
    
    var bindings: js.Any = js.native
    
    var directives: js.Any = js.native
    
    var exprTargets: js.Any = js.native
    
    var nestingLevel: js.Any = js.native
    
    var references: js.Any = js.native
    
    var symbols: js.Any = js.native
    
    var templateEntities: js.Any = js.native
    
    var usedPipes: js.Any = js.native
  }
  
  @js.native
  class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected () extends TargetBinder[DirectiveT] {
    def this(directiveMatcher: SelectorMatcher[DirectiveT]) = this()
    
    var directiveMatcher: js.Any = js.native
  }
}
