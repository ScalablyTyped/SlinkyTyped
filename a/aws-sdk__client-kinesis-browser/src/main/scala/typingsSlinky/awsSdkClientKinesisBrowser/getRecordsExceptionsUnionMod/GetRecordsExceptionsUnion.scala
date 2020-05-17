package typingsSlinky.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod

import typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredIteratorExceptionMod.ExpiredIteratorException
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
  - typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredIteratorExceptionMod.ExpiredIteratorException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsdisabledexceptionMod.KMSDisabledException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsinvalidstateexceptionMod.KMSInvalidStateException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsaccessdeniedexceptionMod.KMSAccessDeniedException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsnotfoundexceptionMod.KMSNotFoundException
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsoptinrequiredMod.KMSOptInRequired
  - typingsSlinky.awsSdkClientKinesisBrowser.typesKmsthrottlingexceptionMod.KMSThrottlingException
*/
trait GetRecordsExceptionsUnion extends js.Object

object GetRecordsExceptionsUnion {
  @scala.inline
  implicit def apply(value: ExpiredIteratorException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: InvalidArgumentException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSAccessDeniedException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSDisabledException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSInvalidStateException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSNotFoundException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSOptInRequired): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: KMSThrottlingException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ProvisionedThroughputExceededException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetRecordsExceptionsUnion = value.asInstanceOf[GetRecordsExceptionsUnion]
}

