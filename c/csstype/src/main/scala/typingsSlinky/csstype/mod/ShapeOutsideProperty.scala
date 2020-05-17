package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Box
  - typingsSlinky.csstype.csstypeStrings.`margin-box`
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait ShapeOutsideProperty extends js.Object

object ShapeOutsideProperty {
  @scala.inline
  def `margin-box`: typingsSlinky.csstype.csstypeStrings.`margin-box` = "margin-box".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`margin-box`]
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply(value: Box): ShapeOutsideProperty = value.asInstanceOf[ShapeOutsideProperty]
  @scala.inline
  implicit def apply(value: Globals): ShapeOutsideProperty = value.asInstanceOf[ShapeOutsideProperty]
  @scala.inline
  implicit def apply(value: String): ShapeOutsideProperty = value.asInstanceOf[ShapeOutsideProperty]
}

