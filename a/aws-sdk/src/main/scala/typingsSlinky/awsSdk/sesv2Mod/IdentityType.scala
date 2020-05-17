package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EMAIL_ADDRESS
  - typingsSlinky.awsSdk.awsSdkStrings.DOMAIN
  - typingsSlinky.awsSdk.awsSdkStrings.MANAGED_DOMAIN
  - java.lang.String
*/
trait IdentityType extends js.Object

object IdentityType {
  @scala.inline
  def EMAIL_ADDRESS: typingsSlinky.awsSdk.awsSdkStrings.EMAIL_ADDRESS = "EMAIL_ADDRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EMAIL_ADDRESS]
  @scala.inline
  def DOMAIN: typingsSlinky.awsSdk.awsSdkStrings.DOMAIN = "DOMAIN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DOMAIN]
  @scala.inline
  def MANAGED_DOMAIN: typingsSlinky.awsSdk.awsSdkStrings.MANAGED_DOMAIN = "MANAGED_DOMAIN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MANAGED_DOMAIN]
  @scala.inline
  implicit def apply(value: String): IdentityType = value.asInstanceOf[IdentityType]
}

