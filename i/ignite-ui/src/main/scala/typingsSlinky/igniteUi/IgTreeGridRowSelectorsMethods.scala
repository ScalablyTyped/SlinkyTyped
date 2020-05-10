package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridRowSelectorsMethods extends js.Object {
  /**
  	 * Changes the check state of a row by index to specified value
  	 *
  	 * @param index Row index
  	 * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
  	 */
  def changeCheckState(index: Double, toCheck: Boolean): Unit = js.native
  /**
  	 * Change the check state of a row by row id
  	 *
  	 * @param rowId Row Id
  	 * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
  	 */
  def changeCheckStateById(rowId: js.Object, toCheck: Boolean): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridrowselectors#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igtreegridrowselectors#options:language) or [locale](ui.igtreegridrowselectors#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  /**
  	 * Returns the check state of the row by id.
  	 *
  	 * @param rowId
  	 */
  def checkStateById(rowId: js.Object): String = js.native
  /**
  	 * Gets an array of all the checked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def checkedRows(): js.Array[_] = js.native
  def destroy(): Unit = js.native
  /**
  	 * Gets an array of all the partially checked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def partiallyCheckedRows(): js.Array[_] = js.native
  def rsRenderColgroup(): Unit = js.native
  /**
  	 * Toggles the check state of a row by index
  	 *
  	 * @param index Row index
  	 */
  def toggleCheckState(index: Double): Unit = js.native
  /**
  	 * Toggles the check state of a row by row id
  	 *
  	 * @param rowId Row Id
  	 */
  def toggleCheckStateById(rowId: js.Object): Unit = js.native
  /**
  	 * Gets an array of all the unchecked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def uncheckedRows(): js.Array[_] = js.native
}

object IgTreeGridRowSelectorsMethods {
  @scala.inline
  def apply(
    changeCheckState: (Double, Boolean) => Unit,
    changeCheckStateById: (js.Object, Boolean) => Unit,
    changeLocale: () => Unit,
    checkStateById: js.Object => String,
    checkedRows: () => js.Array[_],
    destroy: () => Unit,
    partiallyCheckedRows: () => js.Array[_],
    rsRenderColgroup: () => Unit,
    toggleCheckState: Double => Unit,
    toggleCheckStateById: js.Object => Unit,
    uncheckedRows: () => js.Array[_]
  ): IgTreeGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeCheckState = js.Any.fromFunction2(changeCheckState), changeCheckStateById = js.Any.fromFunction2(changeCheckStateById), changeLocale = js.Any.fromFunction0(changeLocale), checkStateById = js.Any.fromFunction1(checkStateById), checkedRows = js.Any.fromFunction0(checkedRows), destroy = js.Any.fromFunction0(destroy), partiallyCheckedRows = js.Any.fromFunction0(partiallyCheckedRows), rsRenderColgroup = js.Any.fromFunction0(rsRenderColgroup), toggleCheckState = js.Any.fromFunction1(toggleCheckState), toggleCheckStateById = js.Any.fromFunction1(toggleCheckStateById), uncheckedRows = js.Any.fromFunction0(uncheckedRows))
    __obj.asInstanceOf[IgTreeGridRowSelectorsMethods]
  }
  @scala.inline
  implicit class IgTreeGridRowSelectorsMethodsOps[Self <: IgTreeGridRowSelectorsMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeCheckState(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCheckState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChangeCheckStateById(value: (js.Object, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeCheckStateById")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChangeLocale(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckStateById(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkStateById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheckedRows(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPartiallyCheckedRows(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyCheckedRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRsRenderColgroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsRenderColgroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleCheckState(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCheckState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleCheckStateById(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCheckStateById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUncheckedRows(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedRows")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

