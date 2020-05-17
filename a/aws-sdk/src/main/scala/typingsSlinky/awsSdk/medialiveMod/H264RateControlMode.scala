package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CBR
  - typingsSlinky.awsSdk.awsSdkStrings.MULTIPLEX
  - typingsSlinky.awsSdk.awsSdkStrings.QVBR
  - typingsSlinky.awsSdk.awsSdkStrings.VBR
  - java.lang.String
*/
trait H264RateControlMode extends js.Object

object H264RateControlMode {
  @scala.inline
  def CBR: typingsSlinky.awsSdk.awsSdkStrings.CBR = "CBR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CBR]
  @scala.inline
  def MULTIPLEX: typingsSlinky.awsSdk.awsSdkStrings.MULTIPLEX = "MULTIPLEX".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MULTIPLEX]
  @scala.inline
  def QVBR: typingsSlinky.awsSdk.awsSdkStrings.QVBR = "QVBR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QVBR]
  @scala.inline
  def VBR: typingsSlinky.awsSdk.awsSdkStrings.VBR = "VBR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VBR]
  @scala.inline
  implicit def apply(value: String): H264RateControlMode = value.asInstanceOf[H264RateControlMode]
}

