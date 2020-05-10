package typingsSlinky.fsPromise.mod

import typingsSlinky.mz.Anon0
import typingsSlinky.mz.Anon1
import typingsSlinky.mz.AnonEncoding
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "mkdtemp")
@js.native
object mkdtemp extends js.Object {
  def apply(prefix: String): js.Promise[String] = js.native
  def apply(
    prefix: String,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* folder */ String, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  def apply(
    prefix: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(prefix: String, options: Anon0): js.Promise[Buffer] = js.native
  def apply(
    prefix: String,
    options: Anon0,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  def apply(prefix: String, options: Anon1): js.Promise[String | Buffer] = js.native
  def apply(
    prefix: String,
    options: Anon1,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(prefix: String, options: AnonEncoding): js.Promise[String] = js.native
  def apply(
    prefix: String,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  def apply(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  def apply(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
}

