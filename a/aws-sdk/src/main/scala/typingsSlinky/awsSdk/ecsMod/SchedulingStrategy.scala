package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.REPLICA
  - typingsSlinky.awsSdk.awsSdkStrings.DAEMON
  - java.lang.String
*/
trait SchedulingStrategy extends js.Object

object SchedulingStrategy {
  @scala.inline
  def REPLICA: typingsSlinky.awsSdk.awsSdkStrings.REPLICA = "REPLICA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REPLICA]
  @scala.inline
  def DAEMON: typingsSlinky.awsSdk.awsSdkStrings.DAEMON = "DAEMON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DAEMON]
  @scala.inline
  implicit def apply(value: java.lang.String): SchedulingStrategy = value.asInstanceOf[SchedulingStrategy]
}

