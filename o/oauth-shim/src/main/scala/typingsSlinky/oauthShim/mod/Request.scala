package typingsSlinky.oauthShim.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.oauthShim.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var oauthshim: js.UndefOr[AnonData] = js.native
}

