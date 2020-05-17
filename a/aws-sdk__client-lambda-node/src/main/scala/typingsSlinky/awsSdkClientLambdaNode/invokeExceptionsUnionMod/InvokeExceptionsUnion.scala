package typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod

import typingsSlinky.awsSdkClientLambdaNode.typesEc2accessdeniedexceptionMod.EC2AccessDeniedException
import typingsSlinky.awsSdkClientLambdaNode.typesEc2throttledexceptionMod.EC2ThrottledException
import typingsSlinky.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod.EC2UnexpectedException
import typingsSlinky.awsSdkClientLambdaNode.typesEnilimitreachedexceptionMod.ENILimitReachedException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidSecurityGroupIDExceptionMod.InvalidSecurityGroupIDException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod.InvalidSubnetIDException
import typingsSlinky.awsSdkClientLambdaNode.typesInvalidZipFileExceptionMod.InvalidZipFileException
import typingsSlinky.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
import typingsSlinky.awsSdkClientLambdaNode.typesKmsdisabledexceptionMod.KMSDisabledException
import typingsSlinky.awsSdkClientLambdaNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientLambdaNode.typesKmsnotfoundexceptionMod.KMSNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod.RequestTooLargeException
import typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
import typingsSlinky.awsSdkClientLambdaNode.typesSubnetIPAddressLimitReachedExceptionMod.SubnetIPAddressLimitReachedException
import typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
import typingsSlinky.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod.UnsupportedMediaTypeException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
  - typingsSlinky.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
  - typingsSlinky.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod.RequestTooLargeException
  - typingsSlinky.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod.UnsupportedMediaTypeException
  - typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod.EC2UnexpectedException
  - typingsSlinky.awsSdkClientLambdaNode.typesSubnetIPAddressLimitReachedExceptionMod.SubnetIPAddressLimitReachedException
  - typingsSlinky.awsSdkClientLambdaNode.typesEnilimitreachedexceptionMod.ENILimitReachedException
  - typingsSlinky.awsSdkClientLambdaNode.typesEc2throttledexceptionMod.EC2ThrottledException
  - typingsSlinky.awsSdkClientLambdaNode.typesEc2accessdeniedexceptionMod.EC2AccessDeniedException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod.InvalidSubnetIDException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidSecurityGroupIDExceptionMod.InvalidSecurityGroupIDException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidZipFileExceptionMod.InvalidZipFileException
  - typingsSlinky.awsSdkClientLambdaNode.typesKmsdisabledexceptionMod.KMSDisabledException
  - typingsSlinky.awsSdkClientLambdaNode.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
  - typingsSlinky.awsSdkClientLambdaNode.typesKmsnotfoundexceptionMod.KMSNotFoundException
  - typingsSlinky.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
*/
trait InvokeExceptionsUnion extends js.Object

object InvokeExceptionsUnion {
  @scala.inline
  implicit def apply(value: EC2AccessDeniedException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: EC2ThrottledException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: EC2UnexpectedException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: ENILimitReachedException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidRequestContentException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidRuntimeException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidSecurityGroupIDException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidSubnetIDException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidZipFileException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSAccessDeniedException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSDisabledException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSNotFoundException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: RequestTooLargeException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: SubnetIPAddressLimitReachedException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: TooManyRequestsException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
  @scala.inline
  implicit def apply(value: UnsupportedMediaTypeException): InvokeExceptionsUnion = value.asInstanceOf[InvokeExceptionsUnion]
}

