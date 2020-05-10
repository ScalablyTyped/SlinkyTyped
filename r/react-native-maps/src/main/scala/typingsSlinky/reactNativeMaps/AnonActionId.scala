package typingsSlinky.reactNativeMaps

import typingsSlinky.reactNativeMaps.reactNativeMapsStrings.`marker-deselect`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionId extends js.Object {
  var action: `marker-deselect` = js.native
  var id: String = js.native
}

object AnonActionId {
  @scala.inline
  def apply(action: `marker-deselect`, id: String): AnonActionId = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionId]
  }
  @scala.inline
  implicit class AnonActionIdOps[Self <: AnonActionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: `marker-deselect`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

