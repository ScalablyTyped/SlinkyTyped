package typingsSlinky.pulumiAws.s3MixinsMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.Asterisk
import typingsSlinky.pulumiAws.pulumiAwsStrings.CompleteMultipartUpload
import typingsSlinky.pulumiAws.pulumiAwsStrings.Copy
import typingsSlinky.pulumiAws.pulumiAwsStrings.Post
import typingsSlinky.pulumiAws.pulumiAwsStrings.Put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCreatedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[Asterisk | Put | Post | Copy | CompleteMultipartUpload] = js.native
}

object ObjectCreatedSubscriptionArgs {
  @scala.inline
  def apply(): ObjectCreatedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
  }
  @scala.inline
  implicit class ObjectCreatedSubscriptionArgsOps[Self <: ObjectCreatedSubscriptionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Asterisk | Put | Post | Copy | CompleteMultipartUpload): Self = {
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

