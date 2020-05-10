package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectActions[Item] extends js.Object {
  def closeMenu(): Unit = js.native
  def openMenu(): Unit = js.native
  def reset(): Unit = js.native
  def selectItem(item: Item): Unit = js.native
  def setHighlightedIndex(index: Double): Unit = js.native
  def toggleMenu(): Unit = js.native
}

object UseSelectActions {
  @scala.inline
  def apply[Item](
    closeMenu: () => Unit,
    openMenu: () => Unit,
    reset: () => Unit,
    selectItem: Item => Unit,
    setHighlightedIndex: Double => Unit,
    toggleMenu: () => Unit
  ): UseSelectActions[Item] = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), openMenu = js.Any.fromFunction0(openMenu), reset = js.Any.fromFunction0(reset), selectItem = js.Any.fromFunction1(selectItem), setHighlightedIndex = js.Any.fromFunction1(setHighlightedIndex), toggleMenu = js.Any.fromFunction0(toggleMenu))
    __obj.asInstanceOf[UseSelectActions[Item]]
  }
  @scala.inline
  implicit class UseSelectActionsOps[Self[item] <: UseSelectActions[item], Item] (val x: Self[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Item] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Item] with Other]
    @scala.inline
    def withCloseMenu(value: () => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenMenu(value: () => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectItem(value: Item => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHighlightedIndex(value: Double => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightedIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleMenu(value: () => Unit): Self[Item] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleMenu")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

