package typingsSlinky.reactRedux.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactReduxContextValue[SS, A /* <: Action[_] */] extends js.Object {
  var store: Store[SS, A] = js.native
  var storeState: SS = js.native
}

object ReactReduxContextValue {
  @scala.inline
  def apply[SS, A](store: Store[SS, A], storeState: SS): ReactReduxContextValue[SS, A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], storeState = storeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactReduxContextValue[SS, A]]
  }
  @scala.inline
  implicit class ReactReduxContextValueOps[Self[ss, a] <: ReactReduxContextValue[ss, a], SS, A] (val x: Self[SS, A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SS, A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SS, A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[SS, A]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[SS, A]) with Other]
    @scala.inline
    def withStore(value: Store[SS, A]): Self[SS, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreState(value: SS): Self[SS, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

