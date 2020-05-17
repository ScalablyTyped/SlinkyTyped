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
trait ScrollPaddingBlockProperty[TLength] extends js.Object

object ScrollPaddingBlockProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): ScrollPaddingBlockProperty[TLength] = value.asInstanceOf[ScrollPaddingBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): ScrollPaddingBlockProperty[TLength] = value.asInstanceOf[ScrollPaddingBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): ScrollPaddingBlockProperty[TLength] = value.asInstanceOf[ScrollPaddingBlockProperty[TLength]]
}

