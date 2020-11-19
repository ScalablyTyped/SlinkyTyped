package typingsSlinky.expressMongoSanitize.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-mongo-sanitize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def apply(options: MongoSanitizeOptions): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}
