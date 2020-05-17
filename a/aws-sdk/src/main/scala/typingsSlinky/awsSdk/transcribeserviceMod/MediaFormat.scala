package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.mp3_
  - typingsSlinky.awsSdk.awsSdkStrings.mp4_
  - typingsSlinky.awsSdk.awsSdkStrings.wav_
  - typingsSlinky.awsSdk.awsSdkStrings.flac
  - java.lang.String
*/
trait MediaFormat extends js.Object

object MediaFormat {
  @scala.inline
  def mp3_ : typingsSlinky.awsSdk.awsSdkStrings.mp3_ = "mp3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.mp3_]
  @scala.inline
  def mp4_ : typingsSlinky.awsSdk.awsSdkStrings.mp4_ = "mp4".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.mp4_]
  @scala.inline
  def wav_ : typingsSlinky.awsSdk.awsSdkStrings.wav_ = "wav".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.wav_]
  @scala.inline
  def flac: typingsSlinky.awsSdk.awsSdkStrings.flac = "flac".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.flac]
  @scala.inline
  implicit def apply(value: String): MediaFormat = value.asInstanceOf[MediaFormat]
}

