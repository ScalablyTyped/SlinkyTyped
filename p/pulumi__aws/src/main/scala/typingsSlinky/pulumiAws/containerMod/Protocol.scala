package typingsSlinky.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.tcp
  - typingsSlinky.pulumiAws.pulumiAwsStrings.udp
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsSlinky.pulumiAws.pulumiAwsStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsSlinky.pulumiAws.pulumiAwsStrings.udp = this.cast("udp")
}

