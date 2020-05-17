package typingsSlinky.oauthShim.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.oauthShim.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
  var oauthshim: js.UndefOr[Data] = js.native
}

