package typingsSlinky.apolloServerEnv.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/global", "fetch")
@js.native
object fetch extends js.Object {
  def apply(): js.Promise[Response] = js.native
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

