package typingsSlinky.reactMdTabs.useTabsMovementMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRef
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRefList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue extends js.Object {
  
  var handleClick: MouseEventHandler[HTMLDivElement] = js.native
  
  var handleKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  
  var itemRefs: ItemRefList[HTMLElement] = js.native
  
  var tabs: js.Array[ReactElement] = js.native
}
object ReturnValue {
  
  @scala.inline
  def apply(
    handleClick: SyntheticMouseEvent[HTMLDivElement] => Unit,
    handleKeyDown: SyntheticKeyboardEvent[HTMLDivElement] => Unit,
    itemRefs: ItemRefList[HTMLElement],
    tabs: js.Array[ReactElement]
  ): ReturnValue = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), handleKeyDown = js.Any.fromFunction1(handleKeyDown), itemRefs = itemRefs.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
    
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
    def setHandleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("handleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("handleKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemRefsVarargs(value: ItemRef[HTMLElement]*): Self = this.set("itemRefs", js.Array(value :_*))
    
    @scala.inline
    def setItemRefs(value: ItemRefList[HTMLElement]): Self = this.set("itemRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: ReactElement*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[ReactElement]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
