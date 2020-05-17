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
trait MarginInlineProperty[TLength] extends js.Object

object MarginInlineProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): MarginInlineProperty[TLength] = value.asInstanceOf[MarginInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MarginInlineProperty[TLength] = value.asInstanceOf[MarginInlineProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MarginInlineProperty[TLength] = value.asInstanceOf[MarginInlineProperty[TLength]]
}

