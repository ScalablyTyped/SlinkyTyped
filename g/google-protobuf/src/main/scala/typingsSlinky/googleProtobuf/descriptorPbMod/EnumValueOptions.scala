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

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions")
@js.native
class EnumValueOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: js.UndefOr[scala.Nothing], index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): EnumValueOptions = js.native
  
  def clearUninterpretedOptionList(): EnumValueOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def setDeprecated(value: Boolean): EnumValueOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): EnumValueOptions = js.native
}
/* static members */
object EnumValueOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): EnumValueOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: EnumValueOptions, reader: BinaryReader): EnumValueOptions = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: EnumValueOptions, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: EnumValueOptions): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setUninterpretedOptionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninterpretedOptionListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value :_*))
    }
  }
}
