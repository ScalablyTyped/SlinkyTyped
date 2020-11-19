package typingsSlinky.samlp.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samlp", "parseRequest")
@js.native
object parseRequest extends js.Object {
  
  def apply(
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, Unit]
  ): Unit = js.native
}
