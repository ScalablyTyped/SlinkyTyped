package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - java.lang.String
*/
trait MarginTopProperty[TLength] extends js.Object

object MarginTopProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): MarginTopProperty[TLength] = value.asInstanceOf[MarginTopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MarginTopProperty[TLength] = value.asInstanceOf[MarginTopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MarginTopProperty[TLength] = value.asInstanceOf[MarginTopProperty[TLength]]
}

