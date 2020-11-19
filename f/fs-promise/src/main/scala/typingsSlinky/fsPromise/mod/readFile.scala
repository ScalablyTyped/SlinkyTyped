package typingsSlinky.fsPromise.mod

import typingsSlinky.fsExtra.anon.EncodingFlag
import typingsSlinky.fsExtra.anon.Flag
import typingsSlinky.mz.anon.`4`
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(file: String, options: EncodingFlag): js.Promise[String] = js.native
  def apply(
    file: String,
    options: EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: String, options: Flag): js.Promise[String] = js.native
  def apply(
    file: String,
    options: Flag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Double, options: EncodingFlag): js.Promise[String] = js.native
  def apply(
    file: Double,
    options: EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Double, options: Flag): js.Promise[String] = js.native
  def apply(
    file: Double,
    options: Flag,
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
  def apply(file: Buffer, options: EncodingFlag): js.Promise[String] = js.native
  def apply(
    file: Buffer,
    options: EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(file: Buffer, options: Flag): js.Promise[String] = js.native
  def apply(
    file: Buffer,
    options: Flag,
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
  def apply(path: Double, options: typingsSlinky.mz.anon.EncodingFlag): js.Promise[String] = js.native
  def apply(
    path: Double,
    options: typingsSlinky.mz.anon.EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(path: Double, options: typingsSlinky.mz.anon.Flag): js.Promise[Buffer] = js.native
  def apply(
    path: Double,
    options: typingsSlinky.mz.anon.Flag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: Double, options: `4`): js.Promise[String | Buffer] = js.native
  def apply(
    path: Double,
    options: `4`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
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
  def apply(path: PathLike, options: typingsSlinky.mz.anon.EncodingFlag): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    options: typingsSlinky.mz.anon.EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: typingsSlinky.mz.anon.Flag): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: typingsSlinky.mz.anon.Flag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: `4`): js.Promise[String | Buffer] = js.native
  def apply(
    path: PathLike,
    options: `4`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
}
