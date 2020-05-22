package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.body
import typingsSlinky.angularCore.angularCoreStrings.component
import typingsSlinky.angularCore.angularCoreStrings.document
import typingsSlinky.angularCore.angularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDef extends js.Object {
  var eventName: String
  var propName: String | Null
  var target: window | document | body | component | Null
  var `type`: OutputType
}

object OutputDef {
  @scala.inline
  def apply(
    eventName: String,
    `type`: OutputType,
    propName: String = null,
    target: window | document | body | component = null
  ): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

