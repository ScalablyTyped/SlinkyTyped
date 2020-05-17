package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IPV4
  - typingsSlinky.awsSdk.awsSdkStrings.IPV6
  - java.lang.String
*/
trait IPAddressVersion extends js.Object

object IPAddressVersion {
  @scala.inline
  def IPV4: typingsSlinky.awsSdk.awsSdkStrings.IPV4 = "IPV4".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IPV4]
  @scala.inline
  def IPV6: typingsSlinky.awsSdk.awsSdkStrings.IPV6 = "IPV6".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IPV6]
  @scala.inline
  implicit def apply(value: String): IPAddressVersion = value.asInstanceOf[IPAddressVersion]
}

