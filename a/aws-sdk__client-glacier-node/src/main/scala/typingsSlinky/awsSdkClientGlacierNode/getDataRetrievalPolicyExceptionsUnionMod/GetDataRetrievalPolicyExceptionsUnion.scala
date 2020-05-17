package typingsSlinky.awsSdkClientGlacierNode.getDataRetrievalPolicyExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait GetDataRetrievalPolicyExceptionsUnion extends js.Object

object GetDataRetrievalPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetDataRetrievalPolicyExceptionsUnion = value.asInstanceOf[GetDataRetrievalPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): GetDataRetrievalPolicyExceptionsUnion = value.asInstanceOf[GetDataRetrievalPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): GetDataRetrievalPolicyExceptionsUnion = value.asInstanceOf[GetDataRetrievalPolicyExceptionsUnion]
}

