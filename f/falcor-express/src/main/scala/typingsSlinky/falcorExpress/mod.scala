package typingsSlinky.falcorExpress

import typingsSlinky.express.mod.Handler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.falcor.mod.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def dataSourceRoute(
    getDataSource: js.Function2[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      DataSource
    ]
  ): Handler = js.native
}

