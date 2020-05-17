package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VBR
  - typingsSlinky.awsSdk.awsSdkStrings.CBR
  - typingsSlinky.awsSdk.awsSdkStrings.QVBR
  - java.lang.String
*/
trait H265RateControlMode extends js.Object

object H265RateControlMode {
  @scala.inline
  def VBR: typingsSlinky.awsSdk.awsSdkStrings.VBR = "VBR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VBR]
  @scala.inline
  def CBR: typingsSlinky.awsSdk.awsSdkStrings.CBR = "CBR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CBR]
  @scala.inline
  def QVBR: typingsSlinky.awsSdk.awsSdkStrings.QVBR = "QVBR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QVBR]
  @scala.inline
  implicit def apply(value: String): H265RateControlMode = value.asInstanceOf[H265RateControlMode]
}

