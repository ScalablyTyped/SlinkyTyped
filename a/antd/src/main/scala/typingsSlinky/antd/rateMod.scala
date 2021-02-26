package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rateMod extends Shortcut {
  
  @JSImport("antd/lib/rate", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RateProps with RefAttributes[_]] = js.native
  
  @js.native
  trait RateProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var allowHalf: js.UndefOr[Boolean] = js.native
    
    var character: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tooltips: js.UndefOr[js.Array[String]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object RateProps {
    
    @scala.inline
    def apply(): RateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateProps]
    }
    
    @scala.inline
    implicit class RatePropsMutableBuilder[Self <: RateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setAllowHalf(value: Boolean): Self = StObject.set(x, "allowHalf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfUndefined: Self = StObject.set(x, "allowHalf", js.undefined)
      
      @scala.inline
      def setCharacter(value: ReactElement): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterReactElement(value: ReactElement): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnHoverChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onHoverChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverChangeUndefined: Self = StObject.set(x, "onHoverChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltips(value: js.Array[String]): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      @scala.inline
      def setTooltipsVarargs(value: String*): Self = StObject.set(x, "tooltips", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RateProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `rateMod.foo` */
  override def _to: ForwardRefExoticComponent[RateProps with RefAttributes[_]] = default
}
