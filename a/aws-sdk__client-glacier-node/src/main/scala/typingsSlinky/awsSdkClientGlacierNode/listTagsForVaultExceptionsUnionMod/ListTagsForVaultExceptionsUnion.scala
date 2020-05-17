package typingsSlinky.awsSdkClientGlacierNode.listTagsForVaultExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait ListTagsForVaultExceptionsUnion extends js.Object

object ListTagsForVaultExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListTagsForVaultExceptionsUnion = value.asInstanceOf[ListTagsForVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): ListTagsForVaultExceptionsUnion = value.asInstanceOf[ListTagsForVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListTagsForVaultExceptionsUnion = value.asInstanceOf[ListTagsForVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): ListTagsForVaultExceptionsUnion = value.asInstanceOf[ListTagsForVaultExceptionsUnion]
}

