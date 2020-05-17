package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE
  - java.lang.String
*/
trait ImageStateChangeReasonCode extends js.Object

object ImageStateChangeReasonCode {
  @scala.inline
  def INTERNAL_ERROR: typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_ERROR]
  @scala.inline
  def IMAGE_BUILDER_NOT_AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE = "IMAGE_BUILDER_NOT_AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE]
  @scala.inline
  def IMAGE_COPY_FAILURE: typingsSlinky.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE = "IMAGE_COPY_FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE]
  @scala.inline
  implicit def apply(value: java.lang.String): ImageStateChangeReasonCode = value.asInstanceOf[ImageStateChangeReasonCode]
}

