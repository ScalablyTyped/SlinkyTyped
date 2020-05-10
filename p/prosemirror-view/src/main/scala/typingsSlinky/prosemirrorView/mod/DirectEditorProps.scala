package typingsSlinky.prosemirrorView.mod

import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectEditorProps[S /* <: Schema[_, _] */] extends EditorProps[S] {
  /**
    * The callback over which to send transactions (state updates)
    * produced by the view. If you specify this, you probably want to
    * make sure this ends up calling the view's
    * [`updateState`](#view.EditorView.updateState) method with a new
    * state that has the transaction
    * [applied](#state.EditorState.apply). The callback will be bound to have
    * the view instance as its `this` binding.
    */
  var dispatchTransaction: js.UndefOr[
    (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      Unit
    ]) | Null
  ] = js.native
  /**
    * The current state of the editor.
    */
  var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any = js.native
}

object DirectEditorProps {
  @scala.inline
  def apply[S](
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
  @scala.inline
  implicit class DirectEditorPropsOps[Self[s] <: DirectEditorProps[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispatchTransaction(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any => Unit
    ): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispatchTransaction: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatchTransactionNull: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchTransaction")(null)
        ret
    }
  }
  
}

