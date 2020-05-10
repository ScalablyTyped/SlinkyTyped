package typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod

import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.circle
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.square
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwatchColorPickerProps extends js.Object {
  /**
    * Position this grid is in the parent set (index in a parent menu, for example)
    */
  var ariaPosInSet: js.UndefOr[Double] = js.native
  /**
    * Size of the parent set (size of parent menu, for example)
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /**
    * Width of the border indicating a hovered/selected cell, in pixels
    * @defaultvalue If `cellWidth` is less than 24px, then default value is 2px. Otherwise it defaults to 4px.
    */
  var cellBorderWidth: js.UndefOr[Double] = js.native
  /**
    * Height of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellHeight: js.UndefOr[Double] = js.native
  /**
    * The distance between cells, in pixels
    * @defaultvalue 10
    */
  var cellMargin: js.UndefOr[Double] = js.native
  /**
    * The shape of the color cells.
    * @default 'circle'
    */
  var cellShape: js.UndefOr[circle | square] = js.native
  /**
    * Width of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellWidth: js.UndefOr[Double] = js.native
  /**
    * Additional class name to provide on the root element
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The color cells that will be made available to the user.
    *
    * Note: When the reference to this prop changes, regardless of how many color cells change,
    * all of the color cells will be re-rendered (potentially bad perf) because we memoize
    * based on this prop's reference.
    */
  var colorCells: js.Array[IColorCellProps] = js.native
  /**
    * Number of columns for the swatch color picker
    */
  var columnCount: Double = js.native
  /**
    * Whether the control is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If false (the default), the grid is contained inside a FocusZone.
    * If true, a FocusZone is not used.
    * @default false
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
  /**
    * Whether to update focus when a cell is hovered.
    * @defaultvalue false
    */
  var focusOnHover: js.UndefOr[Boolean] = js.native
  /**
    * Styles for the grid cells.
    */
  var getColorGridCellStyles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.native
  /**
    * ID for the swatch color picker's root element. Also used as a prefix for the IDs of color cells.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates whether the SwatchColorPicker is fully controlled.
    * When true, the component will not set its internal state to track the selected color.
    * Instead, the parent component will be responsible for handling state in the callbacks like
    * `onColorChanged`.
    *
    * NOTE: This property is a temporary workaround to force the component to be fully controllable
    * without breaking existing behavior
    */
  var isControlled: js.UndefOr[Boolean] = js.native
  /**
    * Selector to focus on mouse leave. Should only be used in conjunction with `focusOnHover`.
    */
  var mouseLeaveParentSelector: js.UndefOr[String] = js.native
  /**
    * Callback for when the user focuses a color cell.
    * If `id` and `color` are unspecified, cells are no longer being focused.
    */
  var onCellFocused: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.native
  /**
    * Callback for when the user hovers over a color cell.
    * If `id` and `color` are unspecified, cells are no longer being hovered.
    */
  var onCellHovered: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.native
  /**
    * Callback for when the user changes the color.
    * If `id` and `color` are unspecified, there is no selected cell.
    * (e.g. the user executed the currently selected cell to unselect it)
    */
  var onColorChanged: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.native
  /**
    * @deprecated Use `ariaPosInSet`
    */
  var positionInSet: js.UndefOr[Double] = js.native
  /**
    * The ID of color cell that is currently selected
    */
  var selectedId: js.UndefOr[String] = js.native
  /**
    * @deprecated Use `ariaSetSize`
    */
  var setSize: js.UndefOr[Double] = js.native
  /**
    * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
    * Only relevant if `doNotContainWithinFocusZone` is not true.
    * @defaultvalue true
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.native
  /**
    * Styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]] = js.native
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ISwatchColorPickerProps {
  @scala.inline
  def apply(colorCells: js.Array[IColorCellProps], columnCount: Double): ISwatchColorPickerProps = {
    val __obj = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerProps]
  }
  @scala.inline
  implicit class ISwatchColorPickerPropsOps[Self <: ISwatchColorPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorCells(value: js.Array[IColorCellProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaPosInSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPosInSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaPosInSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaPosInSet")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaSetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCellBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withCellShape(value: circle | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellShape")(js.undefined)
        ret
    }
    @scala.inline
    def withCellWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellWidth")(js.undefined)
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
    def withDoNotContainWithinFocusZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotContainWithinFocusZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoNotContainWithinFocusZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotContainWithinFocusZone")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withGetColorGridCellStylesFunction1(value: IColorPickerGridCellStyleProps => Partial[IColorPickerGridCellStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorGridCellStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetColorGridCellStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorGridCellStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetColorGridCellStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorGridCellStyles")(js.undefined)
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
    def withIsControlled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsControlled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isControlled")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseLeaveParentSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveParentSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseLeaveParentSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeaveParentSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellFocused(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellFocused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHovered(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHovered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCellHovered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHovered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColorChanged(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColorChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColorChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColorChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionInSet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionInSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionInSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionInSet")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFocusCircularNavigate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusCircularNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldFocusCircularNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFocusCircularNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ISwatchColorPickerStyleProps => Partial[ISwatchColorPickerStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]): Self = {
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
  }
  
}

