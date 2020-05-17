package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_RESERVED
  - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_PREORDER
  - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE
  - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_PREMIUM
  - typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_RESTRICTED
  - typingsSlinky.awsSdk.awsSdkStrings.RESERVED
  - typingsSlinky.awsSdk.awsSdkStrings.DONT_KNOW
  - java.lang.String
*/
trait DomainAvailability extends js.Object

object DomainAvailability {
  @scala.inline
  def AVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE = "AVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE]
  @scala.inline
  def AVAILABLE_RESERVED: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_RESERVED = "AVAILABLE_RESERVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_RESERVED]
  @scala.inline
  def AVAILABLE_PREORDER: typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_PREORDER = "AVAILABLE_PREORDER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE_PREORDER]
  @scala.inline
  def UNAVAILABLE: typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE = "UNAVAILABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE]
  @scala.inline
  def UNAVAILABLE_PREMIUM: typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_PREMIUM = "UNAVAILABLE_PREMIUM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_PREMIUM]
  @scala.inline
  def UNAVAILABLE_RESTRICTED: typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_RESTRICTED = "UNAVAILABLE_RESTRICTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAVAILABLE_RESTRICTED]
  @scala.inline
  def RESERVED: typingsSlinky.awsSdk.awsSdkStrings.RESERVED = "RESERVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESERVED]
  @scala.inline
  def DONT_KNOW: typingsSlinky.awsSdk.awsSdkStrings.DONT_KNOW = "DONT_KNOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DONT_KNOW]
  @scala.inline
  implicit def apply(value: java.lang.String): DomainAvailability = value.asInstanceOf[DomainAvailability]
}

