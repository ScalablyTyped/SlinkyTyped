package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod.SegmentResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentsResponseMod {
  
  @js.native
  trait SegmentsResponse extends StObject {
    
    /**
      * The list of segments.
      */
    var Item: js.UndefOr[js.Array[SegmentResponse] | js.Iterable[SegmentResponse]] = js.native
    
    /**
      * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object SegmentsResponse {
    
    @scala.inline
    def apply(): SegmentsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentsResponse]
    }
    
    @scala.inline
    implicit class SegmentsResponseMutableBuilder[Self <: SegmentsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[SegmentResponse] | js.Iterable[SegmentResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIterable(value: js.Iterable[SegmentResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: SegmentResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSegmentsResponse extends SegmentsResponse {
    
    /**
      * The list of segments.
      */
    @JSName("Item")
    var Item_UnmarshalledSegmentsResponse: js.UndefOr[js.Array[UnmarshalledSegmentResponse]] = js.native
  }
  object UnmarshalledSegmentsResponse {
    
    @scala.inline
    def apply(): UnmarshalledSegmentsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentsResponseMutableBuilder[Self <: UnmarshalledSegmentsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledSegmentResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledSegmentResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
