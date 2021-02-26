package typingsSlinky.hopscotch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CloseTooltip extends StObject {
    
    var closeTooltip: js.UndefOr[String] = js.native
    
    var doneBtn: js.UndefOr[String] = js.native
    
    var nextBtn: js.UndefOr[String] = js.native
    
    var prevBtn: js.UndefOr[String] = js.native
    
    var skipBtn: js.UndefOr[String] = js.native
    
    var stepNums: js.UndefOr[js.Array[String]] = js.native
  }
  object CloseTooltip {
    
    @scala.inline
    def apply(): CloseTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseTooltip]
    }
    
    @scala.inline
    implicit class CloseTooltipMutableBuilder[Self <: CloseTooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseTooltip(value: String): Self = StObject.set(x, "closeTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTooltipUndefined: Self = StObject.set(x, "closeTooltip", js.undefined)
      
      @scala.inline
      def setDoneBtn(value: String): Self = StObject.set(x, "doneBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoneBtnUndefined: Self = StObject.set(x, "doneBtn", js.undefined)
      
      @scala.inline
      def setNextBtn(value: String): Self = StObject.set(x, "nextBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextBtnUndefined: Self = StObject.set(x, "nextBtn", js.undefined)
      
      @scala.inline
      def setPrevBtn(value: String): Self = StObject.set(x, "prevBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevBtnUndefined: Self = StObject.set(x, "prevBtn", js.undefined)
      
      @scala.inline
      def setSkipBtn(value: String): Self = StObject.set(x, "skipBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBtnUndefined: Self = StObject.set(x, "skipBtn", js.undefined)
      
      @scala.inline
      def setStepNums(value: js.Array[String]): Self = StObject.set(x, "stepNums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNumsUndefined: Self = StObject.set(x, "stepNums", js.undefined)
      
      @scala.inline
      def setStepNumsVarargs(value: String*): Self = StObject.set(x, "stepNums", js.Array(value :_*))
    }
  }
}
