package typingsSlinky.atPulumiAws.s3S3MixinsMod

import typingsSlinky.atPulumiAws.atPulumiAwsStrings.Asterisk
import typingsSlinky.atPulumiAws.atPulumiAwsStrings.CompleteMultipartUpload
import typingsSlinky.atPulumiAws.atPulumiAwsStrings.Copy
import typingsSlinky.atPulumiAws.atPulumiAwsStrings.Post
import typingsSlinky.atPulumiAws.atPulumiAwsStrings.Put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCreatedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  var event: js.UndefOr[Asterisk | Put | Post | Copy | CompleteMultipartUpload] = js.native
}

object ObjectCreatedSubscriptionArgs {
  @scala.inline
  def apply(
    event: Asterisk | Put | Post | Copy | CompleteMultipartUpload = null,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): ObjectCreatedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix.asInstanceOf[js.Any])
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
  }
}

