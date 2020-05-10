package typingsSlinky.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Selection
import typingsSlinky.prosemirrorModel.mod.DOMParser
import typingsSlinky.prosemirrorModel.mod.DOMSerializer
import typingsSlinky.prosemirrorModel.mod.Node
import typingsSlinky.prosemirrorModel.mod.ResolvedPos
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorModel.mod.Slice
import typingsSlinky.prosemirrorView.AnonRight
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProps[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Control the DOM attributes of the editable element. May be either
    * an object or a function going from an editor state to an object.
    * By default, the element will get a class `"ProseMirror"`, and
    * will have its `contentEditable` attribute determined by the
    * [`editable` prop](#view.EditorProps.editable). Additional classes
    * provided here will be added to the class. For other attributes,
    * the value provided first (as in
    * [`someProp`](#view.EditorView.someProp)) will be used.
    */
  var attributes: js.UndefOr[
    StringDictionary[String] | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
      js.UndefOr[StringDictionary[String] | Null | Unit]
    ]) | Null
  ] = js.native
  /**
    * The [parser](#model.DOMParser) to use when reading content from
    * the clipboard. When not given, the value of the
    * [`domParser`](#view.EditorProps.domParser) prop is used.
    */
  var clipboardParser: js.UndefOr[DOMParser[S] | Null] = js.native
  /**
    * The DOM serializer to use when putting content onto the
    * clipboard. If not given, the result of
    * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)
    * will be used.
    */
  var clipboardSerializer: js.UndefOr[DOMSerializer[S] | Null] = js.native
  /**
    * A function to parse text from the clipboard into a document
    * slice. Called after
    * [`transformPastedText`](#view.EditorProps.transformPastedText).
    * The default behavior is to split the text into lines, wrap them
    * in `<p>` tags, and call
    * [`clipboardParser`](#view.EditorProps.clipboardParser) on it.
    */
  var clipboardTextParser: js.UndefOr[
    (js.Function2[/* text */ String, /* $context */ ResolvedPos[S], Slice[S]]) | Null
  ] = js.native
  /**
    * A function that will be called to get the text for the current
    * selection when copying text to the clipboard. By default, the
    * editor will use [`textBetween`](#model.Node.textBetween) on the
    * selected range.
    */
  var clipboardTextSerializer: js.UndefOr[(js.Function1[/* p */ Slice[S], String]) | Null] = js.native
  /**
    * Can be used to override the way a selection is created when
    * reading a DOM selection between the given anchor and head.
    */
  var createSelectionBetween: js.UndefOr[
    (js.Function3[
      /* view */ EditorView[S], 
      /* anchor */ ResolvedPos[S], 
      /* head */ ResolvedPos[S], 
      js.UndefOr[Selection | Null]
    ]) | Null
  ] = js.native
  /**
    * A set of [document decorations](#view.Decoration) to show in the
    * view.
    */
  var decorations: js.UndefOr[
    (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      js.UndefOr[DecorationSet[S] | Null]
    ]) | Null
  ] = js.native
  /**
    * The [parser](#model.DOMParser) to use when reading editor changes
    * from the DOM. Defaults to calling
    * [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) on the
    * editor's schema.
    */
  var domParser: js.UndefOr[DOMParser[S] | Null] = js.native
  /**
    * When this returns false, the content of the view is not directly
    * editable.
    */
  var editable: js.UndefOr[
    (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
      Boolean
    ]) | Null
  ] = js.native
  /**
    * Called when the editor is clicked, after `handleClickOn` handlers
    * have been called.
    */
  var handleClick: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean]) | Null
  ] = js.native
  /**
    * Called for each node around a click, from the inside out. The
    * `direct` flag will be true for the inner node.
    */
  var handleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* node */ Node[S], 
      /* nodePos */ Double, 
      /* event */ MouseEvent, 
      /* direct */ Boolean, 
      Boolean
    ]) | Null
  ] = js.native
  /**
    * Can be an object mapping DOM event type names to functions that
    * handle them. Such functions will be called before any handling
    * ProseMirror does of events fired on the editable DOM element.
    * Contrary to the other event handling props, when returning true
    * from such a function, you are responsible for calling
    * `preventDefault` yourself (or not, if you want to allow the
    * default behavior).
    */
  var handleDOMEvents: js.UndefOr[
    (StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ Event_, Boolean]]) | Null
  ] = js.native
  /**
    * Called when the editor is double-clicked, after `handleDoubleClickOn`.
    */
  var handleDoubleClick: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean]) | Null
  ] = js.native
  /**
    * Called for each node around a double click.
    */
  var handleDoubleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* node */ Node[S], 
      /* nodePos */ Double, 
      /* event */ MouseEvent, 
      /* direct */ Boolean, 
      Boolean
    ]) | Null
  ] = js.native
  /**
    * Called when something is dropped on the editor. `moved` will be
    * true if this drop moves from the current selection (which should
    * thus be deleted).
    */
  var handleDrop: js.UndefOr[
    (js.Function4[
      /* view */ EditorView[S], 
      /* event */ Event_, 
      /* slice */ Slice[S], 
      /* moved */ Boolean, 
      Boolean
    ]) | Null
  ] = js.native
  /**
    * Called when the editor receives a `keydown` event.
    */
  var handleKeyDown: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.native
  /**
    * Handler for `keypress` events.
    */
  var handleKeyPress: js.UndefOr[
    (js.Function2[/* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
  ] = js.native
  /**
    * Can be used to override the behavior of pasting. `slice` is the
    * pasted content parsed by the editor, but you can directly access
    * the event to get at the raw content.
    */
  var handlePaste: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* event */ ClipboardEvent, /* slice */ Slice[S], Boolean]) | Null
  ] = js.native
  /**
    * Called when the view, after updating its state, tries to scroll
    * the selection into view. A handler function may return false to
    * indicate that it did not handle the scrolling and further
    * handlers or the default behavior should be tried.
    */
  var handleScrollToSelection: js.UndefOr[(js.Function1[/* view */ EditorView[S], Boolean]) | Null] = js.native
  /**
    * Whenever the user directly input text, this handler is called
    * before the input is applied. If it returns `true`, the default
    * behavior of actually inserting the text is suppressed.
    */
  var handleTextInput: js.UndefOr[
    (js.Function4[/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String, Boolean]) | Null
  ] = js.native
  /**
    * Called when the editor is triple-clicked, after `handleTripleClickOn`.
    */
  var handleTripleClick: js.UndefOr[
    (js.Function3[/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent, Boolean]) | Null
  ] = js.native
  /**
    * Called for each node around a triple click.
    */
  var handleTripleClickOn: js.UndefOr[
    (js.Function6[
      /* view */ EditorView[S], 
      /* pos */ Double, 
      /* node */ Node[S], 
      /* nodePos */ Double, 
      /* event */ MouseEvent, 
      /* direct */ Boolean, 
      Boolean
    ]) | Null
  ] = js.native
  /**
    * Allows you to pass custom rendering and behavior logic for nodes
    * and marks. Should map node and mark names to constructor
    * functions that produce a [`NodeView`](#view.NodeView) object
    * implementing the node's display behavior. For nodes, the third
    * argument `getPos` is a function that can be called to get the
    * node's current position, which can be useful when creating
    * transactions to update it. For marks, the third argument is a
    * boolean that indicates whether the mark's content is inline.
    *
    * `decorations` is an array of node or inline decorations that are
    * active around the node. They are automatically drawn in the
    * normal way, and you will usually just want to ignore this, but
    * they can also be used as a way to provide context information to
    * the node view without adding it to the document itself.
    */
  var nodeViews: js.UndefOr[
    (StringDictionary[
      js.Function4[
        /* node */ Node[S], 
        /* view */ EditorView[S], 
        /* getPos */ js.Function0[Double] | Boolean, 
        /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
        NodeView[S]
      ]
    ]) | Null
  ] = js.native
  /**
    * Determines the extra space (in pixels) that is left above or
    * below the cursor when it is scrolled into view. Defaults to 5.
    */
  var scrollMargin: js.UndefOr[Double | AnonRight | Null] = js.native
  /**
    * Determines the distance (in pixels) between the cursor and the
    * end of the visible viewport at which point, when scrolling the
    * cursor into view, scrolling takes place. Defaults to 0.
    */
  var scrollThreshold: js.UndefOr[Double | AnonRight | Null] = js.native
  /**
    * Can be used to transform pasted content before it is applied to
    * the document.
    */
  var transformPasted: js.UndefOr[(js.Function1[/* p */ Slice[S], Slice[S]]) | Null] = js.native
  /**
    * Can be used to transform pasted HTML text, _before_ it is parsed,
    * for example to clean it up.
    */
  var transformPastedHTML: js.UndefOr[(js.Function1[/* html */ String, String]) | Null] = js.native
  /**
    * Transform pasted plain text.
    */
  var transformPastedText: js.UndefOr[(js.Function1[/* text */ String, String]) | Null] = js.native
}

