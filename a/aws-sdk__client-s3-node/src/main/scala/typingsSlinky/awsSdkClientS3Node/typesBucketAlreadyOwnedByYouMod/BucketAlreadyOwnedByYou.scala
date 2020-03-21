package typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod

import typingsSlinky.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyOwnedByYou
  extends ServiceException[BucketAlreadyOwnedByYouDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyOwnedByYou: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyOwnedByYou = js.native
}

