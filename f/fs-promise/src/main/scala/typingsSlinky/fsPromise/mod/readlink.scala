package typingsSlinky.fsPromise.mod

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

@JSImport("fs-promise", "readlink")
@js.native
object readlink extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def apply(path: PathLike): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Anon0): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: Anon0,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Anon1): js.Promise[String | Buffer] = js.native
  def apply(
    path: PathLike,
    options: Anon1,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: AnonEncoding): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
}

