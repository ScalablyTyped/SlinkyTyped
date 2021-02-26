package typingsSlinky.reactLeaflet

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.Path
import typingsSlinky.leaflet.mod.Popup_
import typingsSlinky.leaflet.mod.Tooltip_
import typingsSlinky.reactLeaflet.mod.AddLayerHandler
import typingsSlinky.reactLeaflet.mod.RemoveLayerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AddBaseLayer extends StObject {
    
    var addBaseLayer: AddLayerHandler = js.native
    
    var addOverlay: AddLayerHandler = js.native
    
    var removeLayer: RemoveLayerHandler = js.native
    
    var removeLayerControl: RemoveLayerHandler = js.native
  }
  object AddBaseLayer {
    
    @scala.inline
    def apply(
      addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
      addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
      removeLayer: /* layer */ Layer => Unit,
      removeLayerControl: /* layer */ Layer => Unit
    ): AddBaseLayer = {
      val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3(addBaseLayer), addOverlay = js.Any.fromFunction3(addOverlay), removeLayer = js.Any.fromFunction1(removeLayer), removeLayerControl = js.Any.fromFunction1(removeLayerControl))
      __obj.asInstanceOf[AddBaseLayer]
    }
    
    @scala.inline
    implicit class AddBaseLayerMutableBuilder[Self <: AddBaseLayer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addBaseLayer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addOverlay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveLayer(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveLayerControl(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayerControl", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[String] = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Popup[E /* <: Popup_ */] extends StObject {
    
    var popup: E = js.native
  }
  object Popup {
    
    @scala.inline
    def apply[E /* <: Popup_ */](popup: E): Popup[E] = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Popup[E]]
    }
    
    @scala.inline
    implicit class PopupMutableBuilder[Self <: Popup[_], E /* <: Popup_ */] (val x: Self with Popup[E]) extends AnyVal {
      
      @scala.inline
      def setPopup(value: E): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopupContainer[E /* <: Path */] extends StObject {
    
    var popupContainer: E = js.native
  }
  object PopupContainer {
    
    @scala.inline
    def apply[E /* <: Path */](popupContainer: E): PopupContainer[E] = {
      val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupContainer[E]]
    }
    
    @scala.inline
    implicit class PopupContainerMutableBuilder[Self <: PopupContainer[_], E /* <: Path */] (val x: Self with PopupContainer[E]) extends AnyVal {
      
      @scala.inline
      def setPopupContainer(value: E): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tooltip[E /* <: Tooltip_ */] extends StObject {
    
    var tooltip: E = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply[E /* <: Tooltip_ */](tooltip: E): Tooltip[E] = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tooltip[E]]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip[_], E /* <: Tooltip_ */] (val x: Self with Tooltip[E]) extends AnyVal {
      
      @scala.inline
      def setTooltip(value: E): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
