package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.body
import typingsSlinky.angularCore.angularCoreStrings.component
import typingsSlinky.angularCore.angularCoreStrings.document
import typingsSlinky.angularCore.angularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDef extends js.Object {
  var eventName: String = js.native
  var propName: String | Null = js.native
  var target: window | document | body | component | Null = js.native
  var `type`: OutputType = js.native
}

object OutputDef {
  @scala.inline
  def apply(eventName: String, `type`: OutputType): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
  @scala.inline
  implicit class OutputDefOps[Self <: OutputDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OutputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propName")(null)
        ret
    }
    @scala.inline
    def withTarget(value: window | document | body | component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
  }
  
}

