package typingsSlinky.rimraf

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.EncodingWithFileTypes
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.anon.`4`
import typingsSlinky.node.anon.`5`
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.NoParamCallback
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.RmDirAsyncOptions
import typingsSlinky.node.fsMod.RmDirOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.rimraf.rimrafStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0 extends js.Object {
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    def apply(path: PathLike, options: EncodingWithFileTypes): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    def apply(path: PathLike, options: `4`): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: `5`): js.Array[Dirent] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply(path: PathLike, mode: String): Unit = js.native
    def apply(path: PathLike, mode: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends js.Object {
    def apply(path: PathLike): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions): Unit = js.native
  }
  
  @js.native
  trait Typeofchmod extends js.Object {
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def apply(path: PathLike, mode: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, mode: Double, callback: NoParamCallback): Unit = js.native
    /**
      * Asynchronous chmod(2) - Change permissions of a file.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def __promisify__(path: PathLike, mode: String): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Typeoflstat extends js.Object {
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    /**
      * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Stats] = js.native
  }
  
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
  
  @js.native
  trait Typeofrmdir extends js.Object {
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: RmDirAsyncOptions, callback: NoParamCallback): Unit = js.native
    /**
      * Asynchronous rmdir(2) - delete a directory.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
    def __promisify__(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Typeofstat extends js.Object {
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    /**
      * Asynchronous stat(2) - Get file status.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Stats] = js.native
  }
  
  @js.native
  trait Typeofunlink extends js.Object {
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    /**
      * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
      * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
      */
    def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  }
  
}

