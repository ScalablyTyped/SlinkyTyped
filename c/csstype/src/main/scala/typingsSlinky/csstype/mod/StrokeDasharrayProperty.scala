package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Dasharray[TLength]
  - typingsSlinky.csstype.csstypeStrings.none
*/
trait StrokeDasharrayProperty[TLength] extends js.Object

object StrokeDasharrayProperty {
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Dasharray[TLength]): StrokeDasharrayProperty[TLength] = value.asInstanceOf[StrokeDasharrayProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): StrokeDasharrayProperty[TLength] = value.asInstanceOf[StrokeDasharrayProperty[TLength]]
}

