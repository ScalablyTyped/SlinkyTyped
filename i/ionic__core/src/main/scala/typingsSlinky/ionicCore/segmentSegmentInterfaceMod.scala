package typingsSlinky.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentSegmentInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-top`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-start`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-end`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-bottom`
    - typingsSlinky.ionicCore.ionicCoreStrings.`icon-hide`
    - typingsSlinky.ionicCore.ionicCoreStrings.`label-hide`
  */
  trait SegmentButtonLayout extends StObject
  object SegmentButtonLayout {
    
    @scala.inline
    def `icon-bottom`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-bottom` = "icon-bottom".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-bottom`]
    
    @scala.inline
    def `icon-end`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-end` = "icon-end".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-end`]
    
    @scala.inline
    def `icon-hide`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-hide` = "icon-hide".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-hide`]
    
    @scala.inline
    def `icon-start`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-start` = "icon-start".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-start`]
    
    @scala.inline
    def `icon-top`: typingsSlinky.ionicCore.ionicCoreStrings.`icon-top` = "icon-top".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`icon-top`]
    
    @scala.inline
    def `label-hide`: typingsSlinky.ionicCore.ionicCoreStrings.`label-hide` = "label-hide".asInstanceOf[typingsSlinky.ionicCore.ionicCoreStrings.`label-hide`]
  }
  
  @js.native
  trait SegmentChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String] = js.native
  }
  object SegmentChangeEventDetail {
    
    @scala.inline
    def apply(): SegmentChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentChangeEventDetail]
    }
    
    @scala.inline
    implicit class SegmentChangeEventDetailMutableBuilder[Self <: SegmentChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
