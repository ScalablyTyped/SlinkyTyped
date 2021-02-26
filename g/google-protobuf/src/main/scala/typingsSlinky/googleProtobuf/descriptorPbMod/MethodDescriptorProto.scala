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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
class MethodDescriptorProto () extends Message {
  
  def clearClientStreaming(): MethodDescriptorProto = js.native
  
  def clearInputType(): MethodDescriptorProto = js.native
  
  def clearName(): MethodDescriptorProto = js.native
  
  def clearOptions(): MethodDescriptorProto = js.native
  
  def clearOutputType(): MethodDescriptorProto = js.native
  
  def clearServerStreaming(): MethodDescriptorProto = js.native
  
  def getClientStreaming(): js.UndefOr[Boolean] = js.native
  
  def getInputType(): js.UndefOr[String] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getOptions(): js.UndefOr[MethodOptions] = js.native
  
  def getOutputType(): js.UndefOr[String] = js.native
  
  def getServerStreaming(): js.UndefOr[Boolean] = js.native
  
  def hasClientStreaming(): Boolean = js.native
  
  def hasInputType(): Boolean = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def hasOutputType(): Boolean = js.native
  
  def hasServerStreaming(): Boolean = js.native
  
  def setClientStreaming(value: Boolean): MethodDescriptorProto = js.native
  
  def setInputType(value: String): MethodDescriptorProto = js.native
  
  def setName(value: String): MethodDescriptorProto = js.native
  
  def setOptions(): MethodDescriptorProto = js.native
  def setOptions(value: MethodOptions): MethodDescriptorProto = js.native
  
  def setOutputType(value: String): MethodDescriptorProto = js.native
  
  def setServerStreaming(value: Boolean): MethodDescriptorProto = js.native
}
/* static members */
object MethodDescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): MethodDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: MethodDescriptorProto, reader: BinaryReader): MethodDescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: MethodDescriptorProto, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: MethodDescriptorProto): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var clientStreaming: js.UndefOr[Boolean] = js.native
    
    var inputType: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.MethodOptions.AsObject] = js.native
    
    var outputType: js.UndefOr[String] = js.native
    
    var serverStreaming: js.UndefOr[Boolean] = js.native
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
      def setClientStreaming(value: Boolean): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientStreamingUndefined: Self = StObject.set(x, "clientStreaming", js.undefined)
      
      @scala.inline
      def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.MethodOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
      
      @scala.inline
      def setServerStreaming(value: Boolean): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerStreamingUndefined: Self = StObject.set(x, "serverStreaming", js.undefined)
    }
  }
}
