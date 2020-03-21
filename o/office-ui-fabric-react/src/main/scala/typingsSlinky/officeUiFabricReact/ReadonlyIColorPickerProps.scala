package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
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

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps> */
trait ReadonlyIColorPickerProps extends js.Object {
  val alphaLabel: js.UndefOr[String] = js.undefined
  val alphaSliderHidden: js.UndefOr[Boolean] = js.undefined
  val blueLabel: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val color: IColor | String
  val componentRef: js.UndefOr[IRefObject[IColorPicker]] = js.undefined
  val greenLabel: js.UndefOr[String] = js.undefined
  val hexLabel: js.UndefOr[String] = js.undefined
  val onChange: js.UndefOr[
    js.Function2[/* ev */ SyntheticEvent[Event_, HTMLElement], /* color */ IColor, Unit]
  ] = js.undefined
  val redLabel: js.UndefOr[String] = js.undefined
  val showPreview: js.UndefOr[Boolean] = js.undefined
  val strings: js.UndefOr[IColorPickerStrings] = js.undefined
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles]] = js.undefined
  val theme: js.UndefOr[ITheme] = js.undefined
}

object ReadonlyIColorPickerProps {
  @scala.inline
  def apply(
    color: IColor | String,
    alphaLabel: String = null,
    alphaSliderHidden: js.UndefOr[Boolean] = js.undefined,
    blueLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IColorPicker] = null,
    greenLabel: String = null,
    hexLabel: String = null,
    onChange: (/* ev */ SyntheticEvent[Event_, HTMLElement], /* color */ IColor) => Unit = null,
    redLabel: String = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    strings: IColorPickerStrings = null,
    styles: IStyleFunctionOrObject[IColorPickerStyleProps, IColorPickerStyles] = null,
    theme: ITheme = null
  ): ReadonlyIColorPickerProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (alphaLabel != null) __obj.updateDynamic("alphaLabel")(alphaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaSliderHidden)) __obj.updateDynamic("alphaSliderHidden")(alphaSliderHidden.asInstanceOf[js.Any])
    if (blueLabel != null) __obj.updateDynamic("blueLabel")(blueLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (greenLabel != null) __obj.updateDynamic("greenLabel")(greenLabel.asInstanceOf[js.Any])
    if (hexLabel != null) __obj.updateDynamic("hexLabel")(hexLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (redLabel != null) __obj.updateDynamic("redLabel")(redLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerProps]
  }
}

