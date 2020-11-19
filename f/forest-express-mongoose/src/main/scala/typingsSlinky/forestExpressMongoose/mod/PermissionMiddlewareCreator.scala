package typingsSlinky.forestExpressMongoose.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forest-express-mongoose", "PermissionMiddlewareCreator")
@js.native
class PermissionMiddlewareCreator protected () extends js.Object {
  def this(collectionName: String) = this()
  
  def create(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def delete(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def details(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def export(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def list(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def smartAction(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  def update(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
