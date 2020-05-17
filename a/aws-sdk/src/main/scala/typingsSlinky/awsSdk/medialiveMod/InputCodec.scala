package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MPEG2
  - typingsSlinky.awsSdk.awsSdkStrings.AVC
  - typingsSlinky.awsSdk.awsSdkStrings.HEVC
  - java.lang.String
*/
trait InputCodec extends js.Object

object InputCodec {
  @scala.inline
  def MPEG2: typingsSlinky.awsSdk.awsSdkStrings.MPEG2 = "MPEG2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MPEG2]
  @scala.inline
  def AVC: typingsSlinky.awsSdk.awsSdkStrings.AVC = "AVC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVC]
  @scala.inline
  def HEVC: typingsSlinky.awsSdk.awsSdkStrings.HEVC = "HEVC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HEVC]
  @scala.inline
  implicit def apply(value: String): InputCodec = value.asInstanceOf[InputCodec]
}

