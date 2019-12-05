package typingsSlinky.astDashTypes.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait RegExpLiteral extends ASTNode {
  var flags: String
  var pattern: String
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.RegExpLiteral
  var value: js.RegExp
}

object RegExpLiteral {
  @scala.inline
  def apply(
    flags: String,
    pattern: String,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.RegExpLiteral,
    value: js.RegExp
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

