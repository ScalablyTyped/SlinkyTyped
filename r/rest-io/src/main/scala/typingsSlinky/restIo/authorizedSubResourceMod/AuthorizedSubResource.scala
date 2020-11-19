package typingsSlinky.restIo.authorizedSubResourceMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedSubResource
  extends typingsSlinky.restIo.authorizedResourceMod.default {
  
  def createFindQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
  
  def createProjectionQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
  
  def createPullQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
  
  def createSubUpdateQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
}
