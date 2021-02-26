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

@JSImport("google-protobuf/google/protobuf/type_pb", "Type")
@js.native
class Type () extends Message {
  
  def addFields(): Field = js.native
  def addFields(value: js.UndefOr[scala.Nothing], index: Double): Field = js.native
  def addFields(value: Field): Field = js.native
  def addFields(value: Field, index: Double): Field = js.native
  
  def addOneofs(value: String): String = js.native
  def addOneofs(value: String, index: Double): String = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearFieldsList(): Type = js.native
  
  def clearOneofsList(): Type = js.native
  
  def clearOptionsList(): Type = js.native
  
  def clearSourceContext(): Type = js.native
  
  def getFieldsList(): js.Array[Field] = js.native
  
  def getName(): String = js.native
  
  def getOneofsList(): js.Array[String] = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setFieldsList(value: js.Array[Field]): Type = js.native
  
  def setName(value: String): Type = js.native
  
  def setOneofsList(value: js.Array[String]): Type = js.native
  
  def setOptionsList(value: js.Array[Option]): Type = js.native
  
  def setSourceContext(): Type = js.native
  def setSourceContext(value: SourceContext): Type = js.native
  
  def setSyntax(value: Syntax): Type = js.native
}
/* static members */
object Type {
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): Type = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: Type, reader: BinaryReader): Type = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: Type, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/type_pb", "Type.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: Type): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var fieldsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Field.AsObject] = js.native
    
    var name: String = js.native
    
    var oneofsList: js.Array[String] = js.native
    
    var optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject] = js.native
    
    var sourceContext: js.UndefOr[typingsSlinky.googleProtobuf.sourceContextPbMod.SourceContext.AsObject] = js.native
    
    var syntax: Syntax = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      fieldsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Field.AsObject],
      name: String,
      oneofsList: js.Array[String],
      optionsList: js.Array[typingsSlinky.googleProtobuf.typePbMod.Option.AsObject],
      syntax: Syntax
    ): AsObject = {
      val __obj = js.Dynamic.literal(fieldsList = fieldsList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oneofsList = oneofsList.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldsList(value: js.Array[typingsSlinky.googleProtobuf.typePbMod.Field.AsObject]): Self = StObject.set(x, "fieldsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsListVarargs(value: typingsSlinky.googleProtobuf.typePbMod.Field.AsObject*): Self = StObject.set(x, "fieldsList", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofsList(value: js.Array[String]): Self = StObject.set(x, "oneofsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofsListVarargs(value: String*): Self = StObject.set(x, "oneofsList", js.Array(value :_*))
      
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
