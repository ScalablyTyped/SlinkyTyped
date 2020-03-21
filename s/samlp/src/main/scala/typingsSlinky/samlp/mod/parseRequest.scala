package typingsSlinky.samlp.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samlp", "parseRequest")
@js.native
object parseRequest extends js.Object {
  def apply(
    req: Request_[ParamsDictionary],
    callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, Unit]
  ): Unit = js.native
}

