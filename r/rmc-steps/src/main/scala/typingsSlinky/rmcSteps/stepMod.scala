package typingsSlinky.rmcSteps

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod {
  
  @JSImport("rmc-steps/lib/Step", JSImport.Default)
  @js.native
  class default () extends Step
  
  @js.native
  trait IStepProps extends StObject {
    
    var adjustMarginRight: js.UndefOr[Double | String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[js.Any] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var iconPrefix: js.UndefOr[String] = js.native
    
    var itemWidth: js.UndefOr[Double | String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var progressDot: js.UndefOr[Boolean | js.Function] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var stepNumber: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[js.Any] = js.native
    
    var wrapperStyle: js.UndefOr[js.Any] = js.native
  }
  object IStepProps {
    
    @scala.inline
    def apply(): IStepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStepProps]
    }
    
    @scala.inline
    implicit class IStepPropsMutableBuilder[Self <: IStepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustMarginRight(value: Double | String): Self = StObject.set(x, "adjustMarginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustMarginRightUndefined: Self = StObject.set(x, "adjustMarginRight", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: js.Any): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double | String): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProgressDot(value: Boolean | js.Function): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStepNumber(value: Double): Self = StObject.set(x, "stepNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNumberUndefined: Self = StObject.set(x, "stepNumber", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: js.Any): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  @js.native
  trait Step
    extends Component[IStepProps, js.Any, js.Any] {
    
    def renderIconNode(): js.Any = js.native
  }
}
