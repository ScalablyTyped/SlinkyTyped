package typingsSlinky.atPulumiAws.ecsContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.tcp
  - typings.atPulumiAws.atPulumiAwsStrings.udp
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsSlinky.atPulumiAws.atPulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsSlinky.atPulumiAws.atPulumiAwsStrings.udp = this.cast("udp")
}

