package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeFetch.nodeFetchStrings.cors
  - typingsSlinky.nodeFetch.nodeFetchStrings.`no-cors`
  - typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin`
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsSlinky.nodeFetch.nodeFetchStrings.cors = this.cast("cors")
  @scala.inline
  def `no-cors`: typingsSlinky.nodeFetch.nodeFetchStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin` = this.cast("same-origin")
}

