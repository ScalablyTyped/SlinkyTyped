package typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod

import typingsSlinky.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAlreadyOwnedByYou
  extends ServiceException[BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou
}

object BucketAlreadyOwnedByYou {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BucketAlreadyOwnedByYouDetails,
    message: String,
    name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou,
    stack: String = null
  ): BucketAlreadyOwnedByYou = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyOwnedByYou]
  }
}

