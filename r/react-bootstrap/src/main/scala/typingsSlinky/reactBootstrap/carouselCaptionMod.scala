package typingsSlinky.reactBootstrap

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselCaptionMod {
  
  @JSImport("react-bootstrap/lib/CarouselCaption", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[CarouselCaptionProps, js.Object, js.Any]
  
  @js.native
  trait CarouselCaption
    extends Component[CarouselCaptionProps, js.Object, js.Any]
  
  @js.native
  trait CarouselCaptionProps extends HTMLProps[CarouselCaption] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object CarouselCaptionProps {
    
    @scala.inline
    def apply(): CarouselCaptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselCaptionProps]
    }
    
    @scala.inline
    implicit class CarouselCaptionPropsMutableBuilder[Self <: CarouselCaptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
