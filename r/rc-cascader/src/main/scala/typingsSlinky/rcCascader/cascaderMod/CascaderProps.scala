package typingsSlinky.rcCascader.cascaderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TriggerProps * / any, 'getPopupContainer'> */
@js.native
trait CascaderProps extends js.Object {
  var builtinPlacements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.native
  var changeOnSelect: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var defaultValue: js.UndefOr[js.Array[String]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.native
  var expandIcon: js.UndefOr[TagMod[Any]] = js.native
  var expandTrigger: js.UndefOr[String] = js.native
  var fieldNames: js.UndefOr[CascaderFieldNames] = js.native
  var filedNames: js.UndefOr[CascaderFieldNames] = js.native
  var getPopupContainer: js.Any = js.native
  var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[CascaderOption], Unit]] = js.native
  var loadingIcon: js.UndefOr[TagMod[Any]] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* value */ js.Array[String], /* selectOptions */ js.Array[CascaderOption], Unit]
  ] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]] = js.native
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.native
  var options: js.UndefOr[js.Array[CascaderOption]] = js.native
  var popupClassName: js.UndefOr[String] = js.native
  var popupPlacement: js.UndefOr[String] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var transitionName: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Array[String]] = js.native
}

object CascaderProps {
  @scala.inline
  def apply(getPopupContainer: js.Any): CascaderProps = {
    val __obj = js.Dynamic.literal(getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
  @scala.inline
  implicit class CascaderPropsOps[Self <: CascaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPopupContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuiltinPlacements(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltinPlacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtinPlacements")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withFiledNames(value: CascaderFieldNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiledNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filedNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadData(value: /* selectOptions */ js.Array[CascaderOption] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.undefined)
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
    def withOnChange(value: (/* value */ js.Array[String], /* selectOptions */ js.Array[CascaderOption]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopupVisibleChange(value: /* popupVisible */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPopupVisibleChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopupVisibleChange")(js.undefined)
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
    def withPopupClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupVisible")(js.undefined)
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
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(js.undefined)
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
  }
  
}

