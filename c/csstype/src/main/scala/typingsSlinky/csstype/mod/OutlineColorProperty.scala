package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Color
  - typingsSlinky.csstype.csstypeStrings.invert
*/
trait OutlineColorProperty extends js.Object

object OutlineColorProperty {
  @scala.inline
  def invert: typingsSlinky.csstype.csstypeStrings.invert = "invert".asInstanceOf[typingsSlinky.csstype.csstypeStrings.invert]
  @scala.inline
  implicit def apply(value: Color): OutlineColorProperty = value.asInstanceOf[OutlineColorProperty]
  @scala.inline
  implicit def apply(value: Globals): OutlineColorProperty = value.asInstanceOf[OutlineColorProperty]
}

