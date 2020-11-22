package typingsSlinky.jupyterlabDocumentsearch

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.codemirror.mod.Position
import typingsSlinky.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions
import typingsSlinky.jupyterlabApputils.toolbarMod.Toolbar
import typingsSlinky.jupyterlabCodemirror.mod.CodeMirrorEditor
import typingsSlinky.jupyterlabDocumentsearch.anon.Editor
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchMatch
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.jupyterlabFileeditor.mod.FileEditor
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoMessaging.mod.Message
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.layoutMod.Layout
import typingsSlinky.luminoWidgets.titleMod.Title
import typingsSlinky.luminoWidgets.widgetMod.Widget
import typingsSlinky.luminoWidgets.widgetMod.Widget.ChildMessage
import typingsSlinky.luminoWidgets.widgetMod.Widget.Flag
import typingsSlinky.luminoWidgets.widgetMod.Widget.ResizeMessage
import typingsSlinky.std.DOMStringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider", JSImport.Namespace)
@js.native
object codemirrorsearchproviderMod extends js.Object {
  
  /* Inlined @jupyterlab/apputils.@jupyterlab/apputils.MainAreaWidget<@jupyterlab/fileeditor.@jupyterlab/fileeditor.FileEditor> & {  content :{  editor :@jupyterlab/codemirror.@jupyterlab/codemirror.CodeMirrorEditor}} */
  @js.native
  /**
    * Construct a new widget.
    *
    * @param options - The options for initializing the widget.
    */
  trait CMMainAreaWidget extends js.Object {
    
    var _changeGuard: js.Any = js.native
    
    var _content: js.Any = js.native
    
    var _disposed: js.Any = js.native
    
    var _flags: js.Any = js.native
    
    /**
      * Give focus to the content.
      */
    var _focusContent: js.Any = js.native
    
    var _isRevealed: js.Any = js.native
    
    var _layout: js.Any = js.native
    
    var _parent: js.Any = js.native
    
    var _revealed: js.Any = js.native
    
    var _spinner: js.Any = js.native
    
    var _toolbar: js.Any = js.native
    
    /**
      * Update the content title based on attributes of the main widget.
      */
    var _updateContentTitle: js.Any = js.native
    
    /**
      * Update the title based on the attributes of the child widget.
      */
    var _updateTitle: js.Any = js.native
    
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
      * The content hosted by the widget.
      */
    def content: FileEditor = js.native
    @JSName("content")
    var content_FCMMainAreaWidget: Editor = js.native
    
    /**
      * The dataset for the widget's DOM node.
      */
    val dataset: DOMStringMap = js.native
    
    /**
      * Dispose of the widget and its descendant widgets.
      *
      * #### Notes
      * It is unsafe to use the widget after it has been disposed.
      *
      * All calls made to this method after the first are a no-op.
      */
    def dispose(): Unit = js.native
    
    /**
      * A signal emitted when the widget is disposed.
      */
    val disposed: ISignal[this.type, Unit] = js.native
    
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
      * Test whether the widget has been disposed.
      */
    val isDisposed: Boolean = js.native
    
    /**
      * Test whether the widget is explicitly hidden.
      */
    val isHidden: Boolean = js.native
    
    /**
      * Whether the content widget or an error is revealed.
      */
    def isRevealed: Boolean = js.native
    
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
      * Handle `'activate-request'` messages.
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
      * Handle `'close-request'` messages.
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
      * Handle `'update-request'` messages by forwarding them to the content.
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
      * Process a message sent to the widget.
      *
      * @param msg - The message sent to the widget.
      *
      * #### Notes
      * Subclasses may reimplement this method as needed.
      */
    def processMessage(msg: Message): Unit = js.native
    
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
      * A promise that resolves when the widget is revealed.
      */
    def revealed: js.Promise[Unit] = js.native
    
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
      * The toolbar hosted by the widget.
      */
    def toolbar: Toolbar[typingsSlinky.luminoWidgets.mod.Widget] = js.native
    
