package typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyExistsMod

import typingsSlinky.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAlreadyExists
  extends ServiceException[BucketAlreadyExistsDetails]
     with CreateBucketExceptionsUnion {
  @JSName("name")
  var name_BucketAlreadyExists: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists = js.native
}

