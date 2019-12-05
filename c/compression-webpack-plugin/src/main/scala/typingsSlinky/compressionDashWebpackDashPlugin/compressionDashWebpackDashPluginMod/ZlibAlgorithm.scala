package typingsSlinky.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: These are the async compression algorithms on the zlib object.
/* Rewritten from type alias, can be one of: 
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflate
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflateRaw
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.gzip
  - typings.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.brotliCompress
*/
trait ZlibAlgorithm extends js.Object

object ZlibAlgorithm {
  @scala.inline
  def brotliCompress: typingsSlinky.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.brotliCompress = this.cast("brotliCompress")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typingsSlinky.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflate = this.cast("deflate")
  @scala.inline
  def deflateRaw: typingsSlinky.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.deflateRaw = this.cast("deflateRaw")
  @scala.inline
  def gzip: typingsSlinky.compressionDashWebpackDashPlugin.compressionDashWebpackDashPluginStrings.gzip = this.cast("gzip")
}

