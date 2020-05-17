package typingsSlinky.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
import typingsSlinky.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
import typingsSlinky.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
import typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientKinesisBrowser.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesInvalidArgumentExceptionMod.InvalidArgumentException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
*/
trait PutRecordExceptionsUnion extends js.Object

object PutRecordExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSAccessDeniedException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSDisabledException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSNotFoundException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSOptInRequired): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSThrottlingException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): PutRecordExceptionsUnion = value.asInstanceOf[PutRecordExceptionsUnion]
}

