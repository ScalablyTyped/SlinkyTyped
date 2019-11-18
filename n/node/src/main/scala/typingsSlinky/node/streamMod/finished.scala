package typingsSlinky.node.streamMod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "finished")
@js.native
object finished extends js.Object {
  def apply(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def apply(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def apply(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def __promisify__(stream: ReadWriteStream): js.Promise[Unit] = js.native
  def __promisify__(stream: ReadableStream): js.Promise[Unit] = js.native
  def __promisify__(stream: WritableStream): js.Promise[Unit] = js.native
}

