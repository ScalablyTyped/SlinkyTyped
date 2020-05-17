package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
trait EntityState extends js.Object

object EntityState {
  @scala.inline
  def ENABLED: typingsSlinky.awsSdk.awsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLED]
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  implicit def apply(value: java.lang.String): EntityState = value.asInstanceOf[EntityState]
}

