package typingsSlinky.luminoWidgets

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import typingsSlinky.luminoMessaging.mod.ConflatableMessage
import typingsSlinky.luminoMessaging.mod.IMessageHandler
import typingsSlinky.luminoMessaging.mod.Message
import typingsSlinky.luminoWidgets.layoutMod.Layout
import typingsSlinky.luminoWidgets.titleMod.Title
import typingsSlinky.luminoWidgets.widgetMod.Widget.ChildMessage
import typingsSlinky.luminoWidgets.widgetMod.Widget.Flag
import typingsSlinky.luminoWidgets.widgetMod.Widget.IOptions
import typingsSlinky.luminoWidgets.widgetMod.Widget.ResizeMessage
import typingsSlinky.std.DOMStringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@lumino/widgets/types/widget", "Widget")
  @js.native
  /**
    * Construct a new widget.
    *
    * @param options - The options for initializing the widget.
    */
  class Widget ()
    extends IObservableDisposable
       with IMessageHandler {
    def this(options: IOptions) = this()
    
    var _disposed: js.Any = js.native
    
    var _flags: js.Any = js.native
    
    var _layout: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    /**
      * Post an `'activate-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def activate(): Unit = js.native
    
    /**
      * Add a class name to the widget's DOM node.
      *
      * @param name - The class name to add to the node.
      *
      * #### Notes
      * If the class name is already added to the node, this is a no-op.
      *
      * The class name must not contain whitespace.
      */
    def addClass(name: String): Unit = js.native
    
    /**
      * Create an iterator over the widget's children.
      *
      * @returns A new iterator over the children of the widget.
      *
      * #### Notes
      * The widget must have a populated layout in order to have children.
      *
      * If a layout is not installed, the returned iterator will be empty.
      */
    def children(): IIterator[Widget] = js.native
    
    /**
      * Clear the given widget flag.
      *
      * #### Notes
      * This will not typically be called directly by user code.
      */
    def clearFlag(flag: Flag): Unit = js.native
    
    /**
      * Send a `'close-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for sending the message.
      */
    def close(): Unit = js.native
    
    /**
      * Test whether a widget is a descendant of this widget.
      *
      * @param widget - The descendant widget of interest.
      *
      * @returns `true` if the widget is a descendant, `false` otherwise.
      */
    def contains(widget: Widget): Boolean = js.native
    
    /**
      * The dataset for the widget's DOM node.
      */
    val dataset: DOMStringMap = js.native
    
    /**
      * Post a `'fit-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def fit(): Unit = js.native
    
    /**
      * Test whether the widget's DOM node has the given class name.
      *
      * @param name - The class name of interest.
      *
      * @returns `true` if the node has the class, `false` otherwise.
      */
    def hasClass(name: String): Boolean = js.native
    
    /**
      * Hide the widget and make it hidden to its parent widget.
      *
      * #### Notes
      * This causes the [[isHidden]] property to be `true`.
      *
      * If the widget is explicitly hidden, this is a no-op.
      */
    def hide(): Unit = js.native
    
    /**
      * Get the id of the widget's DOM node.
      */
    /**
      * Set the id of the widget's DOM node.
      */
    var id: String = js.native
    
    /**
      * Test whether the widget's node is attached to the DOM.
      */
    val isAttached: Boolean = js.native
    
    /**
      * Test whether the widget is explicitly hidden.
      */
    val isHidden: Boolean = js.native
    
    /**
      * Test whether the widget is visible.
      *
      * #### Notes
      * A widget is visible when it is attached to the DOM, is not
      * explicitly hidden, and has no explicitly hidden ancestors.
      */
    val isVisible: Boolean = js.native
    
    /**
      * Get the layout for the widget.
      */
    /**
      * Set the layout for the widget.
      *
      * #### Notes
      * The layout is single-use only. It cannot be changed after the
      * first assignment.
      *
      * The layout is disposed automatically when the widget is disposed.
      */
    var layout: Layout | Null = js.native
    
    /**
      * Get the DOM node owned by the widget.
      */
    val node: HTMLElement = js.native
    
    /**
      * Invoke the message processing routine of the widget's layout.
      *
      * @param msg - The message to dispatch to the layout.
      *
      * #### Notes
      * This is a no-op if the widget does not have a layout.
      *
      * This will not typically be called directly by user code.
      */
    /* protected */ def notifyLayout(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'activate-request'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onActivateRequest(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-attach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterAttach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-detach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterDetach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-hide'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterHide(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on an `'after-show'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onAfterShow(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-attach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeAttach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-detach'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeDetach(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-hide'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeHide(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'before-show'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onBeforeShow(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-added'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onChildAdded(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'child-removed'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onChildRemoved(msg: ChildMessage): Unit = js.native
    
    /**
      * A message handler invoked on a `'close-request'` message.
      *
      * #### Notes
      * The default implementation unparents or detaches the widget.
      */
    /* protected */ def onCloseRequest(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'fit-request'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onFitRequest(msg: Message): Unit = js.native
    
    /**
      * A message handler invoked on a `'resize'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
    /**
      * A message handler invoked on an `'update-request'` message.
      *
      * #### Notes
      * The default implementation of this handler is a no-op.
      */
    /* protected */ def onUpdateRequest(msg: Message): Unit = js.native
    
    /**
      * Get the parent of the widget.
      */
    /**
      * Set the parent of the widget.
      *
      * #### Notes
      * Children are typically added to a widget by using a layout, which
      * means user code will not normally set the parent widget directly.
      *
      * The widget will be automatically removed from its old parent.
      *
      * This is a no-op if there is no effective parent change.
      */
    var parent: Widget | Null = js.native
    
    /**
      * Remove a class name from the widget's DOM node.
      *
      * @param name - The class name to remove from the node.
      *
      * #### Notes
      * If the class name is not yet added to the node, this is a no-op.
      *
      * The class name must not contain whitespace.
      */
    def removeClass(name: String): Unit = js.native
    
    /**
      * Set the given widget flag.
      *
      * #### Notes
      * This will not typically be called directly by user code.
      */
    def setFlag(flag: Flag): Unit = js.native
    
    /**
      * Show or hide the widget according to a boolean value.
      *
      * @param hidden - `true` to hide the widget, or `false` to show it.
      *
      * #### Notes
      * This is a convenience method for `hide()` and `show()`.
      */
    def setHidden(hidden: Boolean): Unit = js.native
    
    /**
      * Show the widget and make it visible to its parent widget.
      *
      * #### Notes
      * This causes the [[isHidden]] property to be `false`.
      *
      * If the widget is not explicitly hidden, this is a no-op.
      */
    def show(): Unit = js.native
    
    /**
      * Test whether the given widget flag is set.
      *
      * #### Notes
      * This will not typically be called directly by user code.
      */
    def testFlag(flag: Flag): Boolean = js.native
    
    /**
      * The title object for the widget.
      *
      * #### Notes
      * The title object is used by some container widgets when displaying
      * the widget alongside some title, such as a tab panel or side bar.
      *
      * Since not all widgets will use the title, it is created on demand.
      *
      * The `owner` property of the title is set to this widget.
      */
    val title: Title[Widget] = js.native
    
    /**
      * Toggle a class name on the widget's DOM node.
      *
      * @param name - The class name to toggle on the node.
      *
      * @param force - Whether to force add the class (`true`) or force
      *   remove the class (`false`). If not provided, the presence of
      *   the class will be toggled from its current state.
      *
      * @returns `true` if the class is now present, `false` otherwise.
      *
      * #### Notes
      * The class name must not contain whitespace.
      */
    def toggleClass(name: String): Boolean = js.native
    def toggleClass(name: String, force: Boolean): Boolean = js.native
    
    /**
      * Post an `'update-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def update(): Unit = js.native
  }
  object Widget {
    
    /**
      * A message class for child related messages.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.ChildMessage")
    @js.native
    class ChildMessage protected () extends Message {
      /**
        * Construct a new child message.
        *
        * @param type - The message type.
        *
        * @param child - The child widget for the message.
        */
      def this(`type`: String, child: Widget) = this()
      
      /**
        * The child widget for the message.
        */
      val child: Widget = js.native
    }
    
    @js.native
    sealed trait Flag extends StObject
    /**
      * An enum of widget bit flags.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.Flag")
    @js.native
    object Flag extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Flag with Double] = js.native
      
      /**
        * A layout cannot be set on the widget.
        */
      @js.native
      sealed trait DisallowLayout extends Flag
      /* 16 */ val DisallowLayout: typingsSlinky.luminoWidgets.widgetMod.Widget.Flag.DisallowLayout with Double = js.native
      
      /**
        * The widget is attached to the DOM.
        */
      @js.native
      sealed trait IsAttached extends Flag
      /* 2 */ val IsAttached: typingsSlinky.luminoWidgets.widgetMod.Widget.Flag.IsAttached with Double = js.native
      
      /**
        * The widget has been disposed.
        */
      @js.native
      sealed trait IsDisposed extends Flag
      /* 1 */ val IsDisposed: typingsSlinky.luminoWidgets.widgetMod.Widget.Flag.IsDisposed with Double = js.native
      
      /**
        * The widget is hidden.
        */
      @js.native
      sealed trait IsHidden extends Flag
      /* 4 */ val IsHidden: typingsSlinky.luminoWidgets.widgetMod.Widget.Flag.IsHidden with Double = js.native
      
      /**
        * The widget is visible.
        */
      @js.native
      sealed trait IsVisible extends Flag
      /* 8 */ val IsVisible: typingsSlinky.luminoWidgets.widgetMod.Widget.Flag.IsVisible with Double = js.native
    }
    
    /**
      * A collection of stateless messages related to widgets.
      */
    object Msg {
      
      /**
        * A singleton conflatable `'activate-request'` message.
        *
        * #### Notes
        * This message should be dispatched to a widget when it should
        * perform the actions necessary to activate the widget, which
        * may include focusing its node or descendant node.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.ActivateRequest")
      @js.native
      val ActivateRequest: ConflatableMessage = js.native
      
      /**
        * A singleton `'after-attach'` message.
        *
        * #### Notes
        * This message is sent to a widget after it is attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterAttach")
      @js.native
      val AfterAttach: Message = js.native
      
      /**
        * A singleton `'after-detach'` message.
        *
        * #### Notes
        * This message is sent to a widget after it is detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterDetach")
      @js.native
      val AfterDetach: Message = js.native
      
      /**
        * A singleton `'after-hide'` message.
        *
        * #### Notes
        * This message is sent to a widget after it becomes not-visible.
        *
        * This message is **not** sent when the widget is being detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterHide")
      @js.native
      val AfterHide: Message = js.native
      
      /**
        * A singleton `'after-show'` message.
        *
        * #### Notes
        * This message is sent to a widget after it becomes visible.
        *
        * This message is **not** sent when the widget is being attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.AfterShow")
      @js.native
      val AfterShow: Message = js.native
      
      /**
        * A singleton `'before-attach'` message.
        *
        * #### Notes
        * This message is sent to a widget before it is attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeAttach")
      @js.native
      val BeforeAttach: Message = js.native
      
      /**
        * A singleton `'before-detach'` message.
        *
        * #### Notes
        * This message is sent to a widget before it is detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeDetach")
      @js.native
      val BeforeDetach: Message = js.native
      
      /**
        * A singleton `'before-hide'` message.
        *
        * #### Notes
        * This message is sent to a widget before it becomes not-visible.
        *
        * This message is **not** sent when the widget is being detached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeHide")
      @js.native
      val BeforeHide: Message = js.native
      
      /**
        * A singleton `'before-show'` message.
        *
        * #### Notes
        * This message is sent to a widget before it becomes visible.
        *
        * This message is **not** sent when the widget is being attached.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.BeforeShow")
      @js.native
      val BeforeShow: Message = js.native
      
      /**
        * A singleton conflatable `'close-request'` message.
        *
        * #### Notes
        * This message should be dispatched to a widget when it should close
        * and remove itself from the widget hierarchy.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.CloseRequest")
      @js.native
      val CloseRequest: ConflatableMessage = js.native
      
      /**
        * A singleton conflatable `'fit-request'` message.
        *
        * #### Notes
        * For widgets with a layout, this message will inform the layout to
        * recalculate its size constraints to fit the space requirements of
        * its child widgets, and to update their position and size. Not all
        * layouts will respond to messages of this type.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.FitRequest")
      @js.native
      val FitRequest: ConflatableMessage = js.native
      
      /**
        * A singleton `'parent-changed'` message.
        *
        * #### Notes
        * This message is sent to a widget when its parent has changed.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.ParentChanged")
      @js.native
      val ParentChanged: Message = js.native
      
      /**
        * A singleton conflatable `'update-request'` message.
        *
        * #### Notes
        * This message can be dispatched to supporting widgets in order to
        * update their content based on the current widget state. Not all
        * widgets will respond to messages of this type.
        *
        * For widgets with a layout, this message will inform the layout to
        * update the position and size of its child widgets.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.Msg.UpdateRequest")
      @js.native
      val UpdateRequest: ConflatableMessage = js.native
    }
    
    /**
      * A message class for `'resize'` messages.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.ResizeMessage")
    @js.native
    class ResizeMessage protected () extends Message {
      /**
        * Construct a new resize message.
        *
        * @param width - The **offset width** of the widget, or `-1` if
        *   the width is not known.
        *
        * @param height - The **offset height** of the widget, or `-1` if
        *   the height is not known.
        */
      def this(width: Double, height: Double) = this()
      
      /**
        * The offset height of the widget.
        *
        * #### Notes
        * This will be `-1` if the height is unknown.
        */
      val height: Double = js.native
      
      /**
        * The offset width of the widget.
        *
        * #### Notes
        * This will be `-1` if the width is unknown.
        */
      val width: Double = js.native
    }
    /**
      * The namespace for the `ResizeMessage` class statics.
      */
    object ResizeMessage {
      
      /**
        * A singleton `'resize'` message with an unknown size.
        */
      @JSImport("@lumino/widgets/types/widget", "Widget.ResizeMessage.UnknownSize")
      @js.native
      val UnknownSize: ResizeMessage = js.native
    }
    
    /**
      * Attach a widget to a host DOM node.
      *
      * @param widget - The widget of interest.
      *
      * @param host - The DOM node to use as the widget's host.
      *
      * @param ref - The child of `host` to use as the reference element.
      *   If this is provided, the widget will be inserted before this
      *   node in the host. The default is `null`, which will cause the
      *   widget to be added as the last child of the host.
      *
      * #### Notes
      * This will throw an error if the widget is not a root widget, if
      * the widget is already attached, or if the host is not attached
      * to the DOM.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.attach")
    @js.native
    def attach(widget: Widget, host: HTMLElement): Unit = js.native
    @JSImport("@lumino/widgets/types/widget", "Widget.attach")
    @js.native
    def attach(widget: Widget, host: HTMLElement, ref: HTMLElement): Unit = js.native
    
    /**
      * Detach the widget from its host DOM node.
      *
      * @param widget - The widget of interest.
      *
      * #### Notes
      * This will throw an error if the widget is not a root widget,
      * or if the widget is not attached to the DOM.
      */
    @JSImport("@lumino/widgets/types/widget", "Widget.detach")
    @js.native
    def detach(widget: Widget): Unit = js.native
    
    /**
      * An options object for initializing a widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The optional node to use for the widget.
        *
        * If a node is provided, the widget will assume full ownership
        * and control of the node, as if it had created the node itself.
        *
        * The default is a new `<div>`.
        */
      var node: js.UndefOr[HTMLElement] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      }
    }
  }
}
