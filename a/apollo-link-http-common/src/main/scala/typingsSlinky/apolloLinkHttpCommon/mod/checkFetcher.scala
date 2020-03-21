package typingsSlinky.apolloLinkHttpCommon.mod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-http-common", "checkFetcher")
@js.native
object checkFetcher extends js.Object {
  def apply(
    fetcher: js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
  ): Unit = js.native
}

