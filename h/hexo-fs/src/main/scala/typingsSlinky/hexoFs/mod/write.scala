package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.AnonBufferBytesWritten
import typingsSlinky.hexoFs.AnonBufferString
import typingsSlinky.hexoFs.AnonBytesWritten
import typingsSlinky.node.Buffer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typingsSlinky.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typingsSlinky.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typingsSlinky.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[AnonBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): typingsSlinky.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): typingsSlinky.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, string: js.Any): typingsSlinky.bluebird.mod.^[AnonBufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typingsSlinky.bluebird.mod.^[AnonBufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typingsSlinky.bluebird.mod.^[AnonBufferString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typingsSlinky.bluebird.mod.^[AnonBufferString] = js.native
}

