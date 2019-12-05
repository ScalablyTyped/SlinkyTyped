package typingsSlinky.googleDashGax.buildSrcFallbackErrorMod

import typingsSlinky.node.Buffer
import typingsSlinky.protobufjs.protobufjsMod.Message
import typingsSlinky.protobufjs.protobufjsMod.Root
import typingsSlinky.protobufjs.protobufjsMod.Type
import typingsSlinky.std.ArrayBuffer
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
  def decodeRpcStatus(buffer: ArrayBuffer): DecodedRpcStatus = js.native
}

