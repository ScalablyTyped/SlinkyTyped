package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
  - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
  - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
trait HandshakePartyType extends js.Object

object HandshakePartyType {
  @scala.inline
  def ACCOUNT: typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT = "ACCOUNT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT]
  @scala.inline
  def ORGANIZATION: typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION = "ORGANIZATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION]
  @scala.inline
  def EMAIL: typingsSlinky.awsSdk.awsSdkStrings.EMAIL = "EMAIL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EMAIL]
  @scala.inline
  implicit def apply(value: String): HandshakePartyType = value.asInstanceOf[HandshakePartyType]
}

