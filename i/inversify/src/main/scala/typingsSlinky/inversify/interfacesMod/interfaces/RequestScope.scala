package typingsSlinky.inversify.interfacesMod.interfaces

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Map[js.Any, js.Any]
  - scala.Null
*/
trait RequestScope extends js.Object

object RequestScope {
  @scala.inline
  implicit def apply(value: Map[js.Any, js.Any]): RequestScope = value.asInstanceOf[RequestScope]
  @scala.inline
  implicit def apply(value: Null): RequestScope = value.asInstanceOf[RequestScope]
}

