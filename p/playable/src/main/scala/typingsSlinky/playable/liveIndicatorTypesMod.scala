package typingsSlinky.playable

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.textMapTypesMod.ITextMap
import typingsSlinky.playable.tooltipTypesMod.ITooltipService
import typingsSlinky.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveIndicatorTypesMod {
  
  @js.native
  trait ILiveIndicator extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    var isActive: Boolean = js.native
    
    var isHidden: Boolean = js.native
    
    def show(): Unit = js.native
  }
  object ILiveIndicator {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isActive: Boolean,
      isHidden: Boolean,
      show: () => Unit
    ): ILiveIndicator = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ILiveIndicator]
    }
    
    @scala.inline
    implicit class ILiveIndicatorMutableBuilder[Self <: ILiveIndicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ILiveIndicatorViewCallbacks extends StObject {
    
    var onClick: EventListenerOrEventListenerObject = js.native
  }
  object ILiveIndicatorViewCallbacks {
    
    @scala.inline
    def apply(onClick: EventListenerOrEventListenerObject): ILiveIndicatorViewCallbacks = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewCallbacks]
    }
    
    @scala.inline
    implicit class ILiveIndicatorViewCallbacksMutableBuilder[Self <: ILiveIndicatorViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ILiveIndicatorViewConfig extends StObject {
    
    var callbacks: ILiveIndicatorViewCallbacks = js.native
    
    var textMap: ITextMap = js.native
    
    var tooltipService: ITooltipService = js.native
  }
  object ILiveIndicatorViewConfig {
    
    @scala.inline
    def apply(callbacks: ILiveIndicatorViewCallbacks, textMap: ITextMap, tooltipService: ITooltipService): ILiveIndicatorViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewConfig]
    }
    
    @scala.inline
    implicit class ILiveIndicatorViewConfigMutableBuilder[Self <: ILiveIndicatorViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: ILiveIndicatorViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILiveIndicatorViewStyles extends StObject {
    
    var active: String = js.native
    
    var clickable: String = js.native
    
    var ended: String = js.native
    
    var hidden: String = js.native
    
    var liveIndicator: String = js.native
    
    var liveIndicatorButton: String = js.native
  }
  object ILiveIndicatorViewStyles {
    
    @scala.inline
    def apply(
      active: String,
      clickable: String,
      ended: String,
      hidden: String,
      liveIndicator: String,
      liveIndicatorButton: String
    ): ILiveIndicatorViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicator = liveIndicator.asInstanceOf[js.Any], liveIndicatorButton = liveIndicatorButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewStyles]
    }
    
    @scala.inline
    implicit class ILiveIndicatorViewStylesMutableBuilder[Self <: ILiveIndicatorViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickable(value: String): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnded(value: String): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveIndicator(value: String): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveIndicatorButton(value: String): Self = StObject.set(x, "liveIndicatorButton", value.asInstanceOf[js.Any])
    }
  }
}
