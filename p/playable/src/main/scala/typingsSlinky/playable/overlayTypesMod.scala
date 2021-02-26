package typingsSlinky.playable

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.themeTypesMod.IThemeService
import typingsSlinky.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayTypesMod {
  
  @js.native
  trait IOverlay extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPoster(src: String): Unit = js.native
    
    def show(): Unit = js.native
  }
  object IOverlay {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      setPoster: String => Unit,
      show: () => Unit
    ): IOverlay = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setPoster = js.Any.fromFunction1(setPoster), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IOverlay]
    }
    
    @scala.inline
    implicit class IOverlayMutableBuilder[Self <: IOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetPoster(value: String => Unit): Self = StObject.set(x, "setPoster", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IOverlayAPI extends StObject {
    
    var hideOverlay: js.UndefOr[js.Function0[Unit]] = js.native
    
    var setPoster: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.native
    
    var showOverlay: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IOverlayAPI {
    
    @scala.inline
    def apply(): IOverlayAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayAPI]
    }
    
    @scala.inline
    implicit class IOverlayAPIMutableBuilder[Self <: IOverlayAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideOverlay(value: () => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
      
      @scala.inline
      def setSetPoster(value: /* src */ String => Unit): Self = StObject.set(x, "setPoster", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPosterUndefined: Self = StObject.set(x, "setPoster", js.undefined)
      
      @scala.inline
      def setShowOverlay(value: () => Unit): Self = StObject.set(x, "showOverlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
    }
  }
  
  @js.native
  trait IOverlayViewCallbacks extends StObject {
    
    var onPlayClick: EventListenerOrEventListenerObject = js.native
  }
  object IOverlayViewCallbacks {
    
    @scala.inline
    def apply(onPlayClick: EventListenerOrEventListenerObject): IOverlayViewCallbacks = {
      val __obj = js.Dynamic.literal(onPlayClick = onPlayClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewCallbacks]
    }
    
    @scala.inline
    implicit class IOverlayViewCallbacksMutableBuilder[Self <: IOverlayViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPlayClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onPlayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onPlayClick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IOverlayViewConfig extends StObject {
    
    var callbacks: IOverlayViewCallbacks = js.native
    
    var theme: IThemeService = js.native
  }
  object IOverlayViewConfig {
    
    @scala.inline
    def apply(callbacks: IOverlayViewCallbacks, theme: IThemeService): IOverlayViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewConfig]
    }
    
    @scala.inline
    implicit class IOverlayViewConfigMutableBuilder[Self <: IOverlayViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IOverlayViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOverlayViewStyles extends StObject {
    
    var active: String = js.native
    
    var hidden: String = js.native
    
    var overlay: String = js.native
    
    var poster: String = js.native
    
    var transparency: String = js.native
  }
  object IOverlayViewStyles {
    
    @scala.inline
    def apply(active: String, hidden: String, overlay: String, poster: String, transparency: String): IOverlayViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewStyles]
    }
    
    @scala.inline
    implicit class IOverlayViewStylesMutableBuilder[Self <: IOverlayViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    }
  }
}
