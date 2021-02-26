package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.antDesignProStrings.down
import typingsSlinky.antDesignPro.antDesignProStrings.up
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberInfoMod {
  
  @JSImport("ant-design-pro/lib/NumberInfo", JSImport.Default)
  @js.native
  class default ()
    extends Component[NumberInfoProps, js.Any, js.Any]
  
  type NumberInfo = ReactComponentClass[NumberInfoProps]
  
  @js.native
  trait NumberInfoProps extends StObject {
    
    var gap: js.UndefOr[Double] = js.native
    
    var status: js.UndefOr[up | down] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactElement | String] = js.native
    
    var subTotal: js.UndefOr[Double] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[ReactElement | String] = js.native
    
    var total: js.UndefOr[ReactElement | String] = js.native
  }
  object NumberInfoProps {
    
    @scala.inline
    def apply(): NumberInfoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberInfoProps]
    }
    
    @scala.inline
    implicit class NumberInfoPropsMutableBuilder[Self <: NumberInfoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setStatus(value: up | down): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactElement | String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleReactElement(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setSubTotal(value: Double): Self = StObject.set(x, "subTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTotalUndefined: Self = StObject.set(x, "subTotal", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTotal(value: ReactElement | String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalReactElement(value: ReactElement): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
