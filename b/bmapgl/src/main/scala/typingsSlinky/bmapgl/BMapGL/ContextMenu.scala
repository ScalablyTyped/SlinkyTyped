package typingsSlinky.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenu extends js.Object {
  
  def addItem(item: MenuItem): Unit = js.native
  
  def addSeparator(): Unit = js.native
  
  def getItem(index: Double): MenuItem = js.native
  
  def onclose(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def onopen(event: typingsSlinky.bmapgl.anon.Pixel): Unit = js.native
  
  def removeItem(item: MenuItem): Unit = js.native
  
  def removeSeparator(index: Double): Unit = js.native
}
object ContextMenu {
  
  @scala.inline
  def apply(
    addItem: MenuItem => Unit,
    addSeparator: () => Unit,
    getItem: Double => MenuItem,
    onclose: typingsSlinky.bmapgl.anon.Pixel => Unit,
    onopen: typingsSlinky.bmapgl.anon.Pixel => Unit,
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddItem(value: MenuItem => Unit): Self = this.set("addItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSeparator(value: () => Unit): Self = this.set("addSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => MenuItem): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclose(value: typingsSlinky.bmapgl.anon.Pixel => Unit): Self = this.set("onclose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnopen(value: typingsSlinky.bmapgl.anon.Pixel => Unit): Self = this.set("onopen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItem(value: MenuItem => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSeparator(value: Double => Unit): Self = this.set("removeSeparator", js.Any.fromFunction1(value))
  }
}
