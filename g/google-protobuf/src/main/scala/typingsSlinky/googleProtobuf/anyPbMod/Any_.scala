package typingsSlinky.googleProtobuf.anyPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
class Any_ () extends Message {
  def getTypeName(): String = js.native
  def getTypeUrl(): String = js.native
  def getValue(): js.typedarray.Uint8Array | String = js.native
  def getValue_asB64(): String = js.native
  def getValue_asU8(): js.typedarray.Uint8Array = js.native
  def pack(serialized: js.typedarray.Uint8Array, name: String): Unit = js.native
  def pack(serialized: js.typedarray.Uint8Array, name: String, typeUrlPrefix: String): Unit = js.native
  def setTypeUrl(value: String): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: js.typedarray.Uint8Array): Unit = js.native
  def unpack[T /* <: Message */](deserialize: js.Function1[/* packed */ js.typedarray.Uint8Array, T], name: String): T | Null = js.native
}

