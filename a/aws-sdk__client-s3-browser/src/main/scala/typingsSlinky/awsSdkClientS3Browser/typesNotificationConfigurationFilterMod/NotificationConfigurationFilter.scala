package typingsSlinky.awsSdkClientS3Browser.typesNotificationConfigurationFilterMod

import typingsSlinky.awsSdkClientS3Browser.typesS3KeyFilterMod.S3KeyFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfigurationFilter extends js.Object {
  /**
    * <p>Container for object key name prefix and suffix filtering rules.</p>
    */
  var Key: js.UndefOr[S3KeyFilter] = js.native
}

object NotificationConfigurationFilter {
  @scala.inline
  def apply(): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
  @scala.inline
  implicit class NotificationConfigurationFilterOps[Self <: NotificationConfigurationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: S3KeyFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
  }
  
}

