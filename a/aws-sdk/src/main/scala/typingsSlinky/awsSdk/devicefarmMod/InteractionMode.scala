package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INTERACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.NO_VIDEO
  - typingsSlinky.awsSdk.awsSdkStrings.VIDEO_ONLY
  - java.lang.String
*/
trait InteractionMode extends js.Object

object InteractionMode {
  @scala.inline
  def INTERACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INTERACTIVE = "INTERACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTERACTIVE]
  @scala.inline
  def NO_VIDEO: typingsSlinky.awsSdk.awsSdkStrings.NO_VIDEO = "NO_VIDEO".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NO_VIDEO]
  @scala.inline
  def VIDEO_ONLY: typingsSlinky.awsSdk.awsSdkStrings.VIDEO_ONLY = "VIDEO_ONLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VIDEO_ONLY]
  @scala.inline
  implicit def apply(value: java.lang.String): InteractionMode = value.asInstanceOf[InteractionMode]
}

