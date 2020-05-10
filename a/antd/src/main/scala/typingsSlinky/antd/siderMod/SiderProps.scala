package typingsSlinky.antd.siderMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.lg
import typingsSlinky.antd.antdStrings.md
import typingsSlinky.antd.antdStrings.sm
import typingsSlinky.antd.antdStrings.xl
import typingsSlinky.antd.antdStrings.xs
import typingsSlinky.antd.antdStrings.xxl
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiderProps extends HTMLAttributes[HTMLDivElement] {
  var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsedWidth: js.UndefOr[Double | String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var defaultCollapsed: js.UndefOr[Boolean] = js.native
  var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.native
  var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var reverseArrow: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[SiderTheme] = js.native
  var trigger: js.UndefOr[TagMod[Any]] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.native
}

object SiderProps {
  @scala.inline
  def apply(): SiderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiderProps]
  }
  @scala.inline
  implicit class SiderPropsOps[Self <: SiderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: xs | sm | md | lg | xl | xxl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBreakpoint(value: /* broken */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBreakpoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBreakpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withReverseArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverseArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: SiderTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroWidthTriggerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroWidthTriggerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroWidthTriggerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroWidthTriggerStyle")(js.undefined)
        ret
    }
  }
  
}

