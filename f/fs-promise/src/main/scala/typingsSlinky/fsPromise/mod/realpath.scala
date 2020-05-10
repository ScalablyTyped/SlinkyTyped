package typingsSlinky.fsPromise.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fsPromise.fsPromiseStrings.buffer
import typingsSlinky.mz.Anon0
import typingsSlinky.mz.Anon1
import typingsSlinky.mz.AnonEncoding
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: String,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: Buffer,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  def apply(path: PathLike): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Anon0): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: Anon0,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Anon1): js.Promise[String | Buffer] = js.native
  def apply(
    path: PathLike,
    options: Anon1,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: AnonEncoding): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(path: PathLike): js.Promise[String] = js.native
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def native(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(path: PathLike, options: Anon0): js.Promise[Buffer] = js.native
  def native(
    path: PathLike,
    options: Anon0,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def native(path: PathLike, options: Anon1): js.Promise[String | Buffer] = js.native
  def native(
    path: PathLike,
    options: Anon1,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def native(path: PathLike, options: AnonEncoding): js.Promise[String] = js.native
  def native(
    path: PathLike,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def native(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  @JSName("native")
  def native_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
}

