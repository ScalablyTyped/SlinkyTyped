package typingsSlinky.fsExtra.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.Persistent
import typingsSlinky.node.anon.Recursive
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "watch")
@js.native
object watch extends js.Object {
  
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
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: BufferEncoding,
    listener: js.Function2[/* event */ String, /* filename */ String, Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: Persistent): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Persistent,
    listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
  ): FSWatcher = js.native
  def apply(filename: PathLike, options: Recursive): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: Recursive,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}
