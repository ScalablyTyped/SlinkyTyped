package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.anon.EncodingWithFileTypes
import typingsSlinky.fsExtra.anon.WithFileTypes
import typingsSlinky.fsExtra.anon.`0`
import typingsSlinky.fsExtra.anon.`1`
import typingsSlinky.mz.anon.`2`
import typingsSlinky.mz.anon.`3`
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "readdir")
@js.native
object readdir extends js.Object {
  
  def apply(path: PathLike): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* files */ js.Array[String], Unit]
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
  def apply(path: PathLike, options: EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def apply(path: PathLike, options: WithFileTypes): js.Promise[js.Array[String]] = js.native
  def apply(path: PathLike, options: `0`): js.Promise[js.Array[Buffer | String]] = js.native
  def apply(path: PathLike, options: `1`): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
  def apply(path: PathLike, options: typingsSlinky.mz.anon.EncodingWithFileTypes): js.Promise[js.Array[Buffer]] = js.native
  def apply(
    path: PathLike,
    options: typingsSlinky.mz.anon.EncodingWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: typingsSlinky.mz.anon.WithFileTypes): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    options: typingsSlinky.mz.anon.WithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: `2`): js.Promise[js.Array[Buffer | String]] = js.native
  def apply(
    path: PathLike,
    options: `2`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: `3`): js.Promise[js.Array[typingsSlinky.node.fsMod.Dirent]] = js.native
  def apply(
    path: PathLike,
    options: `3`,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.Array[typingsSlinky.node.fsMod.Dirent], 
      Unit
    ]
  ): Unit = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
}
