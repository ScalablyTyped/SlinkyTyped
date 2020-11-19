package typingsSlinky.imperium.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imperium", "Imperium")
@js.native
class Imperium () extends js.Object {
  
  /* private */ def addRole(roleName: String, getAcl: GetAcl): Unit = js.native
  
  // Check if current user can do action(s)
  def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  var context: js.Array[String] = js.native
  
  def evaluateRouteAction(req: Request_[ParamsDictionary, _, _, Query], expr: String, key: String, context: Context_): String = js.native
  
  def evaluateRouteActions(req: Request_[ParamsDictionary, _, _, Query], action: js.Array[Action], context: Context_): Actions = js.native
  
  def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  
  def evaluateUserActions(req: Request_[ParamsDictionary, _, _, Query], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = js.native
  
  // Check if user has role(s) act like as an OR
  def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  // Add new role with specific ImperiumGetAcl
  def role(roleName: String): Role_ = js.native
  def role(roleName: String, getAcl: GetAcl): Role_ = js.native
  
  var roles: Roles_ = js.native
}
