package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - typingsSlinky.awsSdk.awsSdkStrings.FAILURE
  - java.lang.String
*/
trait ResourceSignalStatus extends js.Object

object ResourceSignalStatus {
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  def FAILURE: typingsSlinky.awsSdk.awsSdkStrings.FAILURE = "FAILURE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILURE]
  @scala.inline
  implicit def apply(value: String): ResourceSignalStatus = value.asInstanceOf[ResourceSignalStatus]
}

