package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ipv4_
  - typingsSlinky.awsSdk.awsSdkStrings.ipv6_
  - java.lang.String
*/
trait AddressFamily extends js.Object

object AddressFamily {
  @scala.inline
  def ipv4_ : typingsSlinky.awsSdk.awsSdkStrings.ipv4_ = "ipv4".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ipv4_]
  @scala.inline
  def ipv6_ : typingsSlinky.awsSdk.awsSdkStrings.ipv6_ = "ipv6".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ipv6_]
  @scala.inline
  implicit def apply(value: String): AddressFamily = value.asInstanceOf[AddressFamily]
}

