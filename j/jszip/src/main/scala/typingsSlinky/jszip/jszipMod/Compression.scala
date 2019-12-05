package typingsSlinky.jszip.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jszip.jszipStrings.STORE
  - typings.jszip.jszipStrings.DEFLATE
*/
trait Compression extends js.Object

object Compression {
  @scala.inline
  def DEFLATE: typingsSlinky.jszip.jszipStrings.DEFLATE = this.cast("DEFLATE")
  @scala.inline
  def STORE: typingsSlinky.jszip.jszipStrings.STORE = this.cast("STORE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

