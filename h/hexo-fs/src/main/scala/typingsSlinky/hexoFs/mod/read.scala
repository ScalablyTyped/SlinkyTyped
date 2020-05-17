package typingsSlinky.hexoFs.mod

import typingsSlinky.hexoFs.anon.BytesRead
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "read")
@js.native
object read extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[typingsSlinky.hexoFs.anon.Buffer] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[typingsSlinky.hexoFs.anon.Buffer] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double): typingsSlinky.bluebird.mod.^[BytesRead] = js.native
  def apply(fd: Double, buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): typingsSlinky.bluebird.mod.^[BytesRead] = js.native
}

