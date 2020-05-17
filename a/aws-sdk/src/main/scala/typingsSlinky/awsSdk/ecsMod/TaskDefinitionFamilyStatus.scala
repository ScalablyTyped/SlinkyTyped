package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.INACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
trait TaskDefinitionFamilyStatus extends js.Object

object TaskDefinitionFamilyStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def INACTIVE: typingsSlinky.awsSdk.awsSdkStrings.INACTIVE = "INACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACTIVE]
  @scala.inline
  def ALL: typingsSlinky.awsSdk.awsSdkStrings.ALL = "ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALL]
  @scala.inline
  implicit def apply(value: java.lang.String): TaskDefinitionFamilyStatus = value.asInstanceOf[TaskDefinitionFamilyStatus]
}

