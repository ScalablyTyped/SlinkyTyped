package typingsSlinky.materialUi.MaterialUI.Tabs

import org.scalajs.dom.raw.EventTarget
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var contentContainerClassName: js.UndefOr[String] = js.native
  var contentContainerStyle: js.UndefOr[CSSProperties] = js.native
  var initialSelectedIndex: js.UndefOr[Double] = js.native
  var inkBarStyle: js.UndefOr[CSSProperties] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      SyntheticEvent[EventTarget with js.Object, Event_], 
      /* tab */ Tab, 
      Unit
    ]
  ] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabItemContainerStyle: js.UndefOr[CSSProperties] = js.native
  var tabTemplate: js.UndefOr[ReactComponentClass[_]] = js.native
  var tabTemplateStyle: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInkBarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkBarStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* value */ js.Any, SyntheticEvent[EventTarget with js.Object, Event_], /* tab */ Tab) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabItemContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabItemContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabItemContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabItemContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabTemplate(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTabTemplateStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplateStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabTemplateStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplateStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

