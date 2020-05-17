package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenu extends js.Object {
  def addItem(item: MenuItem): Unit = js.native
  def addSeparator(): Unit = js.native
  def getItem(index: Double): MenuItem = js.native
  def onclose(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def onopen(event: typingsSlinky.baidumapWebSdk.anon.Pixel): Unit = js.native
  def removeItem(item: MenuItem): Unit = js.native
  def removeSeparator(index: Double): Unit = js.native
}

object ContextMenu {
  @scala.inline
  def apply(
    addItem: MenuItem => Unit,
    addSeparator: () => Unit,
    getItem: Double => MenuItem,
    onclose: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    onopen: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit,
    removeItem: MenuItem => Unit,
    removeSeparator: Double => Unit
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), addSeparator = js.Any.fromFunction0(addSeparator), getItem = js.Any.fromFunction1(getItem), onclose = js.Any.fromFunction1(onclose), onopen = js.Any.fromFunction1(onopen), removeItem = js.Any.fromFunction1(removeItem), removeSeparator = js.Any.fromFunction1(removeSeparator))
    __obj.asInstanceOf[ContextMenu]
  }
  @scala.inline
  implicit class ContextMenuOps[Self <: ContextMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddItem(value: MenuItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSeparator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => MenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnclose(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnopen(value: typingsSlinky.baidumapWebSdk.anon.Pixel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveItem(value: MenuItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSeparator(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSeparator")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

