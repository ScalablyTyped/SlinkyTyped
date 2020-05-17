package typingsSlinky.makeDir.anon

import typingsSlinky.makeDir.makeDirStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.EncodingWithFileTypes
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.anon.`4`
import typingsSlinky.node.anon.`5`
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofreaddir extends js.Object {
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: js.UndefOr[`4` | BufferEncoding | Null | String | WithFileTypes],
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    path: PathLike,
    options: EncodingWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  def apply(
    path: PathLike,
    options: `5`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: PathLike): js.Promise[js.Array[String]] = js.native
  def __promisify__(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
  def __promisify__(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  def __promisify__(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def __promisify__(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  def __promisify__(path: PathLike, options: `4`): js.Promise[js.Array[Buffer | String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
    */
  def __promisify__(path: PathLike, options: `5`): js.Promise[js.Array[Dirent]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def __promisify___buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
}

