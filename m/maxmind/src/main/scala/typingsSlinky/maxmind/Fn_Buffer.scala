package typingsSlinky.maxmind

import typingsSlinky.maxmind.maxmindStrings.buffer
import typingsSlinky.node.Anon_BufferEncodingPersistent
import typingsSlinky.node.Anon_EncodingPersistent
import typingsSlinky.node.Anon_EncodingPersistentRecursive
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Buffer extends js.Object {
  def apply(filename: PathLike): FSWatcher = js.native
  def apply(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: String): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: String,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Null,
    listener: js.Function2[/* event */ String, Buffer | String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: buffer): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: Anon_BufferEncodingPersistent): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Anon_BufferEncodingPersistent,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: Anon_EncodingPersistent): FSWatcher = js.native
  def apply(filename: PathLike, options: Anon_EncodingPersistentRecursive): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Anon_EncodingPersistentRecursive,
    listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
  ): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Anon_EncodingPersistent,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
}

