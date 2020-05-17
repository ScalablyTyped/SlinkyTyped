package typingsSlinky.awsSdkClientKinesisBrowser.startStreamEncryptionExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
import typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceInUseExceptionMod.ResourceInUseException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
*/
trait StartStreamEncryptionExceptionsUnion extends js.Object

object StartStreamEncryptionExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSAccessDeniedException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSDisabledException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSNotFoundException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSOptInRequired): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSThrottlingException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceInUseException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): StartStreamEncryptionExceptionsUnion = value.asInstanceOf[StartStreamEncryptionExceptionsUnion]
}

