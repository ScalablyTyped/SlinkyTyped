package typingsSlinky.awsSdkClientGlacierNode.setDataRetrievalPolicyExceptionsUnionMod

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
trait SetDataRetrievalPolicyExceptionsUnion extends js.Object

object SetDataRetrievalPolicyExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): SetDataRetrievalPolicyExceptionsUnion = value.asInstanceOf[SetDataRetrievalPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): SetDataRetrievalPolicyExceptionsUnion = value.asInstanceOf[SetDataRetrievalPolicyExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): SetDataRetrievalPolicyExceptionsUnion = value.asInstanceOf[SetDataRetrievalPolicyExceptionsUnion]
}

