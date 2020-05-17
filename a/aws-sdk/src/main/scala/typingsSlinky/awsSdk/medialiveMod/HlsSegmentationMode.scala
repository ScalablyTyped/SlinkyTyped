package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.USE_INPUT_SEGMENTATION
  - typingsSlinky.awsSdk.awsSdkStrings.USE_SEGMENT_DURATION
  - java.lang.String
*/
trait HlsSegmentationMode extends js.Object

object HlsSegmentationMode {
  @scala.inline
  def USE_INPUT_SEGMENTATION: typingsSlinky.awsSdk.awsSdkStrings.USE_INPUT_SEGMENTATION = "USE_INPUT_SEGMENTATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USE_INPUT_SEGMENTATION]
  @scala.inline
  def USE_SEGMENT_DURATION: typingsSlinky.awsSdk.awsSdkStrings.USE_SEGMENT_DURATION = "USE_SEGMENT_DURATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USE_SEGMENT_DURATION]
  @scala.inline
  implicit def apply(value: String): HlsSegmentationMode = value.asInstanceOf[HlsSegmentationMode]
}

