package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbarMethods extends js.Object {
  /**
  	 * Activate item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 * @param activated The activate property value.
  	 */
  def activateItem(index: js.Object, activated: js.Object): Unit = js.native
  /**
  	 * Add item to widget item array
  	 *
  	 * @param item The item to be added.
  	 */
  def addItem(item: js.Object): Unit = js.native
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  def changeLocale(): Unit = js.native
  /**
  	 * Deactivate all buttons.
  	 */
  def deactivateAll(): Unit = js.native
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Disable item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 * @param disabled The disabled property value.
  	 */
  def disableItem(index: js.Object, disabled: js.Object): Unit = js.native
  /**
  	 * Gets the item by matching the provided index.
  	 *
  	 * @param index The index of the item.
  	 */
  def getItem(index: js.Object): js.Object = js.native
  /**
  	 * Remove the item matching provided index.
  	 *
  	 * @param index The index of the item.
  	 */
  def removeItem(index: js.Object): js.Object = js.native
  /**
  	 * Returns the element on which the widget was instantiated
  	 */
  def widget(): Unit = js.native
}

object IgToolbarMethods {
  @scala.inline
  def apply(
    activateItem: (js.Object, js.Object) => Unit,
    addItem: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    deactivateAll: () => Unit,
    destroy: () => Unit,
    disableItem: (js.Object, js.Object) => Unit,
    getItem: js.Object => js.Object,
    removeItem: js.Object => js.Object,
    widget: () => Unit
  ): IgToolbarMethods = {
    val __obj = js.Dynamic.literal(activateItem = js.Any.fromFunction2(activateItem), addItem = js.Any.fromFunction1(addItem), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), deactivateAll = js.Any.fromFunction0(deactivateAll), destroy = js.Any.fromFunction0(destroy), disableItem = js.Any.fromFunction2(disableItem), getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgToolbarMethods]
  }
  @scala.inline
  implicit class IgToolbarMethodsOps[Self <: IgToolbarMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateItem(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddItem(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChangeGlobalLanguage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeGlobalRegional(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalRegional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeLocale(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeactivateAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableItem(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetItem(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveItem(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidget(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

