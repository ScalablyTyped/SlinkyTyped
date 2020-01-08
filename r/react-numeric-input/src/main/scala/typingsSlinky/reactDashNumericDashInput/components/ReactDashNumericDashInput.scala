package typingsSlinky.reactDashNumericDashInput.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashNumericDashInput.reactDashNumericDashInputMod.NumericInputProps
import typingsSlinky.reactDashNumericDashInput.reactDashNumericDashInputMod.^
import typingsSlinky.reactDashNumericDashInput.reactDashNumericDashInputStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNumericDashInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-numeric-input", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: defaultValue, max, min, onBlur, onFocus, onInput, onKeyDown, onSelect, step, value */
  def apply(
    addLabelText: String = null,
    componentClass: String = null,
    format: /* value */ Double | Null => String = null,
    mobile: Boolean | auto | (js.Function1[ReactComponentClass[NumericInputProps], Boolean]) = null,
    noStyle: js.UndefOr[Boolean] = js.undefined,
    noValidate: Boolean | String = null,
    onChange: (/* value */ Double | Null, /* stringValue */ String, /* input */ HTMLInputElement) => Unit = null,
    onInvalid: (/* error */ String, /* value */ Double | Null, /* stringValue */ String) => Unit = null,
    onValid: (/* value */ Double | Null, /* stringValue */ String) => Unit = null,
    parse: /* stringValue */ String => Double | Null = null,
    precision: Double | (js.Function1[ReactComponentClass[NumericInputProps], js.UndefOr[Double | Null]]) = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    style: StringDictionary[CSSProperties] | Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (addLabelText != null) __obj.updateDynamic("addLabelText")(addLabelText.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(noStyle)) __obj.updateDynamic("noStyle")(noStyle.asInstanceOf[js.Any])
    if (noValidate != null) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction3(onInvalid))
    if (onValid != null) __obj.updateDynamic("onValid")(js.Any.fromFunction2(onValid))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[
  slinky.web.html.div.tag.type, 
  typingsSlinky.reactDashNumericDashInput.reactDashNumericDashInputMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NumericInputProps
}

