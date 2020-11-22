package typingsSlinky.antd.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.statisticUtilsMod.FormatConfig
import typingsSlinky.antd.statisticUtilsMod.Formatter
import typingsSlinky.antd.statisticUtilsMod.countdownValueType
import typingsSlinky.antd.statisticUtilsMod.valueType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/statistic/Countdown.CountdownProps> */
@js.native
trait PartialCountdownProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var decimalSeparator: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var formatter: js.UndefOr[Formatter] = js.native
  
  var groupSeparator: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[ReactElement] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var suffix: js.UndefOr[ReactElement] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
  
  var value: js.UndefOr[countdownValueType] = js.native
  
  var valueRender: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
  
  var valueStyle: js.UndefOr[CSSProperties] = js.native
}
object PartialCountdownProps {
  
  @scala.inline
  def apply(): PartialCountdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCountdownProps]
  }
  
  @scala.inline
  implicit class PartialCountdownPropsOps[Self <: PartialCountdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactElement): Self = this.set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatter(value: Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setGroupSeparator(value: String): Self = this.set("groupSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupSeparator: Self = this.set("groupSeparator", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setOnFinish(value: () => Unit): Self = this.set("onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrefixReactElement(value: ReactElement): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: ReactElement): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuffixReactElement(value: ReactElement): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: ReactElement): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: countdownValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueRender(value: /* node */ ReactElement => ReactElement): Self = this.set("valueRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValueRender: Self = this.set("valueRender", js.undefined)
    
    @scala.inline
    def setValueStyle(value: CSSProperties): Self = this.set("valueStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueStyle: Self = this.set("valueStyle", js.undefined)
  }
}
