package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
trait ReadonlyIColorRectanglePr extends js.Object {
  val ariaDescription: js.UndefOr[String] = js.undefined
  val ariaLabel: js.UndefOr[String] = js.undefined
  val ariaValueFormat: js.UndefOr[String] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val color: IColor
  val componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
  val minSize: js.UndefOr[Double] = js.undefined
  val onChange: js.UndefOr[
    js.Function2[
      /* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], 
      /* color */ IColor, 
      Unit
    ]
  ] = js.undefined
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
  val theme: js.UndefOr[ITheme] = js.undefined
}

object ReadonlyIColorRectanglePr {
  @scala.inline
  def apply(
    color: IColor,
    ariaDescription: String = null,
    ariaLabel: String = null,
    ariaValueFormat: String = null,
    className: String = null,
    componentRef: IRefObject[IColorRectangle] = null,
    minSize: Int | Double = null,
    onChange: (/* ev */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], /* color */ IColor) => Unit = null,
    styles: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles] = null,
    theme: ITheme = null
  ): ReadonlyIColorRectanglePr = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValueFormat != null) __obj.updateDynamic("ariaValueFormat")(ariaValueFormat.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorRectanglePr]
  }
}

