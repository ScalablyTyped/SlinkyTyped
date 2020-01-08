package typingsSlinky.atPulumiAws.ec2ProtocolTypeMod

import typingsSlinky.atPulumiAws.atPulumiAwsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.all_
  - typings.atPulumiAws.atPulumiAwsStrings.icmp
  - typings.atPulumiAws.atPulumiAwsStrings.tcp
  - typings.atPulumiAws.atPulumiAwsStrings.udp
*/
trait ProtocolType extends js.Object

object ProtocolType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def icmp: typingsSlinky.atPulumiAws.atPulumiAwsStrings.icmp = this.cast("icmp")
  @scala.inline
  def tcp: typingsSlinky.atPulumiAws.atPulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsSlinky.atPulumiAws.atPulumiAwsStrings.udp = this.cast("udp")
}

