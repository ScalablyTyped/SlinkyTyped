package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventListenerTarget extends js.Object {
  var eventListenerTarget: Null = js.native
  var target: Null = js.native
}

object AnonEventListenerTarget {
  @scala.inline
  def apply(eventListenerTarget: Null, target: Null): AnonEventListenerTarget = {
    val __obj = js.Dynamic.literal(eventListenerTarget = eventListenerTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventListenerTarget]
  }
  @scala.inline
  implicit class AnonEventListenerTargetOps[Self <: AnonEventListenerTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventListenerTarget(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListenerTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

