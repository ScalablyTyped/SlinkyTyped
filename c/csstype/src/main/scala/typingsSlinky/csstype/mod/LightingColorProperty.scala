package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.csstypeStrings.currentColor
*/
trait LightingColorProperty extends js.Object

object LightingColorProperty {
  @scala.inline
  def currentColor: typingsSlinky.csstype.csstypeStrings.currentColor = "currentColor".asInstanceOf[typingsSlinky.csstype.csstypeStrings.currentColor]
  @scala.inline
  implicit def apply(value: Color): LightingColorProperty = value.asInstanceOf[LightingColorProperty]
  @scala.inline
  implicit def apply(value: Globals): LightingColorProperty = value.asInstanceOf[LightingColorProperty]
}

