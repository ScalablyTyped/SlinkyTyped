package typingsSlinky.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: These are the async compression algorithms on the zlib object.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate
  - typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw
  - typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip
  - typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress
*/
trait ZlibAlgorithm extends js.Object

object ZlibAlgorithm {
  @scala.inline
  def brotliCompress: typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress = this.cast("brotliCompress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate = this.cast("deflate")
  @scala.inline
  def deflateRaw: typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw = this.cast("deflateRaw")
  @scala.inline
  def gzip: typingsSlinky.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip = this.cast("gzip")
}

