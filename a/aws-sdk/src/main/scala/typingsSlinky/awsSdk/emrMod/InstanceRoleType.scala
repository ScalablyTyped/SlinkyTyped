package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MASTER
  - typingsSlinky.awsSdk.awsSdkStrings.CORE
  - typingsSlinky.awsSdk.awsSdkStrings.TASK
  - java.lang.String
*/
trait InstanceRoleType extends js.Object

object InstanceRoleType {
  @scala.inline
  def MASTER: typingsSlinky.awsSdk.awsSdkStrings.MASTER = "MASTER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MASTER]
  @scala.inline
  def CORE: typingsSlinky.awsSdk.awsSdkStrings.CORE = "CORE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CORE]
  @scala.inline
  def TASK: typingsSlinky.awsSdk.awsSdkStrings.TASK = "TASK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TASK]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceRoleType = value.asInstanceOf[InstanceRoleType]
}

