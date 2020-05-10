package typingsSlinky.nextReduxWrapper.mod

import typingsSlinky.next.utilsMod.AppTreeType
import typingsSlinky.next.utilsMod.NextPageContext
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextJSContext[S, A /* <: Action[_] */] extends NextPageContext {
  var isServer: Boolean = js.native
  var store: Store[S, A] = js.native
}

object NextJSContext {
  @scala.inline
  def apply[S, A](
    AppTree: AppTreeType,
    isServer: Boolean,
    pathname: String,
    query: ParsedUrlQuery,
    store: Store[S, A]
  ): NextJSContext[S, A] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextJSContext[S, A]]
  }
  @scala.inline
  implicit class NextJSContextOps[Self[s, a] <: NextJSContext[s, a], S, A] (val x: Self[S, A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, A]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, A]) with Other]
    @scala.inline
    def withIsServer(value: Boolean): Self[S, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: Store[S, A]): Self[S, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

