package typingsSlinky.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError")
@js.native
class ArithmeticError () extends Message {
  
  def getErrorCode(): ArithmeticErrorType = js.native
  
  def setErrorCode(value: ArithmeticErrorType): Unit = js.native
}
/* static members */
object ArithmeticError {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ArithmeticErrorType extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.ArithmeticErrorType")
  @js.native
  object ArithmeticErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArithmeticErrorType with Double] = js.native
    
    @js.native
    sealed trait DIVISIONBYZERO extends ArithmeticErrorType
    /* 3 */ val DIVISIONBYZERO: typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType.DIVISIONBYZERO with Double = js.native
    
    @js.native
    sealed trait OVERFLOW extends ArithmeticErrorType
    /* 2 */ val OVERFLOW: typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType.OVERFLOW with Double = js.native
    
    @js.native
    sealed trait UNDERFLOW extends ArithmeticErrorType
    /* 1 */ val UNDERFLOW: typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType.UNDERFLOW with Double = js.native
    
    @js.native
    sealed trait UNKNOWNARITHMETICERROR extends ArithmeticErrorType
    /* 0 */ val UNKNOWNARITHMETICERROR: typingsSlinky.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType.UNKNOWNARITHMETICERROR with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): ArithmeticError = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: ArithmeticError, reader: BinaryReader): ArithmeticError = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: ArithmeticError, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: ArithmeticError): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var errorCode: ArithmeticErrorType = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(errorCode: ArithmeticErrorType): AsObject = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: ArithmeticErrorType): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
}
