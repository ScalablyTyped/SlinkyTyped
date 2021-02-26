package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.EndpointBatchItem
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.UnmarshalledEndpointBatchItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointBatchRequestMod {
  
  @js.native
  trait EndpointBatchRequest extends StObject {
    
    /**
      * List of items to update. Maximum 100 items
      */
    var Item: js.UndefOr[js.Array[EndpointBatchItem] | js.Iterable[EndpointBatchItem]] = js.native
  }
  object EndpointBatchRequest {
    
    @scala.inline
    def apply(): EndpointBatchRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointBatchRequest]
    }
    
    @scala.inline
    implicit class EndpointBatchRequestMutableBuilder[Self <: EndpointBatchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[EndpointBatchItem] | js.Iterable[EndpointBatchItem]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIterable(value: js.Iterable[EndpointBatchItem]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: EndpointBatchItem*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledEndpointBatchRequest extends EndpointBatchRequest {
    
    /**
      * List of items to update. Maximum 100 items
      */
    @JSName("Item")
    var Item_UnmarshalledEndpointBatchRequest: js.UndefOr[js.Array[UnmarshalledEndpointBatchItem]] = js.native
  }
  object UnmarshalledEndpointBatchRequest {
    
    @scala.inline
    def apply(): UnmarshalledEndpointBatchRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointBatchRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledEndpointBatchRequestMutableBuilder[Self <: UnmarshalledEndpointBatchRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledEndpointBatchItem]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledEndpointBatchItem*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
