package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsSlinky.reactNative.mod.ImagePropertiesSourceOptions
import typingsSlinky.reactNative.mod.ImageURISource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultPropsTypeMod {
  
  @js.native
  trait ResultPropsType extends StObject {
    
    var buttonText: js.UndefOr[String] = js.native
    
    var buttonType: js.UndefOr[primary | ghost] = js.native
    
    var img: js.UndefOr[ReactElement] = js.native
    
    var imgUrl: js.UndefOr[ImagePropertiesSourceOptions] = js.native
    
    var message: js.UndefOr[ReactElement] = js.native
    
    var onButtonClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object ResultPropsType {
    
    @scala.inline
    def apply(): ResultPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultPropsType]
    }
    
    @scala.inline
    implicit class ResultPropsTypeMutableBuilder[Self <: ResultPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setButtonType(value: primary | ghost): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      @scala.inline
      def setImg(value: ReactElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgReactElement(value: ReactElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setImgUrl(value: ImagePropertiesSourceOptions): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
      
      @scala.inline
      def setImgUrlVarargs(value: ImageURISource*): Self = StObject.set(x, "imgUrl", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageReactElement(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnButtonClick(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
