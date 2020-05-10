package typingsSlinky.nodeForge.mod.util

import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.createBuffer")
@js.native
object createBuffer extends js.Object {
  def apply(): ByteBuffer = js.native
  def apply(input: Bytes): ByteBuffer = js.native
  def apply(input: Bytes, encoding: Encoding): ByteBuffer = js.native
  def apply(input: ArrayBufferView): ByteBuffer = js.native
  def apply(input: ArrayBufferView, encoding: Encoding): ByteBuffer = js.native
  def apply(input: ByteStringBuffer): ByteBuffer = js.native
  def apply(input: ByteStringBuffer, encoding: Encoding): ByteBuffer = js.native
  def apply(input: js.typedarray.ArrayBuffer): ByteBuffer = js.native
  def apply(input: js.typedarray.ArrayBuffer, encoding: Encoding): ByteBuffer = js.native
}

