package typingsSlinky.awsSdkClientKmsBrowser.describeKeyExceptionsUnionMod

import typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
import typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
import typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
import typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKmsBrowser.typesNotFoundExceptionMod.NotFoundException
  - typingsSlinky.awsSdkClientKmsBrowser.typesInvalidArnExceptionMod.InvalidArnException
  - typingsSlinky.awsSdkClientKmsBrowser.typesDependencyTimeoutExceptionMod.DependencyTimeoutException
  - typingsSlinky.awsSdkClientKmsBrowser.typesKmsinternalexceptionMod.KMSInternalException
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

