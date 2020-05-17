package typingsSlinky.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod

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
trait PutRecordsExceptionsUnion extends js.Object

object PutRecordsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidArgumentException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSAccessDeniedException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSDisabledException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSNotFoundException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSOptInRequired): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSThrottlingException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): PutRecordsExceptionsUnion = value.asInstanceOf[PutRecordsExceptionsUnion]
}

