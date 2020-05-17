package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Position[TLength]
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait ScrollSnapCoordinateProperty[TLength] extends js.Object

object ScrollSnapCoordinateProperty {
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Globals): ScrollSnapCoordinateProperty[TLength] = value.asInstanceOf[ScrollSnapCoordinateProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): ScrollSnapCoordinateProperty[TLength] = value.asInstanceOf[ScrollSnapCoordinateProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): ScrollSnapCoordinateProperty[TLength] = value.asInstanceOf[ScrollSnapCoordinateProperty[TLength]]
}

