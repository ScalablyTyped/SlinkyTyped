package typingsSlinky.pulumiAws.s3MixinsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.Asterisk
import typingsSlinky.pulumiAws.pulumiAwsStrings.Delete
import typingsSlinky.pulumiAws.pulumiAwsStrings.DeleteMarkerCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectRemovedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[Asterisk | Delete | DeleteMarkerCreated] = js.native
}

object ObjectRemovedSubscriptionArgs {
  @scala.inline
  def apply(): ObjectRemovedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectRemovedSubscriptionArgs]
  }
  @scala.inline
  implicit class ObjectRemovedSubscriptionArgsOps[Self <: ObjectRemovedSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Asterisk | Delete | DeleteMarkerCreated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
  }
  
}

