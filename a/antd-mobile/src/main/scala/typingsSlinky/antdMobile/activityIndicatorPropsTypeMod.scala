package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.antdMobileStrings.large
import typingsSlinky.antdMobile.antdMobileStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorPropsTypeMod {
  
  @js.native
  trait ActivityIndicatorPropTypes extends StObject {
    
    var animating: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[large | small] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var toast: js.UndefOr[Boolean] = js.native
  }
  object ActivityIndicatorPropTypes {
    
    @scala.inline
    def apply(): ActivityIndicatorPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityIndicatorPropTypes]
    }
    
    @scala.inline
    implicit class ActivityIndicatorPropTypesMutableBuilder[Self <: ActivityIndicatorPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setToast(value: Boolean): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    }
  }
}
