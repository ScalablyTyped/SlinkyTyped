package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeFetch.nodeFetchStrings.basic
  - typingsSlinky.nodeFetch.nodeFetchStrings.cors
  - typingsSlinky.nodeFetch.nodeFetchStrings.default
  - typingsSlinky.nodeFetch.nodeFetchStrings.error
  - typingsSlinky.nodeFetch.nodeFetchStrings.opaque
  - typingsSlinky.nodeFetch.nodeFetchStrings.opaqueredirect
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def basic: typingsSlinky.nodeFetch.nodeFetchStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsSlinky.nodeFetch.nodeFetchStrings.cors = this.cast("cors")
  @scala.inline
  def default: typingsSlinky.nodeFetch.nodeFetchStrings.default = this.cast("default")
  @scala.inline
  def error: typingsSlinky.nodeFetch.nodeFetchStrings.error = this.cast("error")
  @scala.inline
  def opaque: typingsSlinky.nodeFetch.nodeFetchStrings.opaque = this.cast("opaque")
  @scala.inline
  def opaqueredirect: typingsSlinky.nodeFetch.nodeFetchStrings.opaqueredirect = this.cast("opaqueredirect")
}

