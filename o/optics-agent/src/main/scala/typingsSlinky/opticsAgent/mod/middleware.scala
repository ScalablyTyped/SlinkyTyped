package typingsSlinky.opticsAgent.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", "middleware")
@js.native
object middleware extends js.Object {
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
}

