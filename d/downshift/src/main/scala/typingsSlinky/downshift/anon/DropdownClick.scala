package typingsSlinky.downshift.anon

import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownBackspace
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownNavigationPrevious
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionAddSelectedItem
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionRemoveSelectedItem
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionReset
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetActiveIndex
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetSelectedItems
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemClick
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownBackspace
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownDelete
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationNext
import typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationPrevious
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownClick extends js.Object {
  
  var DropdownClick: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownClick = js.native
  
  var DropdownKeyDownBackspace: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownBackspace = js.native
  
  var DropdownKeyDownNavigationPrevious: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownKeyDownNavigationPrevious = js.native
  
  var FunctionAddSelectedItem: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionAddSelectedItem = js.native
  
  var FunctionRemoveSelectedItem: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionRemoveSelectedItem = js.native
  
  var FunctionReset: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionReset = js.native
  
  var FunctionSetActiveIndex: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetActiveIndex = js.native
  
  var FunctionSetSelectedItems: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.FunctionSetSelectedItems = js.native
  
  var SelectedItemClick: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemClick = js.native
  
  var SelectedItemKeyDownBackspace: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownBackspace = js.native
  
  var SelectedItemKeyDownDelete: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownDelete = js.native
  
  var SelectedItemKeyDownNavigationNext: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationNext = js.native
  
  var SelectedItemKeyDownNavigationPrevious: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.SelectedItemKeyDownNavigationPrevious = js.native
}
object DropdownClick {
  
  @scala.inline
  def apply(
    DropdownClick: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownClick,
    DropdownKeyDownBackspace: DropdownKeyDownBackspace,
    DropdownKeyDownNavigationPrevious: DropdownKeyDownNavigationPrevious,
    FunctionAddSelectedItem: FunctionAddSelectedItem,
    FunctionRemoveSelectedItem: FunctionRemoveSelectedItem,
    FunctionReset: FunctionReset,
    FunctionSetActiveIndex: FunctionSetActiveIndex,
    FunctionSetSelectedItems: FunctionSetSelectedItems,
    SelectedItemClick: SelectedItemClick,
    SelectedItemKeyDownBackspace: SelectedItemKeyDownBackspace,
    SelectedItemKeyDownDelete: SelectedItemKeyDownDelete,
    SelectedItemKeyDownNavigationNext: SelectedItemKeyDownNavigationNext,
    SelectedItemKeyDownNavigationPrevious: SelectedItemKeyDownNavigationPrevious
  ): DropdownClick = {
    val __obj = js.Dynamic.literal(DropdownClick = DropdownClick.asInstanceOf[js.Any], DropdownKeyDownBackspace = DropdownKeyDownBackspace.asInstanceOf[js.Any], DropdownKeyDownNavigationPrevious = DropdownKeyDownNavigationPrevious.asInstanceOf[js.Any], FunctionAddSelectedItem = FunctionAddSelectedItem.asInstanceOf[js.Any], FunctionRemoveSelectedItem = FunctionRemoveSelectedItem.asInstanceOf[js.Any], FunctionReset = FunctionReset.asInstanceOf[js.Any], FunctionSetActiveIndex = FunctionSetActiveIndex.asInstanceOf[js.Any], FunctionSetSelectedItems = FunctionSetSelectedItems.asInstanceOf[js.Any], SelectedItemClick = SelectedItemClick.asInstanceOf[js.Any], SelectedItemKeyDownBackspace = SelectedItemKeyDownBackspace.asInstanceOf[js.Any], SelectedItemKeyDownDelete = SelectedItemKeyDownDelete.asInstanceOf[js.Any], SelectedItemKeyDownNavigationNext = SelectedItemKeyDownNavigationNext.asInstanceOf[js.Any], SelectedItemKeyDownNavigationPrevious = SelectedItemKeyDownNavigationPrevious.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownClick]
  }
  
  @scala.inline
  implicit class DropdownClickOps[Self <: DropdownClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDropdownClick(value: typingsSlinky.downshift.mod.UseMultipleSelectionStateChangeTypes.DropdownClick): Self = this.set("DropdownClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownKeyDownBackspace(value: DropdownKeyDownBackspace): Self = this.set("DropdownKeyDownBackspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownKeyDownNavigationPrevious(value: DropdownKeyDownNavigationPrevious): Self = this.set("DropdownKeyDownNavigationPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionAddSelectedItem(value: FunctionAddSelectedItem): Self = this.set("FunctionAddSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionRemoveSelectedItem(value: FunctionRemoveSelectedItem): Self = this.set("FunctionRemoveSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionReset(value: FunctionReset): Self = this.set("FunctionReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionSetActiveIndex(value: FunctionSetActiveIndex): Self = this.set("FunctionSetActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionSetSelectedItems(value: FunctionSetSelectedItems): Self = this.set("FunctionSetSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemClick(value: SelectedItemClick): Self = this.set("SelectedItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemKeyDownBackspace(value: SelectedItemKeyDownBackspace): Self = this.set("SelectedItemKeyDownBackspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemKeyDownDelete(value: SelectedItemKeyDownDelete): Self = this.set("SelectedItemKeyDownDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemKeyDownNavigationNext(value: SelectedItemKeyDownNavigationNext): Self = this.set("SelectedItemKeyDownNavigationNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemKeyDownNavigationPrevious(value: SelectedItemKeyDownNavigationPrevious): Self = this.set("SelectedItemKeyDownNavigationPrevious", value.asInstanceOf[js.Any])
  }
}
