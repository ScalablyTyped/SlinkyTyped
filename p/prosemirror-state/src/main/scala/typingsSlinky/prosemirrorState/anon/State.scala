package typingsSlinky.prosemirrorState.anon

import typingsSlinky.prosemirrorState.mod.EditorState
import typingsSlinky.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[S /* <: typingsSlinky.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var state: EditorState[S] = js.native
  var transactions: js.Array[Transaction[S]] = js.native
}

object State {
  @scala.inline
  def apply[S](state: EditorState[S], transactions: js.Array[Transaction[S]]): State[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[S]]
  }
  @scala.inline
  implicit class StateOps[Self[s] <: State[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withState(value: EditorState[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactions(value: js.Array[Transaction[S]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

