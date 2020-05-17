package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EXCLUDE_LAST_FRAME
  - typingsSlinky.awsSdk.awsSdkStrings.INCLUDE_LAST_FRAME
  - java.lang.String
*/
trait LastFrameClippingBehavior extends js.Object

object LastFrameClippingBehavior {
  @scala.inline
  def EXCLUDE_LAST_FRAME: typingsSlinky.awsSdk.awsSdkStrings.EXCLUDE_LAST_FRAME = "EXCLUDE_LAST_FRAME".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXCLUDE_LAST_FRAME]
  @scala.inline
  def INCLUDE_LAST_FRAME: typingsSlinky.awsSdk.awsSdkStrings.INCLUDE_LAST_FRAME = "INCLUDE_LAST_FRAME".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INCLUDE_LAST_FRAME]
  @scala.inline
  implicit def apply(value: String): LastFrameClippingBehavior = value.asInstanceOf[LastFrameClippingBehavior]
}

