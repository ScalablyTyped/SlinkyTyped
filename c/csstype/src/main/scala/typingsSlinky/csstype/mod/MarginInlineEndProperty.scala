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
trait MarginInlineEndProperty[TLength] extends js.Object

object MarginInlineEndProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): MarginInlineEndProperty[TLength] = value.asInstanceOf[MarginInlineEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MarginInlineEndProperty[TLength] = value.asInstanceOf[MarginInlineEndProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MarginInlineEndProperty[TLength] = value.asInstanceOf[MarginInlineEndProperty[TLength]]
}

