package typingsSlinky.nextServer.routerMod

import typingsSlinky.nextServer.AnonApp
import typingsSlinky.nextServer.mittMod.MittEmitter
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/router/router", JSImport.Default)
@js.native
class default protected () extends Router {
  def this(
    pathname: String,
    query: ParsedUrlQuery,
    as: String,
    hasInitialPropsPageLoaderAppWrapAppComponentErrSubscription: AnonApp
  ) = this()
}

/* static members */
@JSImport("next-server/dist/lib/router/router", JSImport.Default)
@js.native
object default extends js.Object {
  var events: MittEmitter = js.native
  def _rewriteUrlForNextExport(url: String): String = js.native
}

