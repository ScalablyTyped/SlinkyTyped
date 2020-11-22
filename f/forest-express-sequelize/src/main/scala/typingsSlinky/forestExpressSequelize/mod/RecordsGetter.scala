package typingsSlinky.forestExpressSequelize.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-sequelize", "RecordsGetter")
@js.native
class RecordsGetter () extends AbstractRecordTool {
  
  def getAll(params: Params): js.Promise[js.Array[js.Object]] = js.native
  
  def getIdsFromRequest(request: Request_[ParamsDictionary, _, _, Query]): js.Promise[js.Array[String]] = js.native
}
