package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeFetch.nodeFetchStrings.error
  - typingsSlinky.nodeFetch.nodeFetchStrings.follow
  - typingsSlinky.nodeFetch.nodeFetchStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.nodeFetch.nodeFetchStrings.error = this.cast("error")
  @scala.inline
  def follow: typingsSlinky.nodeFetch.nodeFetchStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typingsSlinky.nodeFetch.nodeFetchStrings.manual = this.cast("manual")
}

