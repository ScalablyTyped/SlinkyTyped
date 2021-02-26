package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWriteSegmentRequestMod {
  
  @js.native
  trait UnmarshalledWriteSegmentRequest extends WriteSegmentRequest {
    
    /**
      * The segment dimensions attributes.
      */
    @JSName("Dimensions")
    var Dimensions_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentDimensions] = js.native
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
      */
    @JSName("SegmentGroups")
    var SegmentGroups_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentGroupList] = js.native
  }
  object UnmarshalledWriteSegmentRequest {
    
    @scala.inline
    def apply(): UnmarshalledWriteSegmentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWriteSegmentRequest]
    }
    
    @scala.inline
    implicit class UnmarshalledWriteSegmentRequestMutableBuilder[Self <: UnmarshalledWriteSegmentRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: UnmarshalledSegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setSegmentGroups(value: UnmarshalledSegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    }
  }
  
  @js.native
  trait WriteSegmentRequest extends StObject {
    
    /**
      * The segment dimensions attributes.
      */
    var Dimensions: js.UndefOr[SegmentDimensions] = js.native
    
    /**
      * The name of segment
      */
    var Name: js.UndefOr[String] = js.native
    
    /**
      * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
      */
    var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  }
  object WriteSegmentRequest {
    
    @scala.inline
    def apply(): WriteSegmentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteSegmentRequest]
    }
    
    @scala.inline
    implicit class WriteSegmentRequestMutableBuilder[Self <: WriteSegmentRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: SegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      @scala.inline
      def setSegmentGroups(value: SegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    }
  }
}
