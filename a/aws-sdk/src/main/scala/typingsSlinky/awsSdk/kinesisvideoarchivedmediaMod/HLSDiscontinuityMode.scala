package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
  - typingsSlinky.awsSdk.awsSdkStrings.NEVER
  - typingsSlinky.awsSdk.awsSdkStrings.ON_DISCONTINUITY
  - java.lang.String
*/
trait HLSDiscontinuityMode extends js.Object

object HLSDiscontinuityMode {
  @scala.inline
  def ALWAYS: typingsSlinky.awsSdk.awsSdkStrings.ALWAYS = "ALWAYS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALWAYS]
  @scala.inline
  def NEVER: typingsSlinky.awsSdk.awsSdkStrings.NEVER = "NEVER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEVER]
  @scala.inline
  def ON_DISCONTINUITY: typingsSlinky.awsSdk.awsSdkStrings.ON_DISCONTINUITY = "ON_DISCONTINUITY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ON_DISCONTINUITY]
  @scala.inline
  implicit def apply(value: java.lang.String): HLSDiscontinuityMode = value.asInstanceOf[HLSDiscontinuityMode]
}

