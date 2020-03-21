package typingsSlinky.rmcInputNumber.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rmcInputNumber.mod.PropsType
import typingsSlinky.rmcInputNumber.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RmcInputNumber
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-input-number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, disabled, readOnly, tabIndex */
  def apply(
    className: js.Any = null,
    defaultValue: Int | Double = null,
    downHandler: TagMod[Any] = null,
    focusOnUpDown: js.UndefOr[Boolean] = js.undefined,
    formatter: /* v */ js.Any => Unit = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onBlur: /* e */ js.Any => Unit = null,
    onChange: /* e */ js.Any => Unit = null,
    onFocus: /* e */ js.UndefOr[js.Any] => Unit = null,
    parser: /* v */ js.Any => Unit = null,
    precision: Int | Double = null,
    prefixCls: String = null,
    step: String | Double = null,
    style: js.Any = null,
    upHandler: TagMod[Any] = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (downHandler != null) __obj.updateDynamic("downHandler")(downHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnUpDown)) __obj.updateDynamic("focusOnUpDown")(focusOnUpDown.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (upHandler != null) __obj.updateDynamic("upHandler")(upHandler.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rmcInputNumber.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PropsType
}

