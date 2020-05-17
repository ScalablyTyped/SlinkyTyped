package typingsSlinky.isomorphicUnfetch.mod.unfetch

import org.scalajs.dom.experimental.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Headers
  - typingsSlinky.nodeFetch.mod.Headers
*/
trait IsomorphicHeaders extends js.Object

object IsomorphicHeaders {
  @scala.inline
  implicit def apply(value: Headers): IsomorphicHeaders = value.asInstanceOf[IsomorphicHeaders]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodeFetch.mod.Headers): IsomorphicHeaders = value.asInstanceOf[IsomorphicHeaders]
}

