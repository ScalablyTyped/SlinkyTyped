package typingsSlinky.nodeForge.mod.util

import typingsSlinky.nodeForge.mod.Base64
import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.binary")
@js.native
object binary extends js.Object {
  @js.native
  object base64 extends js.Object {
    def decode(input: Base64): js.typedarray.Uint8Array = js.native
    def decode(input: Base64, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def decode(input: Base64, output: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
    def encode(input: js.typedarray.Uint8Array): Base64 = js.native
    def encode(input: js.typedarray.Uint8Array, maxline: Double): Base64 = js.native
  }
  
  @js.native
  object hex extends js.Object {
    def decode(hex: Hex): js.typedarray.Uint8Array = js.native
    def decode(hex: Hex, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def decode(hex: Hex, output: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
    def encode(bytes: Bytes): Hex = js.native
    def encode(bytes: ArrayBufferView): Hex = js.native
    def encode(bytes: ByteStringBuffer): Hex = js.native
    def encode(bytes: js.typedarray.ArrayBuffer): Hex = js.native
  }
  
  @js.native
  object raw extends js.Object {
    def decode(str: Bytes): js.typedarray.Uint8Array = js.native
    def decode(str: Bytes, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def decode(str: Bytes, output: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
    def encode(x: js.typedarray.Uint8Array): Bytes = js.native
  }
  
}

