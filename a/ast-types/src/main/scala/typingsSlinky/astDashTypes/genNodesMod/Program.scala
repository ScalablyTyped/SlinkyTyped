package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.DirectiveKind
import typingsSlinky.astDashTypes.genKindsMod.InterpreterDirectiveKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Program extends ASTNode {
  var body: js.Array[StatementKind]
  var directives: js.Array[DirectiveKind]
  var interpreter: InterpreterDirectiveKind | Null
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    directives: js.Array[DirectiveKind],
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Program,
    interpreter: InterpreterDirectiveKind = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

