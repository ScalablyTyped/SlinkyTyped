package typingsSlinky.awsSdkClientKmsNode.describeKeyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsNode.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsNode.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsNode.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsNode.typesKmsinternalexceptionMod.KMSInternalException
*/
trait DescribeKeyExceptionsUnion extends js.Object

object DescribeKeyExceptionsUnion {
  @scala.inline
  implicit def apply(value: DependencyTimeoutException): DescribeKeyExceptionsUnion = value.asInstanceOf[DescribeKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArnException): DescribeKeyExceptionsUnion = value.asInstanceOf[DescribeKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInternalException): DescribeKeyExceptionsUnion = value.asInstanceOf[DescribeKeyExceptionsUnion]
  @scala.inline
  implicit def apply(value: NotFoundException): DescribeKeyExceptionsUnion = value.asInstanceOf[DescribeKeyExceptionsUnion]
}

