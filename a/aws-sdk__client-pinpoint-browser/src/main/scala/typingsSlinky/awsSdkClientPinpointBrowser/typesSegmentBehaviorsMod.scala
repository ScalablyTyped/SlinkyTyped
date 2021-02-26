package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesRecencyDimensionMod.RecencyDimension
import typingsSlinky.awsSdkClientPinpointBrowser.typesRecencyDimensionMod.UnmarshalledRecencyDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentBehaviorsMod {
  
  @js.native
  trait SegmentBehaviors extends StObject {
    
    /**
      * The recency of use.
      */
    var Recency: js.UndefOr[RecencyDimension] = js.native
  }
  object SegmentBehaviors {
    
    @scala.inline
    def apply(): SegmentBehaviors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentBehaviors]
    }
    
    @scala.inline
    implicit class SegmentBehaviorsMutableBuilder[Self <: SegmentBehaviors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecency(value: RecencyDimension): Self = StObject.set(x, "Recency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecencyUndefined: Self = StObject.set(x, "Recency", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSegmentBehaviors extends SegmentBehaviors {
    
    /**
      * The recency of use.
      */
    @JSName("Recency")
    var Recency_UnmarshalledSegmentBehaviors: js.UndefOr[UnmarshalledRecencyDimension] = js.native
  }
  object UnmarshalledSegmentBehaviors {
    
    @scala.inline
    def apply(): UnmarshalledSegmentBehaviors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSegmentBehaviors]
    }
    
    @scala.inline
    implicit class UnmarshalledSegmentBehaviorsMutableBuilder[Self <: UnmarshalledSegmentBehaviors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecency(value: UnmarshalledRecencyDimension): Self = StObject.set(x, "Recency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecencyUndefined: Self = StObject.set(x, "Recency", js.undefined)
    }
  }
}
