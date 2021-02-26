package typingsSlinky.reactPortalTooltip

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ArrowStyle extends StObject {
    
    var arrowStyle: js.UndefOr[CSSProperties] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ArrowStyle {
    
    @scala.inline
    def apply(): ArrowStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowStyle]
    }
    
    @scala.inline
    implicit class ArrowStyleMutableBuilder[Self <: ArrowStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowStyle(value: CSSProperties): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
