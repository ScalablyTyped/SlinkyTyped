package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeFetch.nodeFetchStrings.omit
  - typingsSlinky.nodeFetch.nodeFetchStrings.include
  - typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin`
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsSlinky.nodeFetch.nodeFetchStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsSlinky.nodeFetch.nodeFetchStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin` = this.cast("same-origin")
}

