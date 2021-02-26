package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeTypesMod {
  
  @js.native
  trait ITimeControl extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object ITimeControl {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      reset: () => Unit,
      show: () => Unit
    ): ITimeControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITimeControl]
    }
    
    @scala.inline
    implicit class ITimeControlMutableBuilder[Self <: ITimeControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ITimeViewConfig extends StObject {
    
    var theme: IThemeService = js.native
  }
  object ITimeViewConfig {
    
    @scala.inline
    def apply(theme: IThemeService): ITimeViewConfig = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeViewConfig]
    }
    
    @scala.inline
    implicit class ITimeViewConfigMutableBuilder[Self <: ITimeViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITimeViewStyles extends StObject {
    
    var current: String = js.native
    
    var duration: String = js.native
    
    var hidden: String = js.native
    
    var separator: String = js.native
    
    var time: String = js.native
    
    var timeWrapper: String = js.native
  }
  object ITimeViewStyles {
    
    @scala.inline
    def apply(
      current: String,
      duration: String,
      hidden: String,
      separator: String,
      time: String,
      timeWrapper: String
    ): ITimeViewStyles = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWrapper = timeWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeViewStyles]
    }
    
    @scala.inline
    implicit class ITimeViewStylesMutableBuilder[Self <: ITimeViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeWrapper(value: String): Self = StObject.set(x, "timeWrapper", value.asInstanceOf[js.Any])
    }
  }
}
