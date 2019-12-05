package typingsSlinky.hexoDashFs.hexoDashFsMod

import typingsSlinky.hexoDashFs.Anon_Buffer
import typingsSlinky.hexoDashFs.Anon_BufferBytesRead
import typingsSlinky.node.Buffer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_Buffer] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_Buffer] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesRead] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.bluebirdMod.^[Anon_BufferBytesRead] = js.native
}

