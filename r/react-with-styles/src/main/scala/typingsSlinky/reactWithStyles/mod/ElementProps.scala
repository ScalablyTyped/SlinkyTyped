package typingsSlinky.reactWithStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactWithStyles.mod.SFCProps[C]
  - typingsSlinky.reactWithStyles.mod.ComponentClassProps[C]
*/
trait ElementProps[C] extends js.Object

object ElementProps {
  @scala.inline
  implicit def apply[C](value: ComponentClassProps[C] | SFCProps[C]): ElementProps[C] = value.asInstanceOf[ElementProps[C]]
}

