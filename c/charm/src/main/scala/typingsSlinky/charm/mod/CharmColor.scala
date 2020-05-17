package typingsSlinky.charm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.charm.mod.CharmColorName
  - typingsSlinky.charm.mod.CharmColorHex
*/
trait CharmColor extends js.Object

object CharmColor {
  @scala.inline
  implicit def apply(value: CharmColorHex): CharmColor = value.asInstanceOf[CharmColor]
  @scala.inline
  implicit def apply(value: CharmColorName): CharmColor = value.asInstanceOf[CharmColor]
}

