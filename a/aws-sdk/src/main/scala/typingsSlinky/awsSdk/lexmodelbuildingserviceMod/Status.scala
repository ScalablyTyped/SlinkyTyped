package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.READY_BASIC_TESTING
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_BUILT
  - java.lang.String
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def BUILDING: typingsSlinky.awsSdk.awsSdkStrings.BUILDING = "BUILDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BUILDING]
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def READY_BASIC_TESTING: typingsSlinky.awsSdk.awsSdkStrings.READY_BASIC_TESTING = "READY_BASIC_TESTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY_BASIC_TESTING]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def NOT_BUILT: typingsSlinky.awsSdk.awsSdkStrings.NOT_BUILT = "NOT_BUILT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_BUILT]
  @scala.inline
  implicit def apply(value: java.lang.String): Status = value.asInstanceOf[Status]
}

