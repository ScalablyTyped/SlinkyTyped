package typingsSlinky.googleProtobuf.descriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange
import typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
class DescriptorProto () extends Message {
  
  def addEnumType(): EnumDescriptorProto = js.native
  def addEnumType(value: js.UndefOr[scala.Nothing], index: Double): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto): EnumDescriptorProto = js.native
  def addEnumType(value: EnumDescriptorProto, index: Double): EnumDescriptorProto = js.native
  
  def addExtension(): FieldDescriptorProto = js.native
  def addExtension(value: js.UndefOr[scala.Nothing], index: Double): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addExtension(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addExtensionRange(): ExtensionRange = js.native
  def addExtensionRange(value: js.UndefOr[scala.Nothing], index: Double): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange): ExtensionRange = js.native
  def addExtensionRange(value: ExtensionRange, index: Double): ExtensionRange = js.native
  
  def addField(): FieldDescriptorProto = js.native
  def addField(value: js.UndefOr[scala.Nothing], index: Double): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto): FieldDescriptorProto = js.native
  def addField(value: FieldDescriptorProto, index: Double): FieldDescriptorProto = js.native
  
  def addNestedType(): DescriptorProto = js.native
  def addNestedType(value: js.UndefOr[scala.Nothing], index: Double): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto): DescriptorProto = js.native
  def addNestedType(value: DescriptorProto, index: Double): DescriptorProto = js.native
  
  def addOneofDecl(): OneofDescriptorProto = js.native
  def addOneofDecl(value: js.UndefOr[scala.Nothing], index: Double): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto): OneofDescriptorProto = js.native
  def addOneofDecl(value: OneofDescriptorProto, index: Double): OneofDescriptorProto = js.native
  
  def addReservedName(value: String): String = js.native
  def addReservedName(value: String, index: Double): String = js.native
  
  def addReservedRange(): ReservedRange = js.native
  def addReservedRange(value: js.UndefOr[scala.Nothing], index: Double): ReservedRange = js.native
  def addReservedRange(value: ReservedRange): ReservedRange = js.native
  def addReservedRange(value: ReservedRange, index: Double): ReservedRange = js.native
  
  def clearEnumTypeList(): DescriptorProto = js.native
  
  def clearExtensionList(): DescriptorProto = js.native
  
  def clearExtensionRangeList(): DescriptorProto = js.native
  
  def clearFieldList(): DescriptorProto = js.native
  
  def clearName(): DescriptorProto = js.native
  
  def clearNestedTypeList(): DescriptorProto = js.native
  
  def clearOneofDeclList(): DescriptorProto = js.native
  
  def clearOptions(): DescriptorProto = js.native
  
  def clearReservedNameList(): DescriptorProto = js.native
  
  def clearReservedRangeList(): DescriptorProto = js.native
  
  def getEnumTypeList(): js.Array[EnumDescriptorProto] = js.native
  
  def getExtensionList(): js.Array[FieldDescriptorProto] = js.native
  
  def getExtensionRangeList(): js.Array[ExtensionRange] = js.native
  
  def getFieldList(): js.Array[FieldDescriptorProto] = js.native
  
  def getName(): js.UndefOr[String] = js.native
  
  def getNestedTypeList(): js.Array[DescriptorProto] = js.native
  
  def getOneofDeclList(): js.Array[OneofDescriptorProto] = js.native
  
  def getOptions(): js.UndefOr[MessageOptions] = js.native
  
  def getReservedNameList(): js.Array[String] = js.native
  
  def getReservedRangeList(): js.Array[ReservedRange] = js.native
  
  def hasName(): Boolean = js.native
  
  def hasOptions(): Boolean = js.native
  
  def setEnumTypeList(value: js.Array[EnumDescriptorProto]): DescriptorProto = js.native
  
  def setExtensionList(value: js.Array[FieldDescriptorProto]): DescriptorProto = js.native
  
  def setExtensionRangeList(value: js.Array[ExtensionRange]): DescriptorProto = js.native
  
  def setFieldList(value: js.Array[FieldDescriptorProto]): DescriptorProto = js.native
  
  def setName(value: String): DescriptorProto = js.native
  
  def setNestedTypeList(value: js.Array[DescriptorProto]): DescriptorProto = js.native
  
  def setOneofDeclList(value: js.Array[OneofDescriptorProto]): DescriptorProto = js.native
  
  def setOptions(): DescriptorProto = js.native
  def setOptions(value: MessageOptions): DescriptorProto = js.native
  
  def setReservedNameList(value: js.Array[String]): DescriptorProto = js.native
  
  def setReservedRangeList(value: js.Array[ReservedRange]): DescriptorProto = js.native
}
/* static members */
object DescriptorProto {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
  @js.native
  class ExtensionRange () extends Message {
    
    def clearEnd(): ExtensionRange = js.native
    
    def clearOptions(): ExtensionRange = js.native
    
    def clearStart(): ExtensionRange = js.native
    
    def getEnd(): js.UndefOr[Double] = js.native
    
    def getOptions(): js.UndefOr[ExtensionRangeOptions] = js.native
    
