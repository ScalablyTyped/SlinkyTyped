package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.REQUESTED
  - typingsSlinky.awsSdk.awsSdkStrings.OPEN
  - typingsSlinky.awsSdk.awsSdkStrings.CANCELED
  - typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED
  - typingsSlinky.awsSdk.awsSdkStrings.DECLINED
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
trait HandshakeState extends js.Object

object HandshakeState {
  @scala.inline
  def REQUESTED: typingsSlinky.awsSdk.awsSdkStrings.REQUESTED = "REQUESTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REQUESTED]
  @scala.inline
  def OPEN: typingsSlinky.awsSdk.awsSdkStrings.OPEN = "OPEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OPEN]
  @scala.inline
  def CANCELED: typingsSlinky.awsSdk.awsSdkStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCELED]
  @scala.inline
  def ACCEPTED: typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED = "ACCEPTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACCEPTED]
  @scala.inline
  def DECLINED: typingsSlinky.awsSdk.awsSdkStrings.DECLINED = "DECLINED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DECLINED]
  @scala.inline
  def EXPIRED: typingsSlinky.awsSdk.awsSdkStrings.EXPIRED = "EXPIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRED]
  @scala.inline
  implicit def apply(value: String): HandshakeState = value.asInstanceOf[HandshakeState]
}

