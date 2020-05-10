package typingsSlinky.next.routerMod

import typingsSlinky.next.AnonApp
import typingsSlinky.next.mittMod.MittEmitter
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/lib/router/router", JSImport.Default)
@js.native
class default protected () extends Router {
  def this(
    pathname: String,
    query: ParsedUrlQuery,
    as: String,
    hasInitialPropsPageLoaderAppWrapAppComponentErrSubscriptionIsFallback: AnonApp
  ) = this()
}

/* static members */
@JSImport("next/dist/next-server/lib/router/router", JSImport.Default)
@js.native
object default extends js.Object {
  var events: MittEmitter = js.native
  def _rewriteUrlForNextExport(url: String): String = js.native
}

