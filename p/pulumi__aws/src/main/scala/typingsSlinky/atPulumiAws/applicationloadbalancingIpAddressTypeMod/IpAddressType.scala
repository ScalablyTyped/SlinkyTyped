package typingsSlinky.atPulumiAws.applicationloadbalancingIpAddressTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.ipv4
  - typings.atPulumiAws.atPulumiAwsStrings.dualstack
*/
trait IpAddressType extends js.Object

object IpAddressType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dualstack: typingsSlinky.atPulumiAws.atPulumiAwsStrings.dualstack = this.cast("dualstack")
  @scala.inline
  def ipv4: typingsSlinky.atPulumiAws.atPulumiAwsStrings.ipv4 = this.cast("ipv4")
}

