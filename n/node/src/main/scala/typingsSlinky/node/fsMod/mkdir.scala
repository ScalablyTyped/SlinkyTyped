package typingsSlinky.node.fsMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.MakeDirectoryOptionsrecur
import typingsSlinky.node.anon.MakeDirectoryOptionsrecurMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "mkdir")
@js.native
object mkdir extends js.Object {
  /**
    * Asynchronous mkdir(2) - create a directory with a mode of `0o777`.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def apply(
    path: PathLike,
    options: js.UndefOr[Double | MakeDirectoryOptions | Null | String],
    callback: js.Function2[ErrnoException | Null, js.UndefOr[String], Unit]
  ): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def apply(
    path: PathLike,
    options: js.UndefOr[Double | MakeDirectoryOptionsrecurMode | Null | String],
    callback: NoParamCallback
  ): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def apply(
    path: PathLike,
    options: MakeDirectoryOptionsrecur,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: String): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
}

