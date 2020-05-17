package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.anon.BufferBytesWritten
import typingsSlinky.hexoFs.anon.BufferString
import typingsSlinky.hexoFs.anon.BytesWritten
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typingsSlinky.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typingsSlinky.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typingsSlinky.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[BytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[BufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any): typingsSlinky.bluebird.mod.^[BufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typingsSlinky.bluebird.mod.^[BufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typingsSlinky.bluebird.mod.^[BufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typingsSlinky.bluebird.mod.^[BufferString] = js.native
}

