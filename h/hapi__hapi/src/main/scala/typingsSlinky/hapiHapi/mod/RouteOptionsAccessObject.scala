package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiHapi.mod.RouteOptionsAccessScopeObject
  - typingsSlinky.hapiHapi.mod.RouteOptionsAccessEntityObject
  - typingsSlinky.hapiHapi.mod.RouteOptionsAccessScopeObject with typingsSlinky.hapiHapi.mod.RouteOptionsAccessEntityObject
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

