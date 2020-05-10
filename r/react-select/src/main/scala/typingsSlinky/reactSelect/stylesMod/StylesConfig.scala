package typingsSlinky.reactSelect.stylesMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-select.react-select/src/styles.Styles> */
@js.native
trait StylesConfig extends js.Object {
  var clearIndicator: js.UndefOr[styleFn] = js.native
  var container: js.UndefOr[styleFn] = js.native
  var control: js.UndefOr[styleFn] = js.native
  var dropdownIndicator: js.UndefOr[styleFn] = js.native
  var group: js.UndefOr[styleFn] = js.native
  var groupHeading: js.UndefOr[styleFn] = js.native
  var indicatorSeparator: js.UndefOr[styleFn] = js.native
  var indicatorsContainer: js.UndefOr[styleFn] = js.native
  var input: js.UndefOr[styleFn] = js.native
  var loadingIndicator: js.UndefOr[styleFn] = js.native
  var loadingMessage: js.UndefOr[styleFn] = js.native
  var menu: js.UndefOr[styleFn] = js.native
  var menuList: js.UndefOr[styleFn] = js.native
  var menuPortal: js.UndefOr[styleFn] = js.native
  var multiValue: js.UndefOr[styleFn] = js.native
  var multiValueLabel: js.UndefOr[styleFn] = js.native
  var multiValueRemove: js.UndefOr[styleFn] = js.native
  var noOptionsMessage: js.UndefOr[styleFn] = js.native
  var option: js.UndefOr[styleFn] = js.native
  var placeholder: js.UndefOr[styleFn] = js.native
  var singleValue: js.UndefOr[styleFn] = js.native
  var valueContainer: js.UndefOr[styleFn] = js.native
}

object StylesConfig {
  @scala.inline
  def apply(): StylesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylesConfig]
  }
  @scala.inline
  implicit class StylesConfigOps[Self <: StylesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearIndicator(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIndicator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClearIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withControl(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownIndicator(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownIndicator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropdownIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeading(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeading")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorSeparator(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSeparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIndicatorSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorsContainer(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorsContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIndicatorsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingIndicator(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingMessage(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadingMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuList(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuList")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMenuList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuList")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuPortal(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPortal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMenuPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuPortal")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValue(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMultiValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueLabel(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMultiValueLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueRemove(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueRemove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMultiValueRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withNoOptionsMessage(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOptionsMessage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNoOptionsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOptionsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValue(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSingleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValueContainer(value: (/* base */ CSSProperties, /* state */ js.Any) => CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueContainer")(js.undefined)
        ret
    }
  }
  
}

