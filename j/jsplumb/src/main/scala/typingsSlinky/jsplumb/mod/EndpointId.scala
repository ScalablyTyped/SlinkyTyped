package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.EndpointRectangle
  - typingsSlinky.jsplumb.mod.EndpointDot
  - typingsSlinky.jsplumb.mod.EndpointBlank
*/
trait EndpointId extends EndpointSpec

object EndpointId {
  @scala.inline
  implicit def apply(value: EndpointBlank): EndpointId = value.asInstanceOf[EndpointId]
  @scala.inline
  implicit def apply(value: EndpointDot): EndpointId = value.asInstanceOf[EndpointId]
  @scala.inline
  implicit def apply(value: EndpointRectangle): EndpointId = value.asInstanceOf[EndpointId]
}

