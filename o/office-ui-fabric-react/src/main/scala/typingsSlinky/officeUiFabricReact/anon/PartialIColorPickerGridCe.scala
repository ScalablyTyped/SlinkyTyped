package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.types.IColorPickerGridCellProps> */
@js.native
trait PartialIColorPickerGridCe extends StObject {
  
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
  implicit class PartialIColorPickerGridCeMutableBuilder[Self <: PartialIColorPickerGridCe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItem(value: IColorCellProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* item */ IColorCellProps => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* item */ IColorCellProps => scala.Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnHover(value: /* item */ js.UndefOr[IColorCellProps] => scala.Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* ev */ SyntheticKeyboardEvent[HTMLButtonElement] => scala.Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => scala.Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnWheel(value: /* ev */ SyntheticMouseEvent[HTMLButtonElement] => scala.Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IColorPickerGridCellStyleProps => DeepPartial[IColorPickerGridCellStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
