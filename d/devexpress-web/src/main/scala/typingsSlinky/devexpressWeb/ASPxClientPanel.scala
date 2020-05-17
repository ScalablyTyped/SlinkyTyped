package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxPanel control.
  */
@js.native
trait ASPxClientPanel extends ASPxClientPanelBase {
  /**
    * Occurs when the expanded panel is closed.
    */
  var Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]] = js.native
  /**
    * Occurs when an end-user opens the expand panel.
    */
  var Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]] = js.native
  /**
    * Collapses the expanded panel.
    */
  def Collapse(): Unit = js.native
  /**
    * Expands the collapsed panel.
    */
  def Expand(): Unit = js.native
  /**
    * Returns a value specifying whether the panel can be expanded.
    */
  def IsExpandable(): Boolean = js.native
  /**
    * Returns a value specifying whether the panel is expanded.
    */
  def IsExpanded(): Boolean = js.native
  /**
    * Expands or collapses the client panel.
    */
  def Toggle(): Unit = js.native
}

object ASPxClientPanel {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Collapse: () => Unit,
    Collapsed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    Expand: () => Unit,
    Expanded: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]],
    GetClientVisible: () => Boolean,
    GetContentHtml: () => String,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsExpandable: () => Boolean,
    IsExpanded: () => Boolean,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetContentHtml: String => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Toggle: () => Unit,
    name: String
  ): ASPxClientPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Collapse = js.Any.fromFunction0(Collapse), Collapsed = Collapsed.asInstanceOf[js.Any], Expand = js.Any.fromFunction0(Expand), Expanded = Expanded.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetContentHtml = js.Any.fromFunction0(GetContentHtml), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsExpandable = js.Any.fromFunction0(IsExpandable), IsExpanded = js.Any.fromFunction0(IsExpanded), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetContentHtml = js.Any.fromFunction1(SetContentHtml), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Toggle = js.Any.fromFunction0(Toggle), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPanel]
  }
  @scala.inline
  implicit class ASPxClientPanelOps[Self <: ASPxClientPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapsed(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpanded(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPanel]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpandable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExpandable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsExpanded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExpanded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

