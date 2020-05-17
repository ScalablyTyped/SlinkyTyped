package typingsSlinky.nivoBar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoBar.mod.BarLayerType
  - typingsSlinky.nivoBar.mod.BarCustomLayer
*/
trait Layer extends js.Object

object Layer {
  @scala.inline
  implicit def apply(value: BarCustomLayer): Layer = value.asInstanceOf[Layer]
  @scala.inline
  implicit def apply(value: BarLayerType): Layer = value.asInstanceOf[Layer]
}

