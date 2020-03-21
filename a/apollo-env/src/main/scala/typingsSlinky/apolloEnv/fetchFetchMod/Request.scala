package typingsSlinky.apolloEnv.fetchFetchMod

import typingsSlinky.nodeFetch.mod.RequestInfo
import typingsSlinky.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Request")
@js.native
class Request protected ()
  extends typingsSlinky.nodeFetch.mod.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}

