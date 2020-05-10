package typingsSlinky.antd.cascaderMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.sizeContextMod.SizeType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderProps extends js.Object {
  /** 是否支持清除 */
  var allowClear: js.UndefOr[Boolean] = js.native
  /** whether has border style */
  var bordered: js.UndefOr[Boolean] = js.native
  /** 当此项为 true 时，点选每级菜单选项值都会发生变化 */
  var changeOnSelect: js.UndefOr[Boolean] = js.native
  /** 自定义类名 */
  var className: js.UndefOr[String] = js.native
  /** 默认的选中项 */
  var defaultValue: js.UndefOr[js.Array[String]] = js.native
  /** 禁用 */
  var disabled: js.UndefOr[Boolean] = js.native
  /** 选择后展示的渲染函数 */
  var displayRender: js.UndefOr[
    js.Function2[
      /* label */ js.Array[String], 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      TagMod[Any]
    ]
  ] = js.native
  /** 次级菜单的展开方式，可选 'click' 和 'hover' */
  var expandTrigger: js.UndefOr[CascaderExpandTrigger] = js.native
  /** use this after antd@3.7.0 */
  var fieldNames: js.UndefOr[FieldNamesType] = js.native
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
  var inputPrefixCls: js.UndefOr[String] = js.native
  var loadData: js.UndefOr[
    js.Function1[/* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], Unit]
  ] = js.native
  var notFoundContent: js.UndefOr[TagMod[Any]] = js.native
  /** 选择完成后的回调 */
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ js.Array[String], 
      /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]], 
      Unit
    ]
  ] = js.native
  /** 浮层可见变化时回调 */
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.native
  /** 可选项数据源 */
  var options: js.Array[CascaderOptionType] = js.native
  /** 输入框占位文本 */
  var placeholder: js.UndefOr[String] = js.native
  /** 自定义浮层类名 */
  var popupClassName: js.UndefOr[String] = js.native
  /** 浮层预设位置：`bottomLeft` `bottomRight` `topLeft` `topRight` */
  var popupPlacement: js.UndefOr[String] = js.native
  var popupVisible: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var showSearch: js.UndefOr[Boolean | ShowSearchType] = js.native
  /** 输入框大小，可选 `large` `default` `small` */
  var size: js.UndefOr[SizeType] = js.native
  /** 自定义样式 */
  var style: js.UndefOr[CSSProperties] = js.native
  var suffixIcon: js.UndefOr[TagMod[Any]] = js.native
  /** 指定选中项 */
  var value: js.UndefOr[js.Array[String]] = js.native
}

object CascaderProps {
  @scala.inline
  def apply(options: js.Array[CascaderOptionType]): CascaderProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
  @scala.inline
  implicit class CascaderPropsOps[Self <: CascaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[CascaderOptionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(js.undefined)
        ret
    }
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(js.undefined)
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
    def withDisplayRender(
      value: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDisplayRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayRender")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTrigger(value: CascaderExpandTrigger): Self = {
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
    def withFieldNames(value: FieldNamesType): Self = {
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
    def withGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPopupContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopupContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withInputPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadData(value: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit): Self = {
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
    def withNotFoundContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFoundContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* value */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit
    ): Self = {
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
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
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
    def withShowSearch(value: Boolean | ShowSearchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
    def withSuffixIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffixIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(js.undefined)
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

