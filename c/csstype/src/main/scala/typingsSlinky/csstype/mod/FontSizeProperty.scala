package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.AbsoluteSize
  - TLength
  - typingsSlinky.csstype.csstypeStrings.larger
  - typingsSlinky.csstype.csstypeStrings.smaller
  - java.lang.String
*/
trait FontSizeProperty[TLength] extends js.Object

object FontSizeProperty {
  @scala.inline
  def larger[TLength]: typingsSlinky.csstype.csstypeStrings.larger = "larger".asInstanceOf[typingsSlinky.csstype.csstypeStrings.larger]
  @scala.inline
  def smaller[TLength]: typingsSlinky.csstype.csstypeStrings.smaller = "smaller".asInstanceOf[typingsSlinky.csstype.csstypeStrings.smaller]
  @scala.inline
  implicit def apply[TLength](value: AbsoluteSize): FontSizeProperty[TLength] = value.asInstanceOf[FontSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): FontSizeProperty[TLength] = value.asInstanceOf[FontSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): FontSizeProperty[TLength] = value.asInstanceOf[FontSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): FontSizeProperty[TLength] = value.asInstanceOf[FontSizeProperty[TLength]]
}

