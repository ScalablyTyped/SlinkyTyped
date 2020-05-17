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
trait MarginRightProperty[TLength] extends js.Object

object MarginRightProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): MarginRightProperty[TLength] = value.asInstanceOf[MarginRightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MarginRightProperty[TLength] = value.asInstanceOf[MarginRightProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MarginRightProperty[TLength] = value.asInstanceOf[MarginRightProperty[TLength]]
}

