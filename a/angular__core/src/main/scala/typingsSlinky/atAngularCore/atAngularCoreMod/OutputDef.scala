package typingsSlinky.atAngularCore.atAngularCoreMod

import typingsSlinky.atAngularCore.atAngularCoreStrings.body
import typingsSlinky.atAngularCore.atAngularCoreStrings.component
import typingsSlinky.atAngularCore.atAngularCoreStrings.document_
import typingsSlinky.atAngularCore.atAngularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDef extends js.Object {
  var eventName: String
  var propName: String | Null
  var target: window | document_ | body | component | Null
  var `type`: OutputType
}

object OutputDef {
  @scala.inline
  def apply(
    eventName: String,
    `type`: OutputType,
    propName: String = null,
    target: window | document_ | body | component = null
  ): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (propName != null) __obj.updateDynamic("propName")(propName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

