package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NoProtection
  - typingsSlinky.awsSdk.awsSdkStrings.FullProtection
  - java.lang.String
*/
trait ProtectionPolicy extends js.Object

object ProtectionPolicy {
  @scala.inline
  def NoProtection: typingsSlinky.awsSdk.awsSdkStrings.NoProtection = "NoProtection".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NoProtection]
  @scala.inline
  def FullProtection: typingsSlinky.awsSdk.awsSdkStrings.FullProtection = "FullProtection".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FullProtection]
  @scala.inline
  implicit def apply(value: String): ProtectionPolicy = value.asInstanceOf[ProtectionPolicy]
}

