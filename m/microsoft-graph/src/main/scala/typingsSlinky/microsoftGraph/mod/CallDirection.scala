package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.incoming
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.outgoing
*/
trait CallDirection extends js.Object

object CallDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incoming: typingsSlinky.microsoftGraph.microsoftGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def outgoing: typingsSlinky.microsoftGraph.microsoftGraphStrings.outgoing = this.cast("outgoing")
}

