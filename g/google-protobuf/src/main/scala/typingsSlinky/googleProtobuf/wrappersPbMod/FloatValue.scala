package typingsSlinky.googleProtobuf.wrappersPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue")
@js.native
class FloatValue () extends Message {
  
  def getValue(): Double = js.native
  
  def setValue(value: Double): FloatValue = js.native
}
/* static members */
object FloatValue {
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): FloatValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: FloatValue, reader: BinaryReader): FloatValue = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: FloatValue, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/wrappers_pb", "FloatValue.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: FloatValue): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var value: Double = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(value: Double): AsObject = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
