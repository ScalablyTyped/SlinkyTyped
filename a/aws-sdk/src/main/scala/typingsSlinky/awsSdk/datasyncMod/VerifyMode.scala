package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT
  - typingsSlinky.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
trait VerifyMode extends js.Object

object VerifyMode {
  @scala.inline
  def POINT_IN_TIME_CONSISTENT: typingsSlinky.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT = "POINT_IN_TIME_CONSISTENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.POINT_IN_TIME_CONSISTENT]
  @scala.inline
  def ONLY_FILES_TRANSFERRED: typingsSlinky.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED = "ONLY_FILES_TRANSFERRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ONLY_FILES_TRANSFERRED]
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  implicit def apply(value: String): VerifyMode = value.asInstanceOf[VerifyMode]
}

