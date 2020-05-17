package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.csstypeStrings.currentColor
*/
trait FloodColorProperty extends js.Object

object FloodColorProperty {
  @scala.inline
  def currentColor: typingsSlinky.csstype.csstypeStrings.currentColor = "currentColor".asInstanceOf[typingsSlinky.csstype.csstypeStrings.currentColor]
  @scala.inline
  implicit def apply(value: Color): FloodColorProperty = value.asInstanceOf[FloodColorProperty]
  @scala.inline
  implicit def apply(value: Globals): FloodColorProperty = value.asInstanceOf[FloodColorProperty]
}

