package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PROBING
  - typingsSlinky.awsSdk.awsSdkStrings.TRANSCODING
  - typingsSlinky.awsSdk.awsSdkStrings.UPLOADING
  - java.lang.String
*/
trait JobPhase extends js.Object

object JobPhase {
  @scala.inline
  def PROBING: typingsSlinky.awsSdk.awsSdkStrings.PROBING = "PROBING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROBING]
  @scala.inline
  def TRANSCODING: typingsSlinky.awsSdk.awsSdkStrings.TRANSCODING = "TRANSCODING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRANSCODING]
  @scala.inline
  def UPLOADING: typingsSlinky.awsSdk.awsSdkStrings.UPLOADING = "UPLOADING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPLOADING]
  @scala.inline
  implicit def apply(value: String): JobPhase = value.asInstanceOf[JobPhase]
}

