package typingsSlinky.resourcejs.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
  var countQuery: js.Any = js.native
  var modelQuery: js.Any = js.native
  var noResponse: Boolean = js.native
  var skipDelete: Boolean = js.native
  var skipResource: Boolean = js.native
}

