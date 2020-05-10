package typingsSlinky.angularCore

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.angularCore.mod.GlobalTargetName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNameGlobalTargetName extends js.Object {
  var name: GlobalTargetName = js.native
  var target: EventTarget = js.native
}

object AnonNameGlobalTargetName {
  @scala.inline
  def apply(name: GlobalTargetName, target: EventTarget): AnonNameGlobalTargetName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameGlobalTargetName]
  }
  @scala.inline
  implicit class AnonNameGlobalTargetNameOps[Self <: AnonNameGlobalTargetName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: GlobalTargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

