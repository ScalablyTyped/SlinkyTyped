package typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyExistsMod

import typingsSlinky.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAlreadyExists
  extends ServiceException[BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists
}

object BucketAlreadyExists {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BucketAlreadyExistsDetails,
    message: String,
    name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists,
    stack: String = null
  ): BucketAlreadyExists = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyExists]
  }
}

