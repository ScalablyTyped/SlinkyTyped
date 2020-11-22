package typingsSlinky.googleProtobuf.wrappersPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "BytesValue")
@js.native
class BytesValue_ () extends Message {
  
  def getValue(): js.typedarray.Uint8Array | String = js.native
  
  def getValue_asB64(): String = js.native
  
  def getValue_asU8(): js.typedarray.Uint8Array = js.native
  
  def setValue(value: String): BytesValue = js.native
  def setValue(value: js.typedarray.Uint8Array): BytesValue = js.native
}
