package typingsSlinky.navigo.mod

import typingsSlinky.navigo.anon.As
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * params * / typingsSlinky.navigo.mod.Params, 
/ * query * / java.lang.String, 
scala.Unit]
  - typingsSlinky.navigo.anon.As
*/
trait RouteHandler extends js.Object

object RouteHandler {
  @scala.inline
  implicit def apply(value: As): RouteHandler = value.asInstanceOf[RouteHandler]
  @scala.inline
  implicit def apply(value: js.Function2[/* params */ Params, /* query */ String, Unit]): RouteHandler = value.asInstanceOf[RouteHandler]
}

