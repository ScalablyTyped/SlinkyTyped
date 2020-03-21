package typingsSlinky.expressMongoSanitize.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-mongo-sanitize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def apply(options: MongoSanitizeOptions): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

