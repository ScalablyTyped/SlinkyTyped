package typingsSlinky.nodeForge.mod.util

import typingsSlinky.nodeForge.mod.Base64
import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.Hex
import typingsSlinky.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.binary")
@js.native
object binary extends js.Object {
  @js.native
  object base64 extends js.Object {
    def decode(input: Base64): scala.scalajs.js.typedarray.Uint8Array = js.native
    def decode(input: Base64, output: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
    def decode(input: Base64, output: scala.scalajs.js.typedarray.Uint8Array, offset: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
    def encode(input: scala.scalajs.js.typedarray.Uint8Array): Base64 = js.native
    def encode(input: scala.scalajs.js.typedarray.Uint8Array, maxline: Double): Base64 = js.native
  }
  
  @js.native
  object hex extends js.Object {
    def decode(hex: Hex): scala.scalajs.js.typedarray.Uint8Array = js.native
    def decode(hex: Hex, output: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
    def decode(hex: Hex, output: scala.scalajs.js.typedarray.Uint8Array, offset: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
    def encode(bytes: Bytes): Hex = js.native
    def encode(bytes: ArrayBufferView): Hex = js.native
    def encode(bytes: ByteStringBuffer): Hex = js.native
    def encode(bytes: ArrayBuffer): Hex = js.native
  }
  
  @js.native
  object raw extends js.Object {
    def decode(str: Bytes): scala.scalajs.js.typedarray.Uint8Array = js.native
    def decode(str: Bytes, output: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
    def decode(str: Bytes, output: scala.scalajs.js.typedarray.Uint8Array, offset: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
    def encode(x: scala.scalajs.js.typedarray.Uint8Array): Bytes = js.native
  }
  
}

