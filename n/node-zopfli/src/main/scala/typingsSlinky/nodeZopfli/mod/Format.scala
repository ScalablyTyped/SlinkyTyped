package typingsSlinky.nodeZopfli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZopfli.nodeZopfliStrings.deflate
  - typingsSlinky.nodeZopfli.nodeZopfliStrings.gzip
  - typingsSlinky.nodeZopfli.nodeZopfliStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsSlinky.nodeZopfli.nodeZopfliStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typingsSlinky.nodeZopfli.nodeZopfliStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typingsSlinky.nodeZopfli.nodeZopfliStrings.zlib = this.cast("zlib")
}

