package typingsSlinky.node.fsMod

import typingsSlinky.node.Anon_BufferEncoding
import typingsSlinky.node.Anon_EncodingBufferEncoding
import typingsSlinky.node.Anon_EncodingNull
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "realpathSync")
@js.native
object realpathSync extends js.Object {
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): java.lang.String | Buffer = js.native
  def apply(path: PathLike, options: java.lang.String): java.lang.String | Buffer = js.native
  /**
    * Synchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingBufferEncoding): java.lang.String = js.native
  def apply(path: PathLike, options: Anon_EncodingNull): java.lang.String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): java.lang.String = js.native
  def apply(path: PathLike, options: buffer_): Buffer = js.native
  def native(path: PathLike): java.lang.String | Buffer = js.native
  def native(path: PathLike, options: java.lang.String): java.lang.String | Buffer = js.native
  def native(path: PathLike, options: Anon_BufferEncoding): Buffer = js.native
  def native(path: PathLike, options: Anon_EncodingBufferEncoding): java.lang.String = js.native
  def native(path: PathLike, options: Anon_EncodingNull): java.lang.String | Buffer = js.native
  def native(path: PathLike, options: BufferEncoding): java.lang.String = js.native
  @JSName("native")
  def native_String(path: PathLike): java.lang.String = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer_): Buffer = js.native
}

