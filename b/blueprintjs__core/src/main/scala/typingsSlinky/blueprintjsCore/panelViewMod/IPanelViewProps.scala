package typingsSlinky.blueprintjsCore.panelViewMod

import typingsSlinky.blueprintjsCore.panelPropsMod.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelViewProps extends js.Object {
  /** The panel to be displayed. */
  var panel: IPanel[js.Object] = js.native
  /** The previous panel in the stack, for rendering the "back" button. */
  var previousPanel: js.UndefOr[IPanel[js.Object]] = js.native
  /** Whether to show the header with the "back" button. */
  var showHeader: Boolean = js.native
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  def onClose(removedPanel: IPanel[js.Object]): Unit = js.native
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  def onOpen(addedPanel: IPanel[js.Object]): Unit = js.native
}

object IPanelViewProps {
  @scala.inline
  def apply(
    onClose: IPanel[js.Object] => Unit,
    onOpen: IPanel[js.Object] => Unit,
    panel: IPanel[js.Object],
    showHeader: Boolean
  ): IPanelViewProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelViewProps]
  }
  @scala.inline
  implicit class IPanelViewPropsOps[Self <: IPanelViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClose(value: IPanel[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: IPanel[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPanel(value: IPanel[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousPanel(value: IPanel[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPanel")(js.undefined)
        ret
    }
  }
  
}

