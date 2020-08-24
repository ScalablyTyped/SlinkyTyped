package typingsSlinky.next.serverRouterMod

import typingsSlinky.next.anon.NewUrl
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/router", "prepareDestination")
@js.native
object prepareDestination extends js.Object {
  def apply(
    destination: String,
    params: Params,
    query: ParsedUrlQuery,
    appendParamsToQuery: Boolean,
    basePath: String
  ): NewUrl = js.native
}

