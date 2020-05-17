package typingsSlinky.awsSdkClientS3Node.createBucketExceptionsUnionMod

import typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists
import typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyExistsMod.BucketAlreadyExists
  - typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
*/
trait CreateBucketExceptionsUnion extends js.Object

object CreateBucketExceptionsUnion {
  @scala.inline
  implicit def apply(value: BucketAlreadyExists): CreateBucketExceptionsUnion = value.asInstanceOf[CreateBucketExceptionsUnion]
  @scala.inline
  implicit def apply(value: BucketAlreadyOwnedByYou): CreateBucketExceptionsUnion = value.asInstanceOf[CreateBucketExceptionsUnion]
}

