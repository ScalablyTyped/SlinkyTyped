package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps because var conflicts: indentWidth, selectionMode, viewport. Inlined columns, groupNestingDepth, selection, checkboxVisibility, cellStyleProps, rowWidth */ @js.native
trait IDetailsGroupDividerProps extends IGroupDividerProps {
  
  /**
    * Rules for rendering column cells.
    */
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  /**
    * Checkbox visibility
    */
  var checkboxVisibility: js.UndefOr[CheckboxVisibility] = js.native
  
  /**
    * Column metadata
    */
  var columns: js.UndefOr[js.Array[IColumn]] = js.native
  
  /**
    * Nesting depth of a grouping
    */
  var groupNestingDepth: js.UndefOr[Double] = js.native
  
  /**
    * Minimum width of the row.
    *
    * @defaultvalue 0
    */
  var rowWidth: js.UndefOr[Double] = js.native
  
  /**
    * Selection from utilities
    */
  var selection: js.UndefOr[ISelection[IObjectWithKey]] = js.native
}
object IDetailsGroupDividerProps {
  
  @scala.inline
  def apply(): IDetailsGroupDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupDividerProps]
  }
  
  @scala.inline
  implicit class IDetailsGroupDividerPropsMutableBuilder[Self <: IDetailsGroupDividerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
    
    @scala.inline
    def setCheckboxVisibility(value: CheckboxVisibility): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxVisibilityUndefined: Self = StObject.set(x, "checkboxVisibility", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setGroupNestingDepth(value: Double): Self = StObject.set(x, "groupNestingDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNestingDepthUndefined: Self = StObject.set(x, "groupNestingDepth", js.undefined)
    
    @scala.inline
    def setRowWidth(value: Double): Self = StObject.set(x, "rowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowWidthUndefined: Self = StObject.set(x, "rowWidth", js.undefined)
    
    @scala.inline
    def setSelection(value: ISelection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
