package typingsSlinky.googleGax.fallbackErrorMod

import typingsSlinky.node.Buffer
import typingsSlinky.protobufjs.mod.Message
import typingsSlinky.protobufjs.mod.Root
import typingsSlinky.protobufjs.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallbackError", "FallbackErrorDecoder")
@js.native
class FallbackErrorDecoder () extends js.Object {
  var anyType: Type = js.native
  var root: Root = js.native
  var statusType: Type = js.native
  def decodeProtobufAny(anyValue: ProtobufAny): Message[js.Object] = js.native
  def decodeRpcStatus(buffer: Buffer): DecodedRpcStatus = js.native
  def decodeRpcStatus(buffer: js.typedarray.ArrayBuffer): DecodedRpcStatus = js.native
}

