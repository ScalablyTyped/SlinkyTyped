package typingsSlinky.googleProtobuf.typePbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.anyPbMod.Any
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Option")
@js.native
class Option () extends Message {
  
  def clearValue(): Option = js.native
  
  def getName(): String = js.native
  
  def getValue(): js.UndefOr[Any] = js.native
  
  def hasValue(): Boolean = js.native
  
  def setName(value: String): Option = js.native
  
  def setValue(): Option = js.native
  def setValue(value: Any): Option = js.native
}
/* static members */
object Option {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): Option = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: Option, reader: BinaryReader): Option = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: Option, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Option.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: Option): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var name: String = js.native
    
    var value: js.UndefOr[typingsSlinky.googleProtobuf.anyPbMod.Any.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(name: String): AsObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: typingsSlinky.googleProtobuf.anyPbMod.Any.AsObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
