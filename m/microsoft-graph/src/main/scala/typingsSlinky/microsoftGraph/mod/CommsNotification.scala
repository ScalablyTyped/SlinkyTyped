package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommsNotification extends js.Object {
  var changeType: js.UndefOr[ChangeType] = js.native
  var resourceUrl: js.UndefOr[String] = js.native
}

object CommsNotification {
  @scala.inline
  def apply(): CommsNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommsNotification]
  }
  @scala.inline
  implicit class CommsNotificationOps[Self <: CommsNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: ChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(js.undefined)
        ret
    }
  }
  
}

