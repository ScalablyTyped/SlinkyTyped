package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyleProps
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderStyles
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorSliderBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.colorSliderBaseMod.ColorSliderBase] {
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    ariaLabel: String = null,
    componentRef: IRefObject[IColorSlider] = null,
    isAlpha: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    onChange: (/* event */ SyntheticMouseEvent[org.scalajs.dom.raw.Element] | SyntheticKeyboardEvent[org.scalajs.dom.raw.Element], /* newValue */ js.UndefOr[Double]) => Unit = null,
    overlayColor: String = null,
    overlayStyle: CSSProperties = null,
    styles: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles] = null,
    theme: ITheme = null,
    thumbColor: String = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.colorSliderBaseMod.ColorSliderBase] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (thumbColor != null) __obj.updateDynamic("thumbColor")(thumbColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.colorSliderBaseMod.ColorSliderBase] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeUiFabricReact.colorSliderBaseMod.ColorSliderBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IColorSliderProps
}

