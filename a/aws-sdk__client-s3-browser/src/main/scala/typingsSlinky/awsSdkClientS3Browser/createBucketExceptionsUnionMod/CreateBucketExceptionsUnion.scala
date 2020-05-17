package typingsSlinky.awsSdkClientS3Browser.createBucketExceptionsUnionMod

import typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists
import typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists
  - typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
*/
trait CreateBucketExceptionsUnion extends js.Object

object CreateBucketExceptionsUnion {
  @scala.inline
  implicit def apply(value: BucketAlreadyExists): CreateBucketExceptionsUnion = value.asInstanceOf[CreateBucketExceptionsUnion]
  @scala.inline
  implicit def apply(value: BucketAlreadyOwnedByYou): CreateBucketExceptionsUnion = value.asInstanceOf[CreateBucketExceptionsUnion]
}

