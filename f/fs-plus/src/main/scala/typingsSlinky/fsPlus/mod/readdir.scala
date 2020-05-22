package typingsSlinky.fsPlus.mod

import typingsSlinky.fsPlus.fsPlusStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "readdir")
@js.native
object readdir extends js.Object {
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[BaseEncodingOptionswithFi | BufferEncoding | Null | WithFileTypes],
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BaseEncodingOptionswithFiEncoding,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.Array[typingsSlinky.node.fsMod.Dirent], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Encoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: BaseEncodingOptionswithFi): js.Promise[js.Array[Buffer | String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
    */
  @JSName("__promisify__")
  def promisify(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = js.native
  @JSName("__promisify__")
  def promisify(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = js.native
}

