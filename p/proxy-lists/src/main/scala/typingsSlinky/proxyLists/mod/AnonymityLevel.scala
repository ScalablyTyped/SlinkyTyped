package typingsSlinky.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyLists.proxyListsStrings.transparent
  - typingsSlinky.proxyLists.proxyListsStrings.anonymous
  - typingsSlinky.proxyLists.proxyListsStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typingsSlinky.proxyLists.proxyListsStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typingsSlinky.proxyLists.proxyListsStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typingsSlinky.proxyLists.proxyListsStrings.transparent = this.cast("transparent")
}

