package typingsSlinky.pulumiAws.protocolTypeMod

import typingsSlinky.pulumiAws.pulumiAwsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.all_
  - typingsSlinky.pulumiAws.pulumiAwsStrings.icmp
  - typingsSlinky.pulumiAws.pulumiAwsStrings.tcp
  - typingsSlinky.pulumiAws.pulumiAwsStrings.udp
*/
trait ProtocolType extends js.Object

object ProtocolType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def icmp: typingsSlinky.pulumiAws.pulumiAwsStrings.icmp = this.cast("icmp")
  @scala.inline
  def tcp: typingsSlinky.pulumiAws.pulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsSlinky.pulumiAws.pulumiAwsStrings.udp = this.cast("udp")
}

