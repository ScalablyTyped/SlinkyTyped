package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTableNext.anon.Checked
import typingsSlinky.reactBootstrapTableNext.anon.Disabled
import typingsSlinky.reactBootstrapTableNext.anon.Indeterminate
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectRowProps[T] extends StObject {
  
  var bgColor: js.UndefOr[js.Function2[/* row */ T, /* rowIndex */ Double, String]] = js.native
  
  var classes: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.native
  
  var clickToEdit: js.UndefOr[Boolean] = js.native
  
  var clickToExpand: js.UndefOr[Boolean] = js.native
  
  var clickToSelect: js.UndefOr[Boolean] = js.native
  
  var headerColumnStyle: js.UndefOr[
    (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  
  var hideSelectAll: js.UndefOr[Boolean] = js.native
  
  var hideSelectColumn: js.UndefOr[Boolean] = js.native
  
  var mode: RowSelectionType = js.native
  
  var nonSelectable: js.UndefOr[js.Array[Double]] = js.native
  
  var nonSelectableClasses: js.UndefOr[(js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String] = js.native
  
  var nonSelectableStyle: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
  
  var onSelect: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isSelected */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Event, Element], 
      Unit | Boolean
    ]
  ] = js.native
  
  /**
    * This callback function will be called when select/unselect all and it only work when you configure selectRow.mode as checkbox.
    */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* isSelect */ Boolean, 
      /* rows */ js.Array[T], 
      /* e */ SyntheticEvent[Event, Element], 
      Unit | js.Array[Double]
    ]
  ] = js.native
  
  var selectColumnPosition: js.UndefOr[left | right] = js.native
  
  var selectColumnStyle: js.UndefOr[(js.Function1[/* props */ Disabled, js.UndefOr[CSSProperties]]) | CSSProperties] = js.native
  
  var selected: js.UndefOr[js.Array[Double | String]] = js.native
  
  var selectionHeaderRenderer: js.UndefOr[js.Function1[/* options */ Indeterminate, ReactElement]] = js.native
  
  var selectionRenderer: js.UndefOr[js.Function1[/* options */ Checked, ReactElement]] = js.native
  
  var style: js.UndefOr[
    (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
  ] = js.native
}
object SelectRowProps {
  
  @scala.inline
  def apply[T](mode: RowSelectionType): SelectRowProps[T] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRowProps[T]]
  }
  
  @scala.inline
  implicit class SelectRowPropsMutableBuilder[Self <: SelectRowProps[_], T] (val x: Self with SelectRowProps[T]) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: (/* row */ T, /* rowIndex */ Double) => String): Self = StObject.set(x, "bgColor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[String]): Self = StObject.set(x, "classes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClickToEdit(value: Boolean): Self = StObject.set(x, "clickToEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToEditUndefined: Self = StObject.set(x, "clickToEdit", js.undefined)
    
    @scala.inline
    def setClickToExpand(value: Boolean): Self = StObject.set(x, "clickToExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToExpandUndefined: Self = StObject.set(x, "clickToExpand", js.undefined)
    
    @scala.inline
    def setClickToSelect(value: Boolean): Self = StObject.set(x, "clickToSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToSelectUndefined: Self = StObject.set(x, "clickToSelect", js.undefined)
    
    @scala.inline
    def setHeaderColumnStyle(value: (js.Function1[/* status */ TableCheckboxStatus, js.UndefOr[CSSProperties]]) | CSSProperties): Self = StObject.set(x, "headerColumnStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderColumnStyleFunction1(value: /* status */ TableCheckboxStatus => js.UndefOr[CSSProperties]): Self = StObject.set(x, "headerColumnStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderColumnStyleUndefined: Self = StObject.set(x, "headerColumnStyle", js.undefined)
    
    @scala.inline
    def setHideSelectAll(value: Boolean): Self = StObject.set(x, "hideSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelectAllUndefined: Self = StObject.set(x, "hideSelectAll", js.undefined)
    
    @scala.inline
    def setHideSelectColumn(value: Boolean): Self = StObject.set(x, "hideSelectColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelectColumnUndefined: Self = StObject.set(x, "hideSelectColumn", js.undefined)
    
    @scala.inline
    def setMode(value: RowSelectionType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSelectable(value: js.Array[Double]): Self = StObject.set(x, "nonSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSelectableClasses(value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[String]]) | String): Self = StObject.set(x, "nonSelectableClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSelectableClassesFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[String]): Self = StObject.set(x, "nonSelectableClasses", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNonSelectableClassesUndefined: Self = StObject.set(x, "nonSelectableClasses", js.undefined)
    
    @scala.inline
    def setNonSelectableStyle(
      value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
    ): Self = StObject.set(x, "nonSelectableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonSelectableStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[CSSProperties]): Self = StObject.set(x, "nonSelectableStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNonSelectableStyleUndefined: Self = StObject.set(x, "nonSelectableStyle", js.undefined)
    
    @scala.inline
    def setNonSelectableUndefined: Self = StObject.set(x, "nonSelectable", js.undefined)
    
    @scala.inline
    def setNonSelectableVarargs(value: Double*): Self = StObject.set(x, "nonSelectable", js.Array(value :_*))
    
    @scala.inline
    def setOnSelect(
      value: (/* row */ T, /* isSelected */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Event, Element]) => Unit | Boolean
    ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnSelectAll(
      value: (/* isSelect */ Boolean, /* rows */ js.Array[T], /* e */ SyntheticEvent[Event, Element]) => Unit | js.Array[Double]
    ): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setSelectColumnPosition(value: left | right): Self = StObject.set(x, "selectColumnPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectColumnPositionUndefined: Self = StObject.set(x, "selectColumnPosition", js.undefined)
    
    @scala.inline
    def setSelectColumnStyle(value: (js.Function1[/* props */ Disabled, js.UndefOr[CSSProperties]]) | CSSProperties): Self = StObject.set(x, "selectColumnStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectColumnStyleFunction1(value: /* props */ Disabled => js.UndefOr[CSSProperties]): Self = StObject.set(x, "selectColumnStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectColumnStyleUndefined: Self = StObject.set(x, "selectColumnStyle", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Array[Double | String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: (Double | String)*): Self = StObject.set(x, "selected", js.Array(value :_*))
    
    @scala.inline
    def setSelectionHeaderRenderer(value: /* options */ Indeterminate => ReactElement): Self = StObject.set(x, "selectionHeaderRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionHeaderRendererUndefined: Self = StObject.set(x, "selectionHeaderRenderer", js.undefined)
    
    @scala.inline
    def setSelectionRenderer(value: /* options */ Checked => ReactElement): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
    
    @scala.inline
    def setStyle(
      value: (js.Function2[/* row */ T, /* rowIndex */ Double, js.UndefOr[CSSProperties]]) | CSSProperties
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction2(value: (/* row */ T, /* rowIndex */ Double) => js.UndefOr[CSSProperties]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
