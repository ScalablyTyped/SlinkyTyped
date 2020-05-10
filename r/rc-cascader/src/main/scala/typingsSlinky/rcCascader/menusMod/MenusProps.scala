package typingsSlinky.rcCascader.menusMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcCascader.cascaderMod.CascaderFieldNames
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenusProps extends js.Object {
  var activeValue: js.UndefOr[js.Array[String]] = js.native
  var defaultFieldNames: js.UndefOr[CascaderFieldNames] = js.native
  var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
  var expandIcon: js.UndefOr[TagMod[Any]] = js.native
  var expandTrigger: js.UndefOr[String] = js.native
  var fieldNames: js.UndefOr[CascaderFieldNames] = js.native
  var loadingIcon: js.UndefOr[TagMod[Any]] = js.native
  var onItemDoubleClick: js.UndefOr[
    js.Function3[
      /* targetOption */ js.Array[String], 
      /* index */ Double, 
      /* e */ SyntheticMouseEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
  var onSelect: js.UndefOr[
    js.Function3[
      /* targetOption */ js.Array[String], 
      /* index */ Double, 
      /* e */ SyntheticKeyboardEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
  var options: js.UndefOr[js.Array[CascaderOption]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Array[String]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object MenusProps {
  @scala.inline
  def apply(): MenusProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenusProps]
  }
  @scala.inline
  implicit class MenusPropsOps[Self <: MenusProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFieldNames(value: CascaderFieldNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFieldNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFieldNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownMenuColumnStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenuColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownMenuColumnStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownMenuColumnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldNames(value: CascaderFieldNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDoubleClick(
      value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDoubleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ SyntheticKeyboardEvent[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[CascaderOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
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
    def withValue(value: js.Array[String]): Self = {
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
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

