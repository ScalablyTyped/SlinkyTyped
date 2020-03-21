package typingsSlinky.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeFetch.nodeFetchStrings.default
  - typingsSlinky.nodeFetch.nodeFetchStrings.`force-cache`
  - typingsSlinky.nodeFetch.nodeFetchStrings.`no-cache`
  - typingsSlinky.nodeFetch.nodeFetchStrings.`no-store`
  - typingsSlinky.nodeFetch.nodeFetchStrings.`only-if-cached`
  - typingsSlinky.nodeFetch.nodeFetchStrings.reload
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.nodeFetch.nodeFetchStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typingsSlinky.nodeFetch.nodeFetchStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typingsSlinky.nodeFetch.nodeFetchStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typingsSlinky.nodeFetch.nodeFetchStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typingsSlinky.nodeFetch.nodeFetchStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typingsSlinky.nodeFetch.nodeFetchStrings.reload = this.cast("reload")
}

