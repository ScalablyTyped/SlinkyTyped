package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.circle
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.square
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchColorPickerTypesMod {
  
  @js.native
  trait ISwatchColorPickerProps extends StObject {
    
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
      * Custom render function for the color cell
      */
    var onRenderColorCell: js.UndefOr[IRenderFunction[IColorCellProps]] = js.native
    
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
    implicit class ISwatchColorPickerPropsMutableBuilder[Self <: ISwatchColorPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaPosInSet(value: Double): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      @scala.inline
      def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      @scala.inline
      def setCellBorderWidth(value: Double): Self = StObject.set(x, "cellBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellBorderWidthUndefined: Self = StObject.set(x, "cellBorderWidth", js.undefined)
      
      @scala.inline
      def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      @scala.inline
      def setCellMargin(value: Double): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      @scala.inline
      def setCellShape(value: circle | square): Self = StObject.set(x, "cellShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellShapeUndefined: Self = StObject.set(x, "cellShape", js.undefined)
      
      @scala.inline
      def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColorCells(value: js.Array[IColorCellProps]): Self = StObject.set(x, "colorCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCellsVarargs(value: IColorCellProps*): Self = StObject.set(x, "colorCells", js.Array(value :_*))
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDoNotContainWithinFocusZone(value: Boolean): Self = StObject.set(x, "doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotContainWithinFocusZoneUndefined: Self = StObject.set(x, "doNotContainWithinFocusZone", js.undefined)
      
      @scala.inline
      def setFocusOnHover(value: Boolean): Self = StObject.set(x, "focusOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnHoverUndefined: Self = StObject.set(x, "focusOnHover", js.undefined)
      
      @scala.inline
      def setGetColorGridCellStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = StObject.set(x, "getColorGridCellStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetColorGridCellStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = StObject.set(x, "getColorGridCellStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetColorGridCellStylesUndefined: Self = StObject.set(x, "getColorGridCellStyles", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsControlled(value: Boolean): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsControlledUndefined: Self = StObject.set(x, "isControlled", js.undefined)
      
      @scala.inline
      def setMouseLeaveParentSelector(value: String): Self = StObject.set(x, "mouseLeaveParentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveParentSelectorUndefined: Self = StObject.set(x, "mouseLeaveParentSelector", js.undefined)
      
      @scala.inline
      def setOnCellFocused(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onCellFocused", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellFocusedUndefined: Self = StObject.set(x, "onCellFocused", js.undefined)
      
      @scala.inline
      def setOnCellHovered(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onCellHovered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellHoveredUndefined: Self = StObject.set(x, "onCellHovered", js.undefined)
      
      @scala.inline
      def setOnColorChanged(value: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onColorChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnColorChangedUndefined: Self = StObject.set(x, "onColorChanged", js.undefined)
      
      @scala.inline
      def setOnRenderColorCell(
        value: (/* props */ js.UndefOr[IColorCellProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IColorCellProps], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderColorCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderColorCellUndefined: Self = StObject.set(x, "onRenderColorCell", js.undefined)
      
      @scala.inline
      def setPositionInSet(value: Double): Self = StObject.set(x, "positionInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionInSetUndefined: Self = StObject.set(x, "positionInSet", js.undefined)
      
      @scala.inline
      def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      @scala.inline
      def setSetSize(value: Double): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setShouldFocusCircularNavigate(value: Boolean): Self = StObject.set(x, "shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFocusCircularNavigateUndefined: Self = StObject.set(x, "shouldFocusCircularNavigate", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ISwatchColorPickerStyleProps => DeepPartial[ISwatchColorPickerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ISwatchColorPickerStyleProps extends StObject {
    
    /**
      * The distance between cells
      */
    var cellMargin: js.UndefOr[Double] = js.native
    
    /**
      * Custom className to apply to the container.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Theme to apply to the container
      */
    var theme: ITheme = js.native
  }
  object ISwatchColorPickerStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ISwatchColorPickerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISwatchColorPickerStyleProps]
    }
    
    @scala.inline
    implicit class ISwatchColorPickerStylePropsMutableBuilder[Self <: ISwatchColorPickerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellMargin(value: Double): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISwatchColorPickerStyles extends StObject {
    
    /**
      * Style for the FocusZone container for the grid.
      */
    var focusedContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Style applied to the container grid.
      */
    var root: IStyle = js.native
    
    /**
      * Style for the table cells of the grid.
      */
    var tableCell: IStyle = js.native
  }
  object ISwatchColorPickerStyles {
    
    @scala.inline
    def apply(): ISwatchColorPickerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwatchColorPickerStyles]
    }
    
    @scala.inline
    implicit class ISwatchColorPickerStylesMutableBuilder[Self <: ISwatchColorPickerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusedContainer(value: IStyle): Self = StObject.set(x, "focusedContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedContainerNull: Self = StObject.set(x, "focusedContainer", null)
      
      @scala.inline
      def setFocusedContainerUndefined: Self = StObject.set(x, "focusedContainer", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTableCell(value: IStyle): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableCellNull: Self = StObject.set(x, "tableCell", null)
      
      @scala.inline
      def setTableCellUndefined: Self = StObject.set(x, "tableCell", js.undefined)
    }
  }
}
