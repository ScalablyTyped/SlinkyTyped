package typingsSlinky.apolloEnv.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/global", "fetch")
@js.native
object fetch extends js.Object {
  def apply(): js.Promise[Response] = js.native
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

