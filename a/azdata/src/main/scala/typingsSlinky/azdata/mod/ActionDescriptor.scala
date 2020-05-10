package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionDescriptor extends js.Object {
  /**
  		 * Name of the clickable action. If not defined then no action will be shown
  		 */
  var actionTitle: js.UndefOr[String] = js.native
  /**
  		 * Data sent on callback being run.
  		 */
  var callbackData: js.UndefOr[js.Any] = js.native
  /**
  		 * User-visible label to display
  		 */
  var label: String = js.native
}

object ActionDescriptor {
  @scala.inline
  def apply(label: String): ActionDescriptor = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDescriptor]
  }
  @scala.inline
  implicit class ActionDescriptorOps[Self <: ActionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackData")(js.undefined)
        ret
    }
  }
  
}

