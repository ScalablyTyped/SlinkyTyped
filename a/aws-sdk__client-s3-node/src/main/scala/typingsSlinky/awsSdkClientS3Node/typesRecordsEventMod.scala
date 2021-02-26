package typingsSlinky.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRecordsEventMod {
  
  @js.native
  trait RecordsEvent extends StObject {
    
    /**
      * <p>The byte array of partial, one or more result records.</p>
      */
    var Payload: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.native
  }
  object RecordsEvent {
    
    @scala.inline
    def apply(): RecordsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordsEvent]
    }
    
    @scala.inline
    implicit class RecordsEventMutableBuilder[Self <: RecordsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledRecordsEvent extends RecordsEvent {
    
    /**
      * <p>The byte array of partial, one or more result records.</p>
      */
    @JSName("Payload")
    var Payload_UnmarshalledRecordsEvent: js.UndefOr[js.typedarray.Uint8Array] = js.native
  }
  object UnmarshalledRecordsEvent {
    
    @scala.inline
    def apply(): UnmarshalledRecordsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledRecordsEvent]
    }
    
    @scala.inline
    implicit class UnmarshalledRecordsEventMutableBuilder[Self <: UnmarshalledRecordsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
}
