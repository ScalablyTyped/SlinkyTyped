package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStrings
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.std.Event_
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColorPicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react", "ColorPicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    color: IColor | String,
    alphaLabel: String = null,
    alphaSliderHidden: js.UndefOr[Boolean] = js.undefined,
    blueLabel: String = null,
    componentRef: IRefObject[IColorPicker] = null,
    greenLabel: String = null,
    hexLabel: String = null,
    onChange: (/* ev */ SyntheticEvent[Event_, HTMLElement], /* color */ IColor) => Unit = null,
    redLabel: String = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    strings: IColorPickerStrings = null,
    styles: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (alphaLabel != null) __obj.updateDynamic("alphaLabel")(alphaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaSliderHidden)) __obj.updateDynamic("alphaSliderHidden")(alphaSliderHidden.asInstanceOf[js.Any])
    if (blueLabel != null) __obj.updateDynamic("blueLabel")(blueLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (greenLabel != null) __obj.updateDynamic("greenLabel")(greenLabel.asInstanceOf[js.Any])
    if (hexLabel != null) __obj.updateDynamic("hexLabel")(hexLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (redLabel != null) __obj.updateDynamic("redLabel")(redLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IColorPickerProps
}

