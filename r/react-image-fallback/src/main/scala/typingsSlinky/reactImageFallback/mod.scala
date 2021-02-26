package typingsSlinky.reactImageFallback

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.ImgHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-image-fallback", JSImport.Default)
  @js.native
  class default ()
    extends Component[
          ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]), 
          js.Any, 
          js.Any
        ]
  
  type ReactImageFallback = ReactComponentClass[
    ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ]
  
  @js.native
  trait ReactImageFallbackProps extends StObject {
    
    var fallbackImage: String | ReactElement | (js.Array[ReactElement | String]) = js.native
    
    var initialImage: js.UndefOr[String | ReactElement] = js.native
    
    var initialTimeout: js.UndefOr[Double] = js.native
    
    var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
    
    var src: String = js.native
  }
  object ReactImageFallbackProps {
    
    @scala.inline
    def apply(fallbackImage: String | ReactElement | (js.Array[ReactElement | String]), src: String): ReactImageFallbackProps = {
      val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactImageFallbackProps]
    }
    
    @scala.inline
    implicit class ReactImageFallbackPropsMutableBuilder[Self <: ReactImageFallbackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackImage(value: String | ReactElement | (js.Array[ReactElement | String])): Self = StObject.set(x, "fallbackImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackImageReactElement(value: ReactElement): Self = StObject.set(x, "fallbackImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackImageVarargs(value: (ReactElement | String)*): Self = StObject.set(x, "fallbackImage", js.Array(value :_*))
      
      @scala.inline
      def setInitialImage(value: String | ReactElement): Self = StObject.set(x, "initialImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialImageReactElement(value: ReactElement): Self = StObject.set(x, "initialImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialImageUndefined: Self = StObject.set(x, "initialImage", js.undefined)
      
      @scala.inline
      def setInitialTimeout(value: Double): Self = StObject.set(x, "initialTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTimeoutUndefined: Self = StObject.set(x, "initialTimeout", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
