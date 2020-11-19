package typingsSlinky.blueprintjsCore.tabTitleMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.tabMod.ITabProps
import typingsSlinky.blueprintjsCore.tabMod.TabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITabTitleProps extends ITabProps {
  
  /** Handler invoked when this tab is clicked. */
  def onClick(id: TabId, event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  /** ID of the parent `Tabs` to which this tab belongs. Used to generate ID for ARIA attributes. */
  var parentId: TabId = js.native
  
  /** Whether the tab is currently selected. */
  var selected: Boolean = js.native
}
object ITabTitleProps {
  
  @scala.inline
  def apply(
    id: TabId,
    onClick: (TabId, SyntheticMouseEvent[HTMLElement]) => Unit,
    parentId: TabId,
    selected: Boolean
  ): ITabTitleProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), parentId = parentId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabTitleProps]
  }
  
  @scala.inline
  implicit class ITabTitlePropsOps[Self <: ITabTitleProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: (TabId, SyntheticMouseEvent[HTMLElement]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParentId(value: TabId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
