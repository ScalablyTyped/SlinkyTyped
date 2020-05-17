package typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]
  - typingsSlinky.express.mod.RequestHandler[
typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
js.Any, 
js.Any, 
typingsSlinky.expressServeStaticCore.mod.Query]
*/
trait Middleware extends js.Object

object Middleware {
  @scala.inline
  implicit def apply(value: RequestHandler[ParamsDictionary, js.Any, js.Any, Query]): Middleware = value.asInstanceOf[Middleware]
  @scala.inline
  implicit def apply(value: ServiceIdentifier[js.Any]): Middleware = value.asInstanceOf[Middleware]
}

