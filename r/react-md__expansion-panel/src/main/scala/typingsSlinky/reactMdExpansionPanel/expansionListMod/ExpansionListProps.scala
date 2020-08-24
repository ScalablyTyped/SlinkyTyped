package typingsSlinky.reactMdExpansionPanel.expansionListMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpansionListProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * This should be 2 or more expansion panel components.
    */
  @JSName("children")
  var children_ExpansionListProps: ReactElement = js.native
  /**
    * The keydown event handler that allows for focusing the next/previous panel
    * as well as the first/last with keyboard shortcuts. This is provided by the
    * `usePanels` hook automatically.
    */
  @JSName("onKeyDown")
  var onKeyDown_ExpansionListProps: KeyboardEventHandler[HTMLDivElement] = js.native
}

object ExpansionListProps {
  @scala.inline
  def apply(onKeyDown: SyntheticKeyboardEvent[HTMLDivElement] => Unit): ExpansionListProps = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[ExpansionListProps]
  }
  @scala.inline
  implicit class ExpansionListPropsOps[Self <: ExpansionListProps] (val x: Self) extends AnyVal {
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
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

