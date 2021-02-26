package typingsSlinky.googleProtobuf.typePbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
@js.native
class Enum () extends Message {
  
  def addEnumvalue(): EnumValue = js.native
  def addEnumvalue(value: js.UndefOr[scala.Nothing], index: Double): EnumValue = js.native
  def addEnumvalue(value: EnumValue): EnumValue = js.native
  def addEnumvalue(value: EnumValue, index: Double): EnumValue = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearEnumvalueList(): Enum = js.native
  
  def clearOptionsList(): Enum = js.native
  
  def clearSourceContext(): Enum = js.native
  
  def getEnumvalueList(): js.Array[EnumValue] = js.native
  
  def getName(): String = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setEnumvalueList(value: js.Array[EnumValue]): Enum = js.native
  
  def setName(value: String): Enum = js.native
  
  def setOptionsList(value: js.Array[Option]): Enum = js.native
  
  def setSourceContext(): Enum = js.native
  def setSourceContext(value: SourceContext): Enum = js.native
  
  def setSyntax(value: Syntax): Enum = js.native
}
/* static members */
object Enum {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): Enum = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: Enum, reader: BinaryReader): Enum = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: Enum, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Enum.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: Enum): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var enumvalueList: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject] = js.native
    
    var name: String = js.native
    
    var optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject] = js.native
    
    var sourceContext: js.UndefOr[typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.native
    
    var syntax: Syntax = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      enumvalueList: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject],
      name: String,
      optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject],
      syntax: Syntax
    ): AsObject = {
      val __obj = js.Dynamic.literal(enumvalueList = enumvalueList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnumvalueList(value: js.Array[typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject]): Self = StObject.set(x, "enumvalueList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumvalueListVarargs(value: typingsSlinky.googleProtobuf.typePbMod.EnumValue.AsObject*): Self = StObject.set(x, "enumvalueList", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsList(value: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject]): Self = StObject.set(x, "optionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsListVarargs(value: typingsSlinky.googleProtobuf.typePbMod.Option.AsObject*): Self = StObject.set(x, "optionsList", js.Array(value :_*))
      
      @scala.inline
      def setSourceContext(value: typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
      
      @scala.inline
      def setSyntax(value: Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
}
