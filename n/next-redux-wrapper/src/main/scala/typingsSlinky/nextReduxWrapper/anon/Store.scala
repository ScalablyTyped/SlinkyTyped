package typingsSlinky.nextReduxWrapper.anon

import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[S /* <: js.Object */, A /* <: Action[_] */] extends js.Object {
  var store: typingsSlinky.redux.mod.Store[S, A] = js.native
}

object Store {
  @scala.inline
  def apply[/* <: js.Object */ S, /* <: typingsSlinky.redux.mod.Action[_] */ A](store: typingsSlinky.redux.mod.Store[S, A]): Store[S, A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store[S, A]]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store[_, _], /* <: js.Object */ S, /* <: typingsSlinky.redux.mod.Action[_] */ A] (val x: Self with (Store[S, A])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStore(value: typingsSlinky.redux.mod.Store[S, A]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

