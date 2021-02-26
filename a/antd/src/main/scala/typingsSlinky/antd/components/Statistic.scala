package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.countdownMod.CountdownProps
import typingsSlinky.antd.statisticStatisticMod.StatisticProps
import typingsSlinky.antd.statisticUtilsMod.FormatConfig
import typingsSlinky.antd.statisticUtilsMod.Formatter
import typingsSlinky.antd.statisticUtilsMod.valueType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Statistic {
  
  object Countdown {
    
    @JSImport("antd", "Statistic.Countdown")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Countdown.type): SharedBuilder_CountdownProps1944798938[typingsSlinky.antd.mod.Statistic.Countdown] = new SharedBuilder_CountdownProps1944798938[typingsSlinky.antd.mod.Statistic.Countdown](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CountdownProps): SharedBuilder_CountdownProps1944798938[typingsSlinky.antd.mod.Statistic.Countdown] = new SharedBuilder_CountdownProps1944798938[typingsSlinky.antd.mod.Statistic.Countdown](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Statistic")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def formatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactElement): this.type = set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def groupSeparator(value: String): this.type = set("groupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: ReactElement): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixReactElement(value: ReactElement): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffix(value: ReactElement): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffixReactElement(value: ReactElement): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: valueType): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueRender(value: /* node */ ReactElement => ReactElement): this.type = set("valueRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def valueStyle(value: CSSProperties): this.type = set("valueStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Statistic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatisticProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
