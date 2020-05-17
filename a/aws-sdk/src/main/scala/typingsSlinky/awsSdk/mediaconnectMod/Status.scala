package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STANDBY
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.STARTING
  - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def STANDBY: typingsSlinky.awsSdk.awsSdkStrings.STANDBY = "STANDBY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STANDBY]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def STARTING: typingsSlinky.awsSdk.awsSdkStrings.STARTING = "STARTING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTING]
  @scala.inline
  def STOPPING: typingsSlinky.awsSdk.awsSdkStrings.STOPPING = "STOPPING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STOPPING]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  implicit def apply(value: String): Status = value.asInstanceOf[Status]
}

