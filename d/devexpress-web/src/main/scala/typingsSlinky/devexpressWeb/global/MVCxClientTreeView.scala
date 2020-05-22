package typingsSlinky.devexpressWeb.global

import typingsSlinky.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsSlinky.devexpressWeb.ASPxClientEventHandler
import typingsSlinky.devexpressWeb.ASPxClientTreeViewNodeCancelEventHandler
import typingsSlinky.devexpressWeb.ASPxClientTreeViewNodeClickEventHandler
import typingsSlinky.devexpressWeb.ASPxClientTreeViewNodeEventHandler
import typingsSlinky.devexpressWeb.ASPxClientTreeViewNodeProcessingModeEventHandler
import typingsSlinky.devexpressWeb.MVCxClientBeginCallbackEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the TreeView extension.
  */
@JSGlobal("MVCxClientTreeView")
@js.native
class MVCxClientTreeView ()
  extends typingsSlinky.devexpressWeb.MVCxClientTreeView {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  override var BeginCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientBeginCallbackEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  @JSName("BeginCallback")
  override var BeginCallback_MVCxClientTreeView: typingsSlinky.devexpressWeb.ASPxClientEvent[
    MVCxClientBeginCallbackEventHandler[typingsSlinky.devexpressWeb.MVCxClientTreeView]
  ] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTreeView.
    */
  /* CompleteClass */
  override var CallbackError: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientCallbackErrorEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Occurs on the client side when the node's checked state is changed by clicking on a check box.
    */
  /* CompleteClass */
  override var CheckedChanged: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeProcessingModeEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientEndCallbackEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  /* CompleteClass */
  override var ExpandedChanged: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  /* CompleteClass */
  override var ExpandedChanging: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeCancelEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typingsSlinky.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsSlinky.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Fires on the client side after a node has been clicked.
    */
  /* CompleteClass */
  override var NodeClick: typingsSlinky.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeClickEventHandler[typingsSlinky.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  /* CompleteClass */
  override def CollapseAll(): Unit = js.native
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  /* CompleteClass */
  override def ExpandAll(): Unit = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection. An ASPxClientTreeViewNode object, representing the node located at the specified index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  /* CompleteClass */
  override def GetNode(index: Double): typingsSlinky.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns a node specified by its name. An ASPxClientTreeViewNode object that represents the node with the specified name.
    * @param name A string value specifying the name of the node.
    */
  /* CompleteClass */
  override def GetNodeByName(name: String): typingsSlinky.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns a node specified by its text. An ASPxClientTreeViewNode object that represents the node with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  /* CompleteClass */
  override def GetNodeByText(text: String): typingsSlinky.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  /* CompleteClass */
  override def GetNodeCount(): Double = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  /* CompleteClass */
  override def GetRootNode(): typingsSlinky.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  /* CompleteClass */
  override def GetSelectedNode(): typingsSlinky.devexpressWeb.ASPxClientTreeViewNode = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  /* CompleteClass */
  override def SetSelectedNode(node: typingsSlinky.devexpressWeb.ASPxClientTreeViewNode): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientTreeView")
@js.native
object MVCxClientTreeView extends js.Object {
  /**
    * Converts the specified object to the MVCxClientTreeView type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typingsSlinky.devexpressWeb.MVCxClientTreeView = js.native
}

