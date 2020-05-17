package typingsSlinky.keycloakConnect.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantedRequest
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  var kauth: typingsSlinky.keycloakConnect.anon.Grant = js.native
}

