package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.anon.Directive
import typingsSlinky.angularCompiler.r3AstMod.BoundAttribute
import typingsSlinky.angularCompiler.r3AstMod.BoundEvent
import typingsSlinky.angularCompiler.r3AstMod.Reference
import typingsSlinky.angularCompiler.r3AstMod.Template
import typingsSlinky.angularCompiler.r3AstMod.TextAttribute
import typingsSlinky.angularCompiler.r3AstMod.Variable
import typingsSlinky.angularCompiler.t2ApiMod.DirectiveMeta
import typingsSlinky.angularCompiler.t2ApiMod.Target
import typingsSlinky.std.Map
import typingsSlinky.std.ReadonlySet
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typingsSlinky.angularCompiler.compilerMod.R3BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[typingsSlinky.angularCompiler.r3AstMod.Element | Template, js.Array[DirectiveT]],
    bindings: Map[
        BoundAttribute | BoundEvent | TextAttribute, 
        DirectiveT | typingsSlinky.angularCompiler.r3AstMod.Element | Template
      ],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        Directive[DirectiveT] | typingsSlinky.angularCompiler.r3AstMod.Element | Template
      ],
    exprTargets: Map[typingsSlinky.angularCompiler.astMod.AST, Reference | Variable],
    symbols: Map[Reference | Variable, Template],
    nestingLevel: Map[Template, Double],
    templateEntities: Map[Template | Null, ReadonlySet[Reference | Variable]],
    usedPipes: Set[String]
  ) = this()
}
