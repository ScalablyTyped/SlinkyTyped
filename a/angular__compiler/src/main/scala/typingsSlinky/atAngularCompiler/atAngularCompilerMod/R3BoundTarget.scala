package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.Anon_Directive
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundAttribute
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Reference
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.TextAttribute
import typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Variable
import typingsSlinky.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import typingsSlinky.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.Target
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.R3BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[
        typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template, 
        js.Array[DirectiveT]
      ],
    bindings: Map[
        BoundAttribute | BoundEvent | TextAttribute, 
        DirectiveT | typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template
      ],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        Anon_Directive[DirectiveT] | typingsSlinky.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element | Template
      ],
    exprTargets: Map[
        typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST, 
        Reference | Variable
      ],
    symbols: Map[Reference | Variable, Template],
    nestingLevel: Map[Template, Double],
    usedPipes: Set[String]
  ) = this()
}

