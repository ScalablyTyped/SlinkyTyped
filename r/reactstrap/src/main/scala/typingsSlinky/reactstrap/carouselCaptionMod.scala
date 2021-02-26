package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselCaptionMod {
  
  @JSImport("reactstrap/lib/CarouselCaption", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselCaptionProps, js.Object, js.Any]
  
  type CarouselCaption = ReactComponentClass[CarouselCaptionProps]
  
  @js.native
  trait CarouselCaptionProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var captionHeader: js.UndefOr[ReactElement] = js.native
    
    var captionText: ReactElement = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
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
      def setCaptionHeader(value: ReactElement): Self = StObject.set(x, "captionHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionHeaderReactElement(value: ReactElement): Self = StObject.set(x, "captionHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionHeaderUndefined: Self = StObject.set(x, "captionHeader", js.undefined)
      
      @scala.inline
      def setCaptionText(value: ReactElement): Self = StObject.set(x, "captionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionTextUndefined: Self = StObject.set(x, "captionText", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
    }
  }
}
