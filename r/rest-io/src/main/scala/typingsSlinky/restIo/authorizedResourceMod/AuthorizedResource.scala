package typingsSlinky.restIo.authorizedResourceMod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizedResource extends Resource {
  
  def baseCreate(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def baseDel(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def baseGetAll(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def baseGetById(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def baseUpdate(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def getRoles(id: String): js.Any = js.native
  
  def hasAccessRightsDefined(req: Request_[ParamsDictionary, _, _, Query], authorizedRoles: js.Array[String]): js.Any = js.native
  
  def hasAuthorizedRole(roles: js.Array[_], authorizedRoles: js.Array[String]): Boolean = js.native
  
  def isAuthorized(req: Request_[ParamsDictionary, _, _, Query], authorizedRoles: js.Array[String]): js.Any = js.native
  
  def isTokenExpired(createdAt: js.Date): Boolean = js.native
  
  var maxDays: Double = js.native
  
  var methodAccess: IMethodAccess = js.native
  
  var permissions: IMethodAccess = js.native
  
  def sendUnauthorized(error: js.Error, res: Response_[_]): Unit = js.native
}
