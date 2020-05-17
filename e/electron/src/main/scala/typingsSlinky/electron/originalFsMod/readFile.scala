package typingsSlinky.electron.originalFsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.EncodingFlag
import typingsSlinky.node.anon.Flag
import typingsSlinky.node.anon.FlagString
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "readFile")
@js.native
object readFile extends js.Object {
  def apply(path: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: Double,
    options: js.UndefOr[Flag | FlagString | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    */
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(
    path: PathLike,
    options: js.UndefOr[Flag | FlagString | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(
    path: PathLike,
    options: EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(path: Double): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(path: Double, options: String): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: Double, options: EncodingFlag): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: Double, options: Flag): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(path: Double, options: FlagString): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: String): js.Promise[String] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, options: EncodingFlag): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: Flag): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: FlagString): js.Promise[String | Buffer] = js.native
}

