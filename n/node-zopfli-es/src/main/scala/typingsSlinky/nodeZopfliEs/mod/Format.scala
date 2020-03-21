package typingsSlinky.nodeZopfliEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZopfliEs.nodeZopfliEsStrings.deflate
  - typingsSlinky.nodeZopfliEs.nodeZopfliEsStrings.gzip
  - typingsSlinky.nodeZopfliEs.nodeZopfliEsStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsSlinky.nodeZopfliEs.nodeZopfliEsStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typingsSlinky.nodeZopfliEs.nodeZopfliEsStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typingsSlinky.nodeZopfliEs.nodeZopfliEsStrings.zlib = this.cast("zlib")
}

