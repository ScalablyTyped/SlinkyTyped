package typingsSlinky.expressSlowDown.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Express Request with the added `slowDown` property
  */
@js.native
trait RequestWithSlowDown
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  var slowDown: SlowDownRequestAugmentation = js.native
}

