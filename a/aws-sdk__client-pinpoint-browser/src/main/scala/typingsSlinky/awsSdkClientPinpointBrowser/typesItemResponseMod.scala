package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.UnmarshalledEndpointItemResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventItemResponseMod.EventItemResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventItemResponseMod.UnmarshalledEventItemResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesItemResponseMod {
  
  @js.native
  trait ItemResponse extends StObject {
    
    /**
      * The response received after the endpoint was accepted.
      */
    var EndpointItemResponse: js.UndefOr[
        typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
      ] = js.native
    
    /**
      * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
      */
    var EventsItemResponse: js.UndefOr[
        StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])
      ] = js.native
  }
  object ItemResponse {
    
    @scala.inline
    def apply(): ItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemResponse]
    }
    
    @scala.inline
    implicit class ItemResponseMutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointItemResponse(value: EndpointItemResponse): Self = StObject.set(x, "EndpointItemResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointItemResponseUndefined: Self = StObject.set(x, "EndpointItemResponse", js.undefined)
      
      @scala.inline
      def setEventsItemResponse(value: StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsItemResponseIterable(value: js.Iterable[js.Tuple2[String, EventItemResponse]]): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsItemResponseUndefined: Self = StObject.set(x, "EventsItemResponse", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledItemResponse extends ItemResponse {
    
    /**
      * The response received after the endpoint was accepted.
      */
    @JSName("EndpointItemResponse")
    var EndpointItemResponse_UnmarshalledItemResponse: js.UndefOr[UnmarshalledEndpointItemResponse] = js.native
    
    /**
      * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
      */
    @JSName("EventsItemResponse")
    var EventsItemResponse_UnmarshalledItemResponse: js.UndefOr[StringDictionary[UnmarshalledEventItemResponse]] = js.native
  }
  object UnmarshalledItemResponse {
    
    @scala.inline
    def apply(): UnmarshalledItemResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledItemResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledItemResponseMutableBuilder[Self <: UnmarshalledItemResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointItemResponse(value: UnmarshalledEndpointItemResponse): Self = StObject.set(x, "EndpointItemResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointItemResponseUndefined: Self = StObject.set(x, "EndpointItemResponse", js.undefined)
      
      @scala.inline
      def setEventsItemResponse(value: StringDictionary[UnmarshalledEventItemResponse]): Self = StObject.set(x, "EventsItemResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsItemResponseUndefined: Self = StObject.set(x, "EventsItemResponse", js.undefined)
    }
  }
}
