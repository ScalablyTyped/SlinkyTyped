package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.AnonEncodingFlag
import typingsSlinky.fsExtra.AnonFlag
import typingsSlinky.mz.AnonFlagString
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "readFile")
@js.native
object readFile extends js.Object {
  def apply(file: String): js.Promise[Buffer] = js.native
  def apply(file: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  def apply(file: String, encoding: String): js.Promise[String] = js.native
  def apply(
    file: String,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(file: String, options: AnonEncodingFlag): js.Promise[String] = js.native
  def apply(
    file: String,
    options: AnonEncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: String, options: AnonFlag): js.Promise[String] = js.native
  def apply(
    file: String,
    options: AnonFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Double, options: AnonEncodingFlag): js.Promise[String] = js.native
  def apply(
    file: Double,
    options: AnonEncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Double, options: AnonFlag): js.Promise[String] = js.native
  def apply(
    file: Double,
    options: AnonFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Buffer): js.Promise[Buffer] = js.native
  def apply(file: Buffer, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  def apply(file: Buffer, encoding: String): js.Promise[String] = js.native
  def apply(
    file: Buffer,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def apply(file: Buffer, options: AnonEncodingFlag): js.Promise[String] = js.native
  def apply(
    file: Buffer,
    options: AnonEncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Buffer, options: AnonFlag): js.Promise[String] = js.native
  def apply(
    file: Buffer,
    options: AnonFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: Double): js.Promise[Buffer] = js.native
  def apply(path: Double, callback: js.Function2[(/* err */ ErrnoException) | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
  ): Unit = js.native
  def apply(path: Double, options: String): js.Promise[String] = js.native
  def apply(
    path: Double,
    options: String,
    callback: js.Function2[(/* err */ ErrnoException) | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
  def apply(path: Double, options: Null, callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]): Unit = js.native
  def apply(path: Double, options: typingsSlinky.mz.AnonEncodingFlag): js.Promise[String] = js.native
  def apply(
    path: Double,
    options: typingsSlinky.mz.AnonEncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(path: Double, options: typingsSlinky.mz.AnonFlag): js.Promise[Buffer] = js.native
  def apply(path: Double, options: AnonFlagString): js.Promise[String | Buffer] = js.native
  def apply(
    path: Double,
    options: AnonFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: typingsSlinky.mz.AnonFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike): js.Promise[Buffer] = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: typingsSlinky.mz.AnonEncodingFlag): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: typingsSlinky.mz.AnonEncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: typingsSlinky.mz.AnonFlag): js.Promise[Buffer] = js.native
  def apply(path: PathLike, options: AnonFlagString): js.Promise[String | Buffer] = js.native
  def apply(
    path: PathLike,
    options: AnonFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: typingsSlinky.mz.AnonFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
}

