package typingsSlinky.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.Foxx.SimpleMiddleware
  - typingsSlinky.arangodb.Foxx.DelegateMiddleware
*/
trait Middleware extends js.Object

object Middleware {
  @scala.inline
  implicit def apply(value: DelegateMiddleware): Middleware = value.asInstanceOf[Middleware]
  @scala.inline
  implicit def apply(value: SimpleMiddleware): Middleware = value.asInstanceOf[Middleware]
}

