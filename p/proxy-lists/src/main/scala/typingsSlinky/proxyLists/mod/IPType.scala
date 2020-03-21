package typingsSlinky.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyLists.proxyListsStrings.ipv4
  - typingsSlinky.proxyLists.proxyListsStrings.ipv6
*/
trait IPType extends js.Object

object IPType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ipv4: typingsSlinky.proxyLists.proxyListsStrings.ipv4 = this.cast("ipv4")
  @scala.inline
  def ipv6: typingsSlinky.proxyLists.proxyListsStrings.ipv6 = this.cast("ipv6")
}

