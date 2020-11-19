package typingsSlinky.googleProtobuf.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.anon.Instantiable
import typingsSlinky.googleProtobuf.anon.TypeofMessage
import typingsSlinky.googleProtobuf.mod.Message.MessageArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "Message")
@js.native
abstract class Message () extends js.Object {
  
  def cloneMessage(): this.type = js.native
  
  def getExtension[T](fieldInfo: ExtensionFieldInfo[T]): T = js.native
  
  def getJsPbMessageId(): js.UndefOr[String] = js.native
  
  def readBinaryExtension(
    proto: Message,
    reader: BinaryReader,
    extensions: NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    setExtensionFn: js.Function2[/* fieldInfo */ ExtensionFieldInfo[_], /* val */ js.Any, Unit]
  ): Unit = js.native
  
  def serializeBinary(): js.typedarray.Uint8Array = js.native
  
  def serializeBinaryExtensions(
    proto: Message,
    writer: BinaryWriter,
    extensions: NumberDictionary[ExtensionFieldBinaryInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[_], _]
  ): Unit = js.native
  
  def setExtension[T](fieldInfo: ExtensionFieldInfo[T], value: T): Unit = js.native
  
  def toArray(): MessageArray = js.native
  
  def toObject(): js.Object = js.native
  def toObject(includeInstance: Boolean): js.Object = js.native
}
/* static members */
@JSImport("google-protobuf", "Message")
@js.native
object Message extends js.Object {
  
  def addToRepeatedField(msg: Message, fieldNumber: Double, value: js.Any): Unit = js.native
  def addToRepeatedField(msg: Message, fieldNumber: Double, value: js.Any, index: Double): Unit = js.native
  
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: Instantiable[T]): T = js.native
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T, ctor: Instantiable[T], index: Double): T = js.native
  def addToRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: js.UndefOr[scala.Nothing], ctor: Instantiable[T]): T = js.native
  def addToRepeatedWrapperField[T /* <: Message */](
    msg: Message,
    fieldNumber: Double,
    value: js.UndefOr[scala.Nothing],
    ctor: Instantiable[T],
    index: Double
  ): T = js.native
  
  def bytesAsB64(bytes: js.typedarray.Uint8Array): String = js.native
  
  def bytesAsU8(str: String): js.typedarray.Uint8Array = js.native
  
  def bytesListAsB64(bytesList: js.Array[js.typedarray.Uint8Array]): js.Array[String] = js.native
  
  def bytesListAsU8(strList: js.Array[String]): js.Array[js.typedarray.Uint8Array] = js.native
  
  def clone[T /* <: Message */](msg: T): T = js.native
  
  def cloneMessage[T /* <: Message */](msg: T): T = js.native
  
  def compareExtensions(extension1: js.Object, extension2: js.Object): Boolean = js.native
  
  def compareFields(field1: js.Any, field2: js.Any): Boolean = js.native
  
  def computeOneofCase(msg: Message, oneof: js.Array[Double]): Double = js.native
  
  def copyInto(fromMessage: Message, toMessage: Message): Unit = js.native
  
  // These are `abstract static`, but that isn't allowed. Subclasses of Message will have these methods and properties
  // and not having them on Message makes using this class for its intended purpose quite difficult.
  def deserializeBinary(bytes: js.typedarray.Uint8Array): Message = js.native
  
  def deserializeBinaryFromReader(message: Message, reader: BinaryReader): Message = js.native
  
  def difference[T /* <: Message */](m1: T, m2: T): T = js.native
  
  def equals(m1: Message, m2: Message): Boolean = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def getField(msg: Message, fieldNumber: Double): FieldValue | Null = js.native
  
  def getFieldWithDefault[T](msg: Message, fieldNumber: Double, defaultValue: T): T = js.native
  
  def getMapField(msg: Message, fieldNumber: Double, noLazyCreate: Boolean, valueCtor: TypeofMessage): Map[_, _] = js.native
  
  def getOptionalFloatingPointField(msg: Message, fieldNumber: Double): js.UndefOr[Double] = js.native
  
  def getRepeatedFloatingPointField(msg: Message, fieldNumber: Double): js.Array[Double] = js.native
  
  def getRepeatedWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double): js.Array[T] = js.native
  
  def getWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double): T = js.native
  def getWrapperField[T /* <: Message */](msg: Message, ctor: Instantiable[T], fieldNumber: Double, required: Double): T = js.native
  
  def initialize(msg: Message, data: MessageArray, messageId: String, suggestedPivot: Double): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.UndefOr[scala.Nothing],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: String,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = js.native
  def initialize(msg: Message, data: MessageArray, messageId: Double, suggestedPivot: Double): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.UndefOr[scala.Nothing],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double]
  ): Unit = js.native
  def initialize(
    msg: Message,
    data: MessageArray,
    messageId: Double,
    suggestedPivot: Double,
    repeatedFields: js.Array[Double],
    oneofFields: js.Array[js.Array[Double]]
  ): Unit = js.native
  
  def registerMessageType(id: Double, constructor: TypeofMessage): Unit = js.native
  
  def serializeBinaryToWriter(message: Message, writer: BinaryWriter): Unit = js.native
  
  def setField(msg: Message, fieldNumber: Double, value: FieldValue): Unit = js.native
  
  def setOneofField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: FieldValue): Unit = js.native
  
  def setOneofWrapperField(msg: Message, fieldNumber: Double, oneof: js.Array[Double], value: js.Any): Unit = js.native
  
  def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = js.native
  def setRepeatedWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: js.Array[T]): Unit = js.native
  
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double): Unit = js.native
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: T): Unit = js.native
  def setWrapperField[T /* <: Message */](msg: Message, fieldNumber: Double, value: Map[_, _]): Unit = js.native
  
  def toMap(field: js.Array[_], mapKeyGetterFn: js.Function1[/* field */ js.Any, String]): Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: js.UndefOr[scala.Nothing],
    includeInstance: Boolean
  ): Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: StaticToObject
  ): Unit = js.native
  def toMap(
    field: js.Array[_],
    mapKeyGetterFn: js.Function1[/* field */ js.Any, String],
    toObjectFn: StaticToObject,
    includeInstance: Boolean
  ): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: Message): js.Object = js.native
  
  def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type]
  ): Unit = js.native
  def toObjectExtension(
    msg: Message,
    obj: js.Object,
    extensions: NumberDictionary[ExtensionFieldInfo[Message]],
    getExtensionFn: js.Function1[/* fieldInfo */ ExtensionFieldInfo[this.type], this.type],
    includeInstance: Boolean
  ): Unit = js.native
  
  def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object]
  ): js.Array[js.Object] = js.native
  def toObjectList[T /* <: Message */](
    field: js.Array[T],
    toObjectFn: js.Function2[/* includeInstance */ Boolean, /* data */ T, js.Object],
    includeInstance: Boolean
  ): js.Array[js.Object] = js.native
  
  type MessageArray = js.Array[js.Any]
  
  type StaticToObject = js.Function2[/* includeInstance */ Boolean, /* msg */ Message, js.Object]
}
