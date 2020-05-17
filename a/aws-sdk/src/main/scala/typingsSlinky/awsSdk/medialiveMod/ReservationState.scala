package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
trait ReservationState extends js.Object

object ReservationState {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  implicit def apply(value: String): ReservationState = value.asInstanceOf[ReservationState]
}

