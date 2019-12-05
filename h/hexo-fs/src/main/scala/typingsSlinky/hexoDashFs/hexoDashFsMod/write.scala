package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.hexoDashFs.Anon_BufferBytesWritten
import typingsSlinky.hexoDashFs.Anon_BufferBytesWrittenNumber
import typingsSlinky.hexoDashFs.Anon_BufferBytesWrittenNumberString
import typingsSlinky.node.Buffer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumber] = js.native
  def apply(fd: Double, string: js.Any): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesWrittenNumberString] = js.native
}

