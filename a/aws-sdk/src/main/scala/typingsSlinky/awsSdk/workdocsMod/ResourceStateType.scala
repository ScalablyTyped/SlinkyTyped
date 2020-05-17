package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.RESTORING
  - typingsSlinky.awsSdk.awsSdkStrings.RECYCLING
  - typingsSlinky.awsSdk.awsSdkStrings.RECYCLED
  - java.lang.String
*/
trait ResourceStateType extends js.Object

object ResourceStateType {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def RESTORING: typingsSlinky.awsSdk.awsSdkStrings.RESTORING = "RESTORING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESTORING]
  @scala.inline
  def RECYCLING: typingsSlinky.awsSdk.awsSdkStrings.RECYCLING = "RECYCLING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RECYCLING]
  @scala.inline
  def RECYCLED: typingsSlinky.awsSdk.awsSdkStrings.RECYCLED = "RECYCLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RECYCLED]
  @scala.inline
  implicit def apply(value: String): ResourceStateType = value.asInstanceOf[ResourceStateType]
}

