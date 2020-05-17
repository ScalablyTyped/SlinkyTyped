package typingsSlinky.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapi.mod.RouteOptionsAccessScopeObject
  - typingsSlinky.hapi.mod.RouteOptionsAccessEntityObject
  - typingsSlinky.hapi.mod.RouteOptionsAccessScopeObject with typingsSlinky.hapi.mod.RouteOptionsAccessEntityObject
*/
trait RouteOptionsAccessObject extends js.Object

object RouteOptionsAccessObject {
  @scala.inline
  implicit def apply(
    value: (RouteOptionsAccessScopeObject with RouteOptionsAccessEntityObject) | RouteOptionsAccessScopeObject
  ): RouteOptionsAccessObject = value.asInstanceOf[RouteOptionsAccessObject]
  @scala.inline
  implicit def apply(value: RouteOptionsAccessEntityObject): RouteOptionsAccessObject = value.asInstanceOf[RouteOptionsAccessObject]
}

