package typingsSlinky.nextReduxWrapper.mod

import typingsSlinky.next.utilsMod.AppTreeType
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeStoreOptions
  extends NextJSContext[js.Any, AnyAction]
     with Config

object MakeStoreOptions {
  @scala.inline
  def apply(
    AppTree: AppTreeType,
    isServer: Boolean,
    pathname: String,
    query: ParsedUrlQuery,
    store: Store[js.Any, AnyAction]
  ): MakeStoreOptions = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeStoreOptions]
  }
}

