package typingsSlinky.googleProtobuf.descriptorPbMod

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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto")
@js.native
class OneofDescriptorProto () extends Message {
  
  def clearName(): OneofDescriptorProto = js.native
  
  def clearOptions(): OneofDescriptorProto = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[OneofOptions] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setName(value: String): OneofDescriptorProto = js.native
  
  def setOptions(): OneofDescriptorProto = js.native
  def setOptions(value: OneofOptions): OneofDescriptorProto = js.native
}
/* static members */
object OneofDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): OneofDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: OneofDescriptorProto, reader: BinaryReader): OneofDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: OneofDescriptorProto, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "OneofDescriptorProto.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: OneofDescriptorProto): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.OneofOptions.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.OneofOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
