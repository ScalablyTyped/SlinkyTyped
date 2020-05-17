package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PASS
  - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PASS_HQ
  - typingsSlinky.awsSdk.awsSdkStrings.MULTI_PASS_HQ
  - java.lang.String
*/
trait H265QualityTuningLevel extends js.Object

object H265QualityTuningLevel {
  @scala.inline
  def SINGLE_PASS: typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PASS = "SINGLE_PASS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PASS]
  @scala.inline
  def SINGLE_PASS_HQ: typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PASS_HQ = "SINGLE_PASS_HQ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PASS_HQ]
  @scala.inline
  def MULTI_PASS_HQ: typingsSlinky.awsSdk.awsSdkStrings.MULTI_PASS_HQ = "MULTI_PASS_HQ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MULTI_PASS_HQ]
  @scala.inline
  implicit def apply(value: String): H265QualityTuningLevel = value.asInstanceOf[H265QualityTuningLevel]
}

