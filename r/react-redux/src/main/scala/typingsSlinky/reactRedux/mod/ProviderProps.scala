package typingsSlinky.reactRedux.mod

import typingsSlinky.react.mod.Context
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderProps[A /* <: Action[_] */] extends js.Object {
  /**
    * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
    * If this is used, generate own connect HOC by using connectAdvanced, supplying the same context provided to the
    * Provider. Initial value doesn't matter, as it is overwritten with the internal state of Provider.
    */
  var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.native
  /**
    * The single Redux store in your application.
    */
  var store: Store[_, A] = js.native
}

object ProviderProps {
  @scala.inline
  def apply[A](store: Store[_, A]): ProviderProps[A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[A]]
  }
  @scala.inline
  implicit class ProviderPropsOps[Self[a] <: ProviderProps[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withStore(value: Store[_, A]): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: Context[ReactReduxContextValue[_, AnyAction]]): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