    /**
      * Post an `'update-request'` message to the widget.
      *
      * #### Notes
      * This is a simple convenience method for posting the message.
      */
    def update(): Unit = js.native
  }
  
  @js.native
  class CodeMirrorSearchProvider () extends ISearchProvider[CMMainAreaWidget] {
    
    var _changed: js.Any = js.native
    
    var _cm: js.Any = js.native
    
    var _currentMatch: js.Any = js.native
    
    var _currentMatchIsSelected: js.Any = js.native
    
    var _findNext: js.Any = js.native
    
    var _getSearchOverlay: js.Any = js.native
    
    var _matchState: js.Any = js.native
    
    var _onDocChanged: js.Any = js.native
    
    var _overlay: js.Any = js.native
    
    var _parseMatchesFromState: js.Any = js.native
    
    var _query: js.Any = js.native
    
    var _refreshOverlay: js.Any = js.native
    
    /**
      * Do a full search on the entire document.
      *
      * This manually constructs the initial match state across the whole
      * document. This must be done manually because the codemirror overlay
      * is lazy-loaded, so it will only tokenize lines that are in or near
      * the viewport.  This is sufficient for efficiently maintaining the
      * state when changes are made to the document, as changes occur in or
      * near the viewport, but to scan the whole document, a manual search
      * across the entire content is required.
      *
      * @param query The search term
      */
    var _setInitialMatches: js.Any = js.native
    
    var _startQuery: js.Any = js.native
    
    var _toEditorPos: js.Any = js.native
    
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    def changed_MCodeMirrorSearchProvider: ISignal[this.type, Unit] = js.native
    
    def clearSelection(): Unit = js.native
    
    def currentMatch: ISearchMatch | Null = js.native
    
    /**
      * The current index of the selected match.
      */
    @JSName("currentMatchIndex")
    def currentMatchIndex_MCodeMirrorSearchProvider: Double | Null = js.native
    
    def editor: CodeMirrorEditor = js.native
    
    def endQuery(removeOverlay: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Set whether or not the CodemirrorSearchProvider will wrap to the beginning
      * or end of the document on invocations of highlightNext or highlightPrevious, respectively
      */
    var isSubProvider: Boolean = js.native
    
    /**
      * The same list of matches provided by the startQuery promise resolution
      */
    @JSName("matches")
    def matches_MCodeMirrorSearchProvider: js.Array[ISearchMatch] = js.native
    
    def refreshOverlay(): Unit = js.native
    
    /**
      * Initialize the search using the provided options.  Should update the UI
      * to highlight all matches and "select" whatever the first match should be.
      *
      * @param query A RegExp to be use to perform the search
      * @param searchTarget The widget to be searched
      * @param [filters={}] Filter parameters to pass to provider
      *
      * @returns A promise that resolves with a list of all matches
      */
    def startQuery(query: js.RegExp, searchTarget: typingsSlinky.luminoWidgets.mod.Widget): js.Promise[js.Array[ISearchMatch]] = js.native
    def startQuery(query: js.RegExp, searchTarget: typingsSlinky.luminoWidgets.mod.Widget, filters: js.Object): js.Promise[js.Array[ISearchMatch]] = js.native
    
    /**
      * Initialize the search using a CodeMirrorEditor object.
      */
    def startQueryCodeMirror(query: js.RegExp, searchTarget: CodeMirrorEditor): js.Promise[js.Array[ISearchMatch]] = js.native
  }
  /* static members */
  @js.native
  object CodeMirrorSearchProvider extends js.Object {
    
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: typingsSlinky.luminoWidgets.mod.Widget): /* is @jupyterlab/documentsearch.@jupyterlab/documentsearch/lib/providers/codemirrorsearchprovider.CMMainAreaWidget */ Boolean = js.native
  }
  
  @js.native
  class SearchState () extends js.Object {
    
    var lastQuery: String = js.native
    
    var posFrom: Position = js.native
    
    var posTo: Position = js.native
    
    var query: js.RegExp = js.native
  }
}
