package typingsSlinky.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MutationRecord
import org.scalajs.dom.raw.Node
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorView.AnonTarget
import typingsSlinky.std.Document_
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeView[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * The DOM node that should hold the node's content. Only meaningful
    * if the node view also defines a `dom` property and if its node
    * type is not a leaf node type. When this is present, ProseMirror
    * will take care of rendering the node's children into it. When it
    * is not present, the node view itself is responsible for rendering
    * (or deciding not to render) its child nodes.
    */
  var contentDOM: js.UndefOr[Node | Null] = js.native
  /**
    * When defining a `selectNode` method, you should also provide a
    * `deselectNode` method to remove the effect again.
    */
  var deselectNode: js.UndefOr[js.Function0[Unit] | Null] = js.native
  /**
    * Called when the node view is removed from the editor or the whole
    * editor is destroyed.
    */
  var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.native
  /**
    * The outer DOM node that represents the document node. When not
    * given, the default strategy is used to create a DOM node.
    */
  var dom: js.UndefOr[Node | Null] = js.native
  /**
    * Called when a DOM
    * [mutation](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver)
    * or a selection change happens within the view. When the change is
    * a selection change, the record will have a `type` property of
    * `"selection"` (which doesn't occur for native mutation records).
    * Return false if the editor should re-read the selection or
    * re-parse the range around the mutation, true if it can safely be
    * ignored.
    */
  var ignoreMutation: js.UndefOr[(js.Function1[/* p */ MutationRecord | AnonTarget, Boolean]) | Null] = js.native
  /**
    * Can be used to override the way the node's selected status (as a
    * node selection) is displayed.
    */
  var selectNode: js.UndefOr[js.Function0[Unit] | Null] = js.native
  /**
    * This will be called to handle setting the selection inside the
    * node. The `anchor` and `head` positions are relative to the start
    * of the node. By default, a DOM selection will be created between
    * the DOM positions corresponding to those positions, but if you
    * override it you can do something else.
    */
  var setSelection: js.UndefOr[
    (js.Function3[/* anchor */ Double, /* head */ Double, /* root */ Document_, Unit]) | Null
  ] = js.native
  /**
    * Can be used to prevent the editor view from trying to handle some
    * or all DOM events that bubble up from the node view. Events for
    * which this returns true are not handled by the editor.
    */
  var stopEvent: js.UndefOr[(js.Function1[/* event */ Event_, Boolean]) | Null] = js.native
  /**
    * When given, this will be called when the view is updating itself.
    * It will be given a node (possibly of a different type), and an
    * array of active decorations (which are automatically drawn, and
    * the node view may ignore if it isn't interested in them), and
    * should return true if it was able to update to that node, and
    * false otherwise. If the node view has a `contentDOM` property (or
    * no `dom` property), updating its child nodes will be handled by
    * ProseMirror.
    */
  var update: js.UndefOr[
    (js.Function2[
      /* node */ typingsSlinky.prosemirrorModel.mod.Node[S], 
      /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
      Boolean
    ]) | Null
  ] = js.native
}

object NodeView {
  @scala.inline
  def apply[S](): NodeView[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeView[S]]
  }
  @scala.inline
  implicit class NodeViewOps[Self[s] <: NodeView[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withContentDOM(value: Node): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDOM: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDOMNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDOM")(null)
        ret
    }
    @scala.inline
    def withDeselectNode(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDeselectNode: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectNodeNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectNode")(null)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(null)
        ret
    }
    @scala.inline
    def withDom(value: Node): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(js.undefined)
        ret
    }
    @scala.inline
    def withDomNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(null)
        ret
    }
    @scala.inline
    def withIgnoreMutation(value: /* p */ MutationRecord | AnonTarget => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMutation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIgnoreMutation: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMutation")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreMutationNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreMutation")(null)
        ret
    }
    @scala.inline
    def withSelectNode(value: () => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSelectNode: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectNodeNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNode")(null)
        ret
    }
    @scala.inline
    def withSetSelection(value: (/* anchor */ Double, /* head */ Double, /* root */ Document_) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetSelection: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelectionNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(null)
        ret
    }
    @scala.inline
    def withStopEvent(value: /* event */ Event_ => Boolean): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStopEvent: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withStopEventNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopEvent")(null)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* node */ typingsSlinky.prosemirrorModel.mod.Node[S], /* decorations */ js.Array[Decoration[StringDictionary[_]]]) => Boolean
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(null)
        ret
    }
  }
  
}