object EditorProps {
  @scala.inline
  def apply[S](): EditorProps[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProps[S]]
  }
  @scala.inline
  implicit class EditorPropsOps[Self[s] <: EditorProps[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withAttributesFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any => js.UndefOr[StringDictionary[String] | Null | Unit]
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttributes(
      value: StringDictionary[String] | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
          js.UndefOr[StringDictionary[String] | Null | Unit]
        ])
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(null)
        ret
    }
    @scala.inline
    def withClipboardParser(value: DOMParser[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardParser: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardParser")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardParserNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardParser")(null)
        ret
    }
    @scala.inline
    def withClipboardSerializer(value: DOMSerializer[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardSerializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardSerializer: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardSerializer")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardSerializerNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardSerializer")(null)
        ret
    }
    @scala.inline
    def withClipboardTextParser(value: (/* text */ String, /* $context */ ResolvedPos[S]) => Slice[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardTextParser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutClipboardTextParser: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardTextParser")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardTextParserNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardTextParser")(null)
        ret
    }
    @scala.inline
    def withClipboardTextSerializer(value: /* p */ Slice[S] => String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardTextSerializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClipboardTextSerializer: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardTextSerializer")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardTextSerializerNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardTextSerializer")(null)
        ret
    }
    @scala.inline
    def withCreateSelectionBetween(
      value: (/* view */ EditorView[S], /* anchor */ ResolvedPos[S], /* head */ ResolvedPos[S]) => js.UndefOr[Selection | Null]
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSelectionBetween")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateSelectionBetween: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSelectionBetween")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSelectionBetweenNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSelectionBetween")(null)
        ret
    }
    @scala.inline
    def withDecorations(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => js.UndefOr[DecorationSet[S] | Null]
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecorations: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorations")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorationsNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorations")(null)
        ret
    }
    @scala.inline
    def withDomParser(value: DOMParser[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomParser: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domParser")(js.undefined)
        ret
    }
    @scala.inline
    def withDomParserNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domParser")(null)
        ret
    }
    @scala.inline
    def withEditable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditable: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(null)
        ret
    }
    @scala.inline
    def withHandleClick(value: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleClick: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClickNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(null)
        ret
    }
    @scala.inline
    def withHandleClickOn(
      value: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClickOn")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutHandleClickOn: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClickOn")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClickOnNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClickOn")(null)
        ret
    }
    @scala.inline
    def withHandleDOMEvents(value: StringDictionary[js.Function2[/* view */ EditorView[S], /* event */ Event_, Boolean]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDOMEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleDOMEvents: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDOMEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDOMEventsNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDOMEvents")(null)
        ret
    }
    @scala.inline
    def withHandleDoubleClick(value: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDoubleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleDoubleClick: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDoubleClickNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDoubleClick")(null)
        ret
    }
    @scala.inline
    def withHandleDoubleClickOn(
      value: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDoubleClickOn")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutHandleDoubleClickOn: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDoubleClickOn")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDoubleClickOnNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDoubleClickOn")(null)
        ret
    }
    @scala.inline
    def withHandleDrop(
      value: (/* view */ EditorView[S], /* event */ Event_, /* slice */ Slice[S], /* moved */ Boolean) => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHandleDrop: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleDropNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleDrop")(null)
        ret
    }
    @scala.inline
    def withHandleKeyDown(value: (/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleKeyDown: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleKeyDownNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyDown")(null)
        ret
    }
    @scala.inline
    def withHandleKeyPress(value: (/* view */ EditorView[S], /* event */ KeyboardEvent) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyPress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHandleKeyPress: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleKeyPressNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyPress")(null)
        ret
    }
    @scala.inline
    def withHandlePaste(value: (/* view */ EditorView[S], /* event */ ClipboardEvent, /* slice */ Slice[S]) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePaste")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandlePaste: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlePasteNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePaste")(null)
        ret
    }
    @scala.inline
    def withHandleScrollToSelection(value: /* view */ EditorView[S] => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScrollToSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleScrollToSelection: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScrollToSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleScrollToSelectionNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleScrollToSelection")(null)
        ret
    }
    @scala.inline
    def withHandleTextInput(
      value: (/* view */ EditorView[S], /* from */ Double, /* to */ Double, /* text */ String) => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTextInput")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutHandleTextInput: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTextInput")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTextInputNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTextInput")(null)
        ret
    }
    @scala.inline
    def withHandleTripleClick(value: (/* view */ EditorView[S], /* pos */ Double, /* event */ MouseEvent) => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTripleClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandleTripleClick: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTripleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTripleClickNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTripleClick")(null)
        ret
    }
    @scala.inline
    def withHandleTripleClickOn(
      value: (/* view */ EditorView[S], /* pos */ Double, /* node */ Node[S], /* nodePos */ Double, /* event */ MouseEvent, /* direct */ Boolean) => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTripleClickOn")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutHandleTripleClickOn: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTripleClickOn")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleTripleClickOnNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTripleClickOn")(null)
        ret
    }
    @scala.inline
    def withNodeViews(
      value: StringDictionary[
          js.Function4[
            /* node */ Node[S], 
            /* view */ EditorView[S], 
            /* getPos */ js.Function0[Double] | Boolean, 
            /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
            NodeView[S]
          ]
        ]
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeViews: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeViews")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeViewsNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeViews")(null)
        ret
    }
    @scala.inline
    def withScrollMargin(value: Double | AnonRight): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollMargin: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollMarginNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMargin")(null)
        ret
    }
    @scala.inline
    def withScrollThreshold(value: Double | AnonRight): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollThreshold: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollThresholdNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollThreshold")(null)
        ret
    }
    @scala.inline
    def withTransformPasted(value: /* p */ Slice[S] => Slice[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPasted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformPasted: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPasted")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPastedNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPasted")(null)
        ret
    }
    @scala.inline
    def withTransformPastedHTML(value: /* html */ String => String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPastedHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformPastedHTML: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPastedHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPastedHTMLNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPastedHTML")(null)
        ret
    }
    @scala.inline
    def withTransformPastedText(value: /* text */ String => String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPastedText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformPastedText: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPastedText")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPastedTextNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPastedText")(null)
        ret
    }
  }
  
}

