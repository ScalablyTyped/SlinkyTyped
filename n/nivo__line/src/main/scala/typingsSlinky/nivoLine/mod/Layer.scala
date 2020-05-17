package typingsSlinky.nivoLine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoLine.mod.LineLayerType
  - typingsSlinky.nivoLine.mod.LineCustomLayer
*/
trait Layer extends js.Object

object Layer {
  @scala.inline
  implicit def apply(value: LineCustomLayer): Layer = value.asInstanceOf[Layer]
  @scala.inline
  implicit def apply(value: LineLayerType): Layer = value.asInstanceOf[Layer]
}

