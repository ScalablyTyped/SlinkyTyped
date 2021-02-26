package typingsSlinky.leafletResponsivePopup

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.PopupOptions
import typingsSlinky.leaflet.mod.Popup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", "ResponsivePopup")
  @js.native
  class ResponsivePopup_ () extends Popup_ {
    def this(options: ResponsivePopupOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], source: Layer) = this()
    def this(options: ResponsivePopupOptions, source: Layer) = this()
  }
  
  @JSImport("leaflet", "responsivePopup")
  @js.native
  def responsivePopup(options: js.UndefOr[ResponsivePopupOptions], source: js.UndefOr[Layer]): ResponsivePopup_ = js.native
  
  @js.native
  trait ResponsivePopupOptions extends PopupOptions {
    
    var hasTip: js.UndefOr[Boolean] = js.native
  }
  object ResponsivePopupOptions {
    
    @scala.inline
    def apply(): ResponsivePopupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsivePopupOptions]
    }
    
    @scala.inline
    implicit class ResponsivePopupOptionsMutableBuilder[Self <: ResponsivePopupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasTip(value: Boolean): Self = StObject.set(x, "hasTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTipUndefined: Self = StObject.set(x, "hasTip", js.undefined)
    }
  }
}
