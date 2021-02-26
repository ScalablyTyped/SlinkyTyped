package typingsSlinky.googleGax

import typingsSlinky.googleGax.statusMod.Status
import typingsSlinky.node.Buffer
import typingsSlinky.protobufjs.mod.Message
import typingsSlinky.protobufjs.mod.Root
import typingsSlinky.protobufjs.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackErrorMod {
  
  @JSImport("google-gax/build/src/fallbackError", "FallbackErrorDecoder")
  @js.native
  class FallbackErrorDecoder () extends StObject {
    
    var anyType: Type = js.native
    
    def callErrorFromStatus(status: FallbackStatusObject): FallbackServiceError = js.native
    
    def decodeErrorFromBuffer(buffer: js.typedarray.ArrayBuffer): js.Error = js.native
    def decodeErrorFromBuffer(buffer: Buffer): js.Error = js.native
    
    def decodeProtobufAny(anyValue: ProtobufAny): Message[js.Object] = js.native
    
    def decodeRpcStatus(buffer: js.typedarray.ArrayBuffer): FallbackStatusObject = js.native
    def decodeRpcStatus(buffer: Buffer): FallbackStatusObject = js.native
    
    var root: Root = js.native
    
    var statusType: Type = js.native
  }
  
  type FallbackServiceError = FallbackStatusObject with js.Error
  
  @js.native
  trait FallbackStatusObject extends StObject {
    
    var code: Status = js.native
    
    var details: js.Array[js.Object] = js.native
    
    var message: String = js.native
  }
  object FallbackStatusObject {
    
    @scala.inline
    def apply(code: Status, details: js.Array[js.Object], message: String): FallbackStatusObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackStatusObject]
    }
    
    @scala.inline
    implicit class FallbackStatusObjectMutableBuilder[Self <: FallbackStatusObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtobufAny extends StObject {
    
    var type_url: String = js.native
    
    var value: js.typedarray.Uint8Array = js.native
  }
  object ProtobufAny {
    
    @scala.inline
    def apply(type_url: String, value: js.typedarray.Uint8Array): ProtobufAny = {
      val __obj = js.Dynamic.literal(type_url = type_url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtobufAny]
    }
    
    @scala.inline
    implicit class ProtobufAnyMutableBuilder[Self <: ProtobufAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType_url(value: String): Self = StObject.set(x, "type_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
