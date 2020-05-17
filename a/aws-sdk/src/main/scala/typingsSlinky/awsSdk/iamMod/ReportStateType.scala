package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STARTED
  - typingsSlinky.awsSdk.awsSdkStrings.INPROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETE
  - java.lang.String
*/
trait ReportStateType extends js.Object

object ReportStateType {
  @scala.inline
  def STARTED: typingsSlinky.awsSdk.awsSdkStrings.STARTED = "STARTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTED]
  @scala.inline
  def INPROGRESS: typingsSlinky.awsSdk.awsSdkStrings.INPROGRESS = "INPROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INPROGRESS]
  @scala.inline
  def COMPLETE: typingsSlinky.awsSdk.awsSdkStrings.COMPLETE = "COMPLETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETE]
  @scala.inline
  implicit def apply(value: String): ReportStateType = value.asInstanceOf[ReportStateType]
}

