package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
  - typingsSlinky.awsSdk.awsSdkStrings.REBUILDING
  - java.lang.String
*/
trait IndexStatus extends js.Object

object IndexStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def BUILDING: typingsSlinky.awsSdk.awsSdkStrings.BUILDING = "BUILDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BUILDING]
  @scala.inline
  def REBUILDING: typingsSlinky.awsSdk.awsSdkStrings.REBUILDING = "REBUILDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REBUILDING]
  @scala.inline
  implicit def apply(value: java.lang.String): IndexStatus = value.asInstanceOf[IndexStatus]
}

