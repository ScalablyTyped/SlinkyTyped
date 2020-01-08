package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSliderSliderDotTypesMod.ISlider
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSliderSliderDotTypesMod.ISliderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSliderSliderDotTypesMod.ISliderStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSliderSliderDotTypesMod.ISliderStyles
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SliderBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libSliderMod.SliderBase] {
  @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange */
  def apply(
    ariaLabel: String = null,
    ariaValueText: /* value */ Double => String = null,
    buttonProps: HTMLAttributes[HTMLButtonElement] = null,
    componentRef: IRefObject[ISlider] = null,
    defaultValue: Int | Double = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChanged: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Unit = null,
    originFromZero: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    snapToStep: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    styles: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles] = null,
    theme: ITheme = null,
    value: Int | Double = null,
    valueFormat: /* value */ Double => String = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libSliderMod.SliderBase] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(js.Any.fromFunction1(ariaValueText))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction2(onChanged))
    if (!js.isUndefined(originFromZero)) __obj.updateDynamic("originFromZero")(originFromZero.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStep)) __obj.updateDynamic("snapToStep")(snapToStep.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(js.Any.fromFunction1(valueFormat))
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libSliderMod.SliderBase] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libSliderMod.SliderBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ISliderProps
}

