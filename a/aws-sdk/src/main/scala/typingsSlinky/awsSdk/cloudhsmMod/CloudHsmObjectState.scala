package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - typingsSlinky.awsSdk.awsSdkStrings.DEGRADED
  - java.lang.String
*/
trait CloudHsmObjectState extends js.Object

object CloudHsmObjectState {
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  def DEGRADED: typingsSlinky.awsSdk.awsSdkStrings.DEGRADED = "DEGRADED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEGRADED]
  @scala.inline
  implicit def apply(value: java.lang.String): CloudHsmObjectState = value.asInstanceOf[CloudHsmObjectState]
}

