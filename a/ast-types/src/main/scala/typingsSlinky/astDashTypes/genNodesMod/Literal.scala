package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.Anon_Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait Literal extends ASTNode {
  var regex: Anon_Flags | Null
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Literal
  var value: String | Boolean | Null | Double | js.RegExp
}

object Literal {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.Literal,
    regex: Anon_Flags = null,
    value: String | Boolean | Double | js.RegExp = null
  ): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

