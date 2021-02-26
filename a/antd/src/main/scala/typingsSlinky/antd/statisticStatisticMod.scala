package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.TypeofCountdown
import typingsSlinky.antd.countdownMod.default
import typingsSlinky.antd.statisticUtilsMod.FormatConfig
import typingsSlinky.antd.statisticUtilsMod.valueType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.FC
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticStatisticMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/lib/statistic/Statistic", JSImport.Default)
    @js.native
    val ^ : FC[StatisticProps] with StatisticComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/statistic/Statistic", "default.Countdown")
    @js.native
    class Countdown ()
      extends typingsSlinky.antd.countdownMod.default
    
    type _To = FC[StatisticProps] with StatisticComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: FC[StatisticProps] with StatisticComponent = ^
  }
  
  @js.native
  trait StatisticComponent extends StObject {
    
    var Countdown: Instantiable0[default] with TypeofCountdown = js.native
  }
  object StatisticComponent {
    
    @scala.inline
    def apply(Countdown: Instantiable0[default] with TypeofCountdown): StatisticComponent = {
      val __obj = js.Dynamic.literal(Countdown = Countdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatisticComponent]
    }
    
    @scala.inline
    implicit class StatisticComponentMutableBuilder[Self <: StatisticComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountdown(value: Instantiable0[default] with TypeofCountdown): Self = StObject.set(x, "Countdown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatisticProps extends FormatConfig {
    
    var className: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var prefix: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suffix: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var value: js.UndefOr[valueType] = js.native
    
    var valueRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var valueStyle: js.UndefOr[CSSProperties] = js.native
  }
  object StatisticProps {
    
    @scala.inline
    def apply(): StatisticProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticProps]
    }
    
    @scala.inline
    implicit class StatisticPropsMutableBuilder[Self <: StatisticProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactElement): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixReactElement(value: ReactElement): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactElement): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixReactElement(value: ReactElement): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: valueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueRender(value: /* node */ ReactElement => ReactElement): Self = StObject.set(x, "valueRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueRenderUndefined: Self = StObject.set(x, "valueRender", js.undefined)
      
      @scala.inline
      def setValueStyle(value: CSSProperties): Self = StObject.set(x, "valueStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueStyleUndefined: Self = StObject.set(x, "valueStyle", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
