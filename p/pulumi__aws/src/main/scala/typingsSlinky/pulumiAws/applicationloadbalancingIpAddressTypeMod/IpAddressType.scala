package typingsSlinky.pulumiAws.applicationloadbalancingIpAddressTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4
  - typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack
*/
trait IpAddressType extends js.Object

object IpAddressType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dualstack: typingsSlinky.pulumiAws.pulumiAwsStrings.dualstack = this.cast("dualstack")
  @scala.inline
  def ipv4: typingsSlinky.pulumiAws.pulumiAwsStrings.ipv4 = this.cast("ipv4")
}

