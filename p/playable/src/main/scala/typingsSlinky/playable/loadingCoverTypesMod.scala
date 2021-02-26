package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingCoverTypesMod {
  
  @js.native
  trait ILoadingCover extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setLoadingCover(src: String): Unit = js.native
    
    def show(): Unit = js.native
  }
  object ILoadingCover {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      setLoadingCover: String => Unit,
      show: () => Unit
    ): ILoadingCover = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setLoadingCover = js.Any.fromFunction1(setLoadingCover), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ILoadingCover]
    }
    
    @scala.inline
    implicit class ILoadingCoverMutableBuilder[Self <: ILoadingCover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetLoadingCover(value: String => Unit): Self = StObject.set(x, "setLoadingCover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ILoadingCoverViewStyles extends StObject {
    
    var hidden: String = js.native
    
    var loadingCover: String = js.native
    
    var loadingCoverImage: String = js.native
  }
  object ILoadingCoverViewStyles {
    
    @scala.inline
    def apply(hidden: String, loadingCover: String, loadingCoverImage: String): ILoadingCoverViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], loadingCover = loadingCover.asInstanceOf[js.Any], loadingCoverImage = loadingCoverImage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoadingCoverViewStyles]
    }
    
    @scala.inline
    implicit class ILoadingCoverViewStylesMutableBuilder[Self <: ILoadingCoverViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingCover(value: String): Self = StObject.set(x, "loadingCover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingCoverImage(value: String): Self = StObject.set(x, "loadingCoverImage", value.asInstanceOf[js.Any])
    }
  }
}
