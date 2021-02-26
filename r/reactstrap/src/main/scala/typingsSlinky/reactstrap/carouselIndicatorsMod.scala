package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselIndicatorsMod {
  
  @JSImport("reactstrap/lib/CarouselIndicators", JSImport.Default)
  @js.native
  class default ()
    extends Component[CarouselIndicatorsProps, js.Object, js.Any]
  
  type CarouselIndicators = ReactComponentClass[CarouselIndicatorsProps]
  
  @js.native
  trait CarouselIndicatorsProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var activeIndex: Double = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var items: js.Array[js.Object] = js.native
    
    def onClickHandler(idx: Double): Unit = js.native
  }
  object CarouselIndicatorsProps {
    
    @scala.inline
    def apply(activeIndex: Double, items: js.Array[js.Object], onClickHandler: Double => Unit): CarouselIndicatorsProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction1(onClickHandler))
      __obj.asInstanceOf[CarouselIndicatorsProps]
    }
    
    @scala.inline
    implicit class CarouselIndicatorsPropsMutableBuilder[Self <: CarouselIndicatorsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnClickHandler(value: Double => Unit): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction1(value))
    }
  }
}
