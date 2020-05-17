package typingsSlinky.electron.originalFsMod

import typingsSlinky.electron.electronStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.`2`
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "readlink")
@js.native
object readlink extends js.Object {
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: js.UndefOr[`3` | BufferEncoding | Encoding | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: `2`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: Encoding): js.Promise[String] = js.native
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, options: `2`): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: `3`): js.Promise[String | Buffer] = js.native
  @JSName("__promisify__")
  def promisify_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
}

