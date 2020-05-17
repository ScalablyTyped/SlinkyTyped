package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.types.IColorPickerGridCellProps> */
@js.native
trait PartialIColorPickerGridCe extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.native
  var circle: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var idPrefix: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  var item: js.UndefOr[IColorCellProps] = js.native
  var label: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.native
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], scala.Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ SyntheticKeyboardEvent[HTMLButtonElement], scala.Unit]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Boolean]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], scala.Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], Boolean]] = js.native
  var onWheel: js.UndefOr[js.Function1[/* ev */ SyntheticMouseEvent[HTMLButtonElement], scala.Unit]] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.native
  var theme: js.UndefOr[ITheme] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialIColorPickerGridCe {
  @scala.inline
  def apply(): PartialIColorPickerGridCe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIColorPickerGridCe]
  }
  @scala.inline
  implicit class PartialIColorPickerGridCeOps[Self <: PartialIColorPickerGridCe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCircle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: IColorCellProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* item */ IColorCellProps => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* item */ IColorCellProps => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHover(value: /* item */ js.UndefOr[IColorCellProps] => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* ev */ SyntheticKeyboardEvent[HTMLButtonElement] => scala.Unit): Self = {
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
    def withOnMouseEnter(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IColorPickerGridCellStyleProps => Partial[IColorPickerGridCellStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

