package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxNavBar control.
  */
@js.native
trait ASPxClientNavBar extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientNavBar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires on the client side after a group's expansion state has been changed.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires on the client side before the expansion state of a group is changed.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires when a group header is clicked.
    */
  var HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]] = js.native
  /**
    * Collapses all groups of the navbar.
    */
  def CollapseAll(): Unit = js.native
  /**
    * Expands all groups of the navbar.
    */
  def ExpandAll(): Unit = js.native
  /**
    * Returns the navbar's active group.
    */
  def GetActiveGroup(): ASPxClientNavBarGroup = js.native
  /**
    * Returns a group specified by its index. An ASPxClientNavBarGroup object representing the group located at the specified index within the navbar's ASPxNavBar.Groups collection.
    * @param index An integer value specifying the zero-based index of the group object to retrieve.
    */
  def GetGroup(index: Double): ASPxClientNavBarGroup = js.native
  /**
    * Returns a group specified by its name. An ASPxClientNavBarGroup object that represents the group with the specified name.
    * @param name A string value specifying the name of the group.
    */
  def GetGroupByName(name: String): ASPxClientNavBarGroup = js.native
  /**
    * Returns the number of groups in the navbar.
    */
  def GetGroupCount(): Double = js.native
  /**
    * Returns an item specified by its name. An ASPxClientNavBarItem object that represents the item with the specified name.
    * @param name A string value specifying the name of the item.
    */
  def GetItemByName(name: String): ASPxClientNavBarItem = js.native
  /**
    * Returns the selected item within the navbar control.
    */
  def GetSelectedItem(): ASPxClientNavBarItem = js.native
  /**
    * Makes the specified group active.
    * @param group A ASPxClientNavBarGroup object that specifies the active group.
    */
  def SetActiveGroup(group: ASPxClientNavBarGroup): Unit = js.native
  /**
    * Selects the specified item within the navbar control on the client side.
    * @param item An ASPxClientNavBarItem object specifying the item to select.
    */
  def SetSelectedItem(item: ASPxClientNavBarItem): Unit = js.native
}

object ASPxClientNavBar {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]],
    CollapseAll: () => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]],
    ExpandAll: () => Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]],
    ExpandedChanging: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]],
    GetActiveGroup: () => ASPxClientNavBarGroup,
    GetClientVisible: () => Boolean,
    GetGroup: Double => ASPxClientNavBarGroup,
    GetGroupByName: String => ASPxClientNavBarGroup,
    GetGroupCount: () => Double,
    GetHeight: () => Double,
    GetItemByName: String => ASPxClientNavBarItem,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetSelectedItem: () => ASPxClientNavBarItem,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    HeaderClick: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetActiveGroup: ASPxClientNavBarGroup => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetSelectedItem: ASPxClientNavBarItem => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientNavBar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetActiveGroup = js.Any.fromFunction0(GetActiveGroup), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetGroup = js.Any.fromFunction1(GetGroup), GetGroupByName = js.Any.fromFunction1(GetGroupByName), GetGroupCount = js.Any.fromFunction0(GetGroupCount), GetHeight = js.Any.fromFunction0(GetHeight), GetItemByName = js.Any.fromFunction1(GetItemByName), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetSelectedItem = js.Any.fromFunction0(GetSelectedItem), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), HeaderClick = HeaderClick.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetActiveGroup = js.Any.fromFunction1(SetActiveGroup), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedItem = js.Any.fromFunction1(SetSelectedItem), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBar]
  }
  @scala.inline
  implicit class ASPxClientNavBarOps[Self <: ASPxClientNavBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollapseAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandedChanged(value: ASPxClientEvent[ASPxClientNavBarGroupEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedChanging(value: ASPxClientEvent[ASPxClientNavBarGroupCancelEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandedChanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetActiveGroup(value: () => ASPxClientNavBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetActiveGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroup(value: Double => ASPxClientNavBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGroupByName(value: String => ASPxClientNavBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGroupByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGroupCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetGroupCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemByName(value: String => ASPxClientNavBarItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetItemByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSelectedItem(value: () => ASPxClientNavBarItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSelectedItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaderClick(value: ASPxClientEvent[ASPxClientNavBarGroupClickEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemClick(value: ASPxClientEvent[ASPxClientNavBarItemEventHandler[ASPxClientNavBar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetActiveGroup(value: ASPxClientNavBarGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetActiveGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelectedItem(value: ASPxClientNavBarItem => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSelectedItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