    def getStart(): js.UndefOr[Double] = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasOptions(): Boolean = js.native
    
    def hasStart(): Boolean = js.native
    
    def setEnd(value: Double): ExtensionRange = js.native
    
    def setOptions(): ExtensionRange = js.native
    def setOptions(value: ExtensionRangeOptions): ExtensionRange = js.native
    
    def setStart(value: Double): ExtensionRange = js.native
  }
  /* static members */
  object ExtensionRange {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): ExtensionRange = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ExtensionRange, reader: BinaryReader): ExtensionRange = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ExtensionRange, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ExtensionRange.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ExtensionRange): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var end: js.UndefOr[Double] = js.native
      
      var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject] = js.native
      
      var start: js.UndefOr[Double] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange")
  @js.native
  class ReservedRange () extends Message {
    
    def clearEnd(): ReservedRange = js.native
    
    def clearStart(): ReservedRange = js.native
    
    def getEnd(): js.UndefOr[Double] = js.native
    
    def getStart(): js.UndefOr[Double] = js.native
    
    def hasEnd(): Boolean = js.native
    
    def hasStart(): Boolean = js.native
    
    def setEnd(value: Double): ReservedRange = js.native
    
    def setStart(value: Double): ReservedRange = js.native
  }
  /* static members */
  object ReservedRange {
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: js.typedarray.Uint8Array): ReservedRange = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ReservedRange, reader: BinaryReader): ReservedRange = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ReservedRange, writer: BinaryWriter): Unit = js.native
    
    @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.ReservedRange.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ReservedRange): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var end: js.UndefOr[Double] = js.native
      
      var start: js.UndefOr[Double] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): DescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: DescriptorProto, reader: BinaryReader): DescriptorProto = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: DescriptorProto, writer: BinaryWriter): Unit = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "DescriptorProto.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: DescriptorProto): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var enumTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject] = js.native
    
    var extensionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
    
    var extensionRangeList: js.Array[
        typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject
      ] = js.native
    
    var fieldList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nestedTypeList: js.Array[AsObject] = js.native
    
    var oneofDeclList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject] = js.native
    
    var options: js.UndefOr[typingsSlinky.googleProtobuf.descriptorPbMod.MessageOptions.AsObject] = js.native
    
    var reservedNameList: js.Array[String] = js.native
    
    var reservedRangeList: js.Array[
        typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject
      ] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      enumTypeList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject],
      extensionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
      extensionRangeList: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject
        ],
      fieldList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject],
      nestedTypeList: js.Array[AsObject],
      oneofDeclList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject],
      reservedNameList: js.Array[String],
      reservedRangeList: js.Array[
          typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(enumTypeList = enumTypeList.asInstanceOf[js.Any], extensionList = extensionList.asInstanceOf[js.Any], extensionRangeList = extensionRangeList.asInstanceOf[js.Any], fieldList = fieldList.asInstanceOf[js.Any], nestedTypeList = nestedTypeList.asInstanceOf[js.Any], oneofDeclList = oneofDeclList.asInstanceOf[js.Any], reservedNameList = reservedNameList.asInstanceOf[js.Any], reservedRangeList = reservedRangeList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnumTypeList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject]): Self = StObject.set(x, "enumTypeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumTypeListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.EnumDescriptorProto.AsObject*): Self = StObject.set(x, "enumTypeList", js.Array(value :_*))
      
      @scala.inline
      def setExtensionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = StObject.set(x, "extensionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = StObject.set(x, "extensionList", js.Array(value :_*))
      
      @scala.inline
      def setExtensionRangeList(
        value: js.Array[
              typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject
            ]
      ): Self = StObject.set(x, "extensionRangeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionRangeListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange.AsObject*): Self = StObject.set(x, "extensionRangeList", js.Array(value :_*))
      
      @scala.inline
      def setFieldList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject]): Self = StObject.set(x, "fieldList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.FieldDescriptorProto.AsObject*): Self = StObject.set(x, "fieldList", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNestedTypeList(value: js.Array[AsObject]): Self = StObject.set(x, "nestedTypeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedTypeListVarargs(value: AsObject*): Self = StObject.set(x, "nestedTypeList", js.Array(value :_*))
      
      @scala.inline
      def setOneofDeclList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject]): Self = StObject.set(x, "oneofDeclList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofDeclListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.OneofDescriptorProto.AsObject*): Self = StObject.set(x, "oneofDeclList", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: typingsSlinky.googleProtobuf.descriptorPbMod.MessageOptions.AsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setReservedNameList(value: js.Array[String]): Self = StObject.set(x, "reservedNameList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedNameListVarargs(value: String*): Self = StObject.set(x, "reservedNameList", js.Array(value :_*))
      
      @scala.inline
      def setReservedRangeList(
        value: js.Array[
              typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject
            ]
      ): Self = StObject.set(x, "reservedRangeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedRangeListVarargs(value: typingsSlinky.googleProtobuf.descriptorPbMod.DescriptorProto.ReservedRange.AsObject*): Self = StObject.set(x, "reservedRangeList", js.Array(value :_*))
    }
  }
}
