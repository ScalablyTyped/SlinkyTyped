package typingsSlinky.connect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.connect.mod.HandleFunction
  - typingsSlinky.node.httpMod.Server
*/
trait ServerHandle extends js.Object

object ServerHandle {
  @scala.inline
  implicit def apply(value: HandleFunction): ServerHandle = value.asInstanceOf[ServerHandle]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.httpMod.Server): ServerHandle = value.asInstanceOf[ServerHandle]
}

