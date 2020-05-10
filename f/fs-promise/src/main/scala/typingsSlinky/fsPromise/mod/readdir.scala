package typingsSlinky.fsPromise.mod

import typingsSlinky.mz.Anon2
import typingsSlinky.mz.Anon3
import typingsSlinky.mz.AnonEncodingWithFileTypes
import typingsSlinky.mz.AnonWithFileTypes
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: String): js.Promise[js.Array[String]] = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[js.Array[String]] = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]): Unit = js.native
  def apply(path: PathLike): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[js.Array[Buffer | String]] = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Anon2): js.Promise[js.Array[Buffer | String]] = js.native
  def apply(
    path: PathLike,
    options: Anon2,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Anon3): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
  def apply(
    path: PathLike,
    options: Anon3,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.Array[typingsSlinky.node.fsMod.Dirent], 
      Unit
    ]
  ): Unit = js.native
  def apply(path: PathLike, options: AnonEncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def apply(
    path: PathLike,
    options: AnonEncodingWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: AnonWithFileTypes): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    options: AnonWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
}

