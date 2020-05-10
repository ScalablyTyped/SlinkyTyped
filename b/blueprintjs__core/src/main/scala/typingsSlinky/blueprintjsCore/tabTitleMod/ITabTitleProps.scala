package typingsSlinky.blueprintjsCore.tabTitleMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.tabMod.ITabProps
import typingsSlinky.blueprintjsCore.tabMod.TabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabTitleProps extends ITabProps {
  /** ID of the parent `Tabs` to which this tab belongs. Used to generate ID for ARIA attributes. */
  var parentId: TabId = js.native
  /** Whether the tab is currently selected. */
  var selected: Boolean = js.native
  /** Handler invoked when this tab is clicked. */
  def onClick(id: TabId, event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
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
    def withOnClick(value: (TabId, SyntheticMouseEvent[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParentId(value: TabId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

