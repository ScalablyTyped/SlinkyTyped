package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
  - typingsSlinky.awsSdk.awsSdkStrings.ERRORED
  - java.lang.String
*/
trait TestGridSessionStatus extends js.Object

object TestGridSessionStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def CLOSED: typingsSlinky.awsSdk.awsSdkStrings.CLOSED = "CLOSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CLOSED]
  @scala.inline
  def ERRORED: typingsSlinky.awsSdk.awsSdkStrings.ERRORED = "ERRORED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERRORED]
  @scala.inline
  implicit def apply(value: java.lang.String): TestGridSessionStatus = value.asInstanceOf[TestGridSessionStatus]
}

