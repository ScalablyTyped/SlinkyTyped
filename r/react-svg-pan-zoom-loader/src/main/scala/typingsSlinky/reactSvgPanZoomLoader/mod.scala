package typingsSlinky.reactSvgPanZoomLoader

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-svg-pan-zoom-loader", "ReactSvgPanZoomLoader")
  @js.native
  val ReactSvgPanZoomLoader: ReactComponentClass[ReactSvgPanZoomLoaderProps] = js.native
  
  @JSImport("react-svg-pan-zoom-loader", "SvgLoaderSelectElement")
  @js.native
  val SvgLoaderSelectElement: ReactComponentClass[SvgLoaderSelectElementProps] = js.native
  
  @js.native
  trait ReactSvgPanZoomLoaderProps extends StObject {
    
    var proxy: js.UndefOr[ReactElement] = js.native
    
    def render(content: ReactElement): ReactElement = js.native
    
    var src: String = js.native
  }
  object ReactSvgPanZoomLoaderProps {
    
    @scala.inline
    def apply(render: ReactElement => ReactElement, src: String): ReactSvgPanZoomLoaderProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactSvgPanZoomLoaderProps]
    }
    
    @scala.inline
    implicit class ReactSvgPanZoomLoaderPropsMutableBuilder[Self <: ReactSvgPanZoomLoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: ReactElement): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyReactElement(value: ReactElement): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRender(value: ReactElement => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SvgLoaderSelectElementProps
    extends /* prop */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[String] = js.native
    
    var selector: String = js.native
  }
  object SvgLoaderSelectElementProps {
    
    @scala.inline
    def apply(selector: String): SvgLoaderSelectElementProps = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgLoaderSelectElementProps]
    }
    
    @scala.inline
    implicit class SvgLoaderSelectElementPropsMutableBuilder[Self <: SvgLoaderSelectElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
