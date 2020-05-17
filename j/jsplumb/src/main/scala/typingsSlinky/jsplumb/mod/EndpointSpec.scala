package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* -------------------------------------------- ENDPOINTS ------------------------------------------------------ */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.EndpointId
  - js.Tuple2[
typingsSlinky.jsplumb.mod.EndpointBlank | typingsSlinky.jsplumb.mod.EndpointDot | typingsSlinky.jsplumb.mod.EndpointRectangle, 
typingsSlinky.jsplumb.mod.EndpointBlankOptions | typingsSlinky.jsplumb.mod.EndpointDotOptions | typingsSlinky.jsplumb.mod.EndpointRectangleOptions]
*/
trait EndpointSpec extends js.Object

object EndpointSpec {
  @scala.inline
  implicit def apply(value: EndpointId): EndpointSpec = value.asInstanceOf[EndpointSpec]
  @scala.inline
  implicit def apply(
    value: js.Tuple2[
      EndpointBlank | EndpointDot | EndpointRectangle, 
      EndpointBlankOptions | EndpointDotOptions | EndpointRectangleOptions
    ]
  ): EndpointSpec = value.asInstanceOf[EndpointSpec]
}

