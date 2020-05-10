package typingsSlinky.blueprintjsCore

import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectedTabId extends js.Object {
  var selectedTabId: ReactText = js.native
}

object AnonSelectedTabId {
  @scala.inline
  def apply(selectedTabId: ReactText): AnonSelectedTabId = {
    val __obj = js.Dynamic.literal(selectedTabId = selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectedTabId]
  }
  @scala.inline
  implicit class AnonSelectedTabIdOps[Self <: AnonSelectedTabId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedTabId(value: ReactText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTabId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

