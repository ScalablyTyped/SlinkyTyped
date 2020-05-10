package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRow extends js.Object {
  var config: IRowConfig = js.native
  var cursor: String = js.native
  var entity: js.Any = js.native
  var offsetTop: Double = js.native
  var rowDisplayIndex: Double = js.native
  var rowIndex: Double = js.native
  var selected: Boolean = js.native
  var selectionProvider: ISelectionProvider = js.native
  var utils: js.Any = js.native
  def afterSelectionChange(): Unit = js.native
  def alternatingRowClass(): Unit = js.native
  def beforeSelectionChange(): Unit = js.native
  def continueSelection(event: js.Any): Unit = js.native
  def copy(): IRow = js.native
  def ensureEntity(expected: js.Any): Unit = js.native
  def getProperty(path: String): js.Any = js.native
  def setSelection(isSelected: Boolean): Unit = js.native
  def setVars(fromRow: IRow): Unit = js.native
  def toggleSelected(event: js.Any): Boolean = js.native
}

object IRow {
  @scala.inline
  def apply(
    afterSelectionChange: () => Unit,
    alternatingRowClass: () => Unit,
    beforeSelectionChange: () => Unit,
    config: IRowConfig,
    continueSelection: js.Any => Unit,
    copy: () => IRow,
    cursor: String,
    ensureEntity: js.Any => Unit,
    entity: js.Any,
    getProperty: String => js.Any,
    offsetTop: Double,
    rowDisplayIndex: Double,
    rowIndex: Double,
    selected: Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: Boolean => Unit,
    setVars: IRow => Unit,
    toggleSelected: js.Any => Boolean,
    utils: js.Any
  ): IRow = {
    val __obj = js.Dynamic.literal(afterSelectionChange = js.Any.fromFunction0(afterSelectionChange), alternatingRowClass = js.Any.fromFunction0(alternatingRowClass), beforeSelectionChange = js.Any.fromFunction0(beforeSelectionChange), config = config.asInstanceOf[js.Any], continueSelection = js.Any.fromFunction1(continueSelection), copy = js.Any.fromFunction0(copy), cursor = cursor.asInstanceOf[js.Any], ensureEntity = js.Any.fromFunction1(ensureEntity), entity = entity.asInstanceOf[js.Any], getProperty = js.Any.fromFunction1(getProperty), offsetTop = offsetTop.asInstanceOf[js.Any], rowDisplayIndex = rowDisplayIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], setSelection = js.Any.fromFunction1(setSelection), setVars = js.Any.fromFunction1(setVars), toggleSelected = js.Any.fromFunction1(toggleSelected), utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRow]
  }
  @scala.inline
  implicit class IRowOps[Self <: IRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterSelectionChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAlternatingRowClass(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatingRowClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeforeSelectionChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelectionChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConfig(value: IRowConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueSelection(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => IRow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnsureEntity(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureEntity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProperty(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowDisplayIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDisplayIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionProvider(value: ISelectionProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetSelection(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVars(value: IRow => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleSelected(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUtils(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

