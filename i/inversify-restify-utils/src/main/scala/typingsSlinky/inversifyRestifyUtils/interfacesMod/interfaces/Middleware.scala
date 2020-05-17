package typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces

import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.restify.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]
  - typingsSlinky.restify.mod.RequestHandler
*/
trait Middleware extends js.Object

object Middleware {
  @scala.inline
  implicit def apply(value: RequestHandler): Middleware = value.asInstanceOf[Middleware]
  @scala.inline
  implicit def apply(value: ServiceIdentifier[js.Any]): Middleware = value.asInstanceOf[Middleware]
}

