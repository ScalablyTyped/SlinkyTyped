package typingsSlinky.blueprintjsCore.panelStackMod

import typingsSlinky.blueprintjsCore.panelPropsMod.IPanel
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelStackProps extends IProps {
  /**
    * The initial panel to show on mount. This panel cannot be removed from the
    * stack and will appear when the stack is empty.
    * This prop is only used in uncontrolled mode and is thus mutually
    * exclusive with the `stack` prop.
    */
  var initialPanel: js.UndefOr[IPanel[_]] = js.native
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  var onClose: js.UndefOr[js.Function1[/* removedPanel */ IPanel[js.Object], Unit]] = js.native
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  var onOpen: js.UndefOr[js.Function1[/* addedPanel */ IPanel[js.Object], Unit]] = js.native
  /**
    * If false, PanelStack will render all panels in the stack to the DOM, allowing their
    * React component trees to maintain state as a user navigates through the stack.
    * Panels other than the currently active one will be invisible.
    * @default true
    */
  var renderActivePanelOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the header with the "back" button in each panel.
    * @default true
    */
  var showPanelHeader: js.UndefOr[Boolean] = js.native
  /**
    * The full stack of panels in controlled mode. The last panel in the stack
    * will be displayed.
    */
  var stack: js.UndefOr[js.Array[IPanel[_]]] = js.native
}

object IPanelStackProps {
  @scala.inline
  def apply(): IPanelStackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelStackProps]
  }
  @scala.inline
  implicit class IPanelStackPropsOps[Self <: IPanelStackProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialPanel(value: IPanel[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* removedPanel */ IPanel[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* addedPanel */ IPanel[js.Object] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderActivePanelOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActivePanelOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderActivePanelOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActivePanelOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPanelHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanelHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPanelHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanelHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: js.Array[IPanel[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
  }
  
}

