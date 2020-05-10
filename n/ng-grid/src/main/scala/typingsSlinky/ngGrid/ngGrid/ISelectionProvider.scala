package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionProvider extends js.Object {
  var ignoreSelectedItemChanges: Boolean = js.native
  var lastClickedRow: js.Any = js.native
  var multi: Boolean = js.native
  var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any = js.native
  var selectedIndex: Double = js.native
  var selectedItems: js.Array[_] = js.native
  def ChangeSelection(rowItem: js.Any, event: js.Any): Unit = js.native
  def getSelection(entity: js.Any): Double = js.native
  def getSelectionIndex(entity: js.Any): Double = js.native
  def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
  def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
}

object ISelectionProvider {
  @scala.inline
  def apply(
    ChangeSelection: (js.Any, js.Any) => Unit,
    getSelection: js.Any => Double,
    getSelectionIndex: js.Any => Double,
    ignoreSelectedItemChanges: Boolean,
    lastClickedRow: js.Any,
    multi: Boolean,
    pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any,
    selectedIndex: Double,
    selectedItems: js.Array[_],
    setSelection: (IRow, Boolean) => Unit,
    toggleSelectAll: (Boolean, Boolean, Boolean) => Unit
  ): ISelectionProvider = {
    val __obj = js.Dynamic.literal(ChangeSelection = js.Any.fromFunction2(ChangeSelection), getSelection = js.Any.fromFunction1(getSelection), getSelectionIndex = js.Any.fromFunction1(getSelectionIndex), ignoreSelectedItemChanges = ignoreSelectedItemChanges.asInstanceOf[js.Any], lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], pKeyParser = pKeyParser.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2(setSelection), toggleSelectAll = js.Any.fromFunction3(toggleSelectAll))
    __obj.asInstanceOf[ISelectionProvider]
  }
  @scala.inline
  implicit class ISelectionProviderOps[Self <: ISelectionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSelection(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelectionIndex(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnoreSelectedItemChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSelectedItemChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastClickedRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastClickedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPKeyParser(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pKeyParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSelection(value: (IRow, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToggleSelectAll(value: (Boolean, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSelectAll")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

