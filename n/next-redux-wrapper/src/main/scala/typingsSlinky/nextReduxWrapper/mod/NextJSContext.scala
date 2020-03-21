package typingsSlinky.nextReduxWrapper.mod

import typingsSlinky.next.ErrorstatusCodenumber
import typingsSlinky.next.utilsMod.AppTreeType
import typingsSlinky.next.utilsMod.NextPageContext
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextJSContext[S, A /* <: Action[_] */] extends NextPageContext {
  var isServer: Boolean
  var store: Store[S, A]
}

object NextJSContext {
  @scala.inline
  def apply[S, A /* <: Action[_] */](
    AppTree: AppTreeType,
    isServer: Boolean,
    pathname: String,
    query: ParsedUrlQuery,
    store: Store[S, A],
    asPath: String = null,
    err: ErrorstatusCodenumber = null,
    req: IncomingMessage = null,
    res: ServerResponse = null
  ): NextJSContext[S, A] = {
    val __obj = js.Dynamic.literal(AppTree = AppTree.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (asPath != null) __obj.updateDynamic("asPath")(asPath.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextJSContext[S, A]]
  }
}

