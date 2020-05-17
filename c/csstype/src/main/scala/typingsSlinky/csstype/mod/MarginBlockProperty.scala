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
trait MarginBlockProperty[TLength] extends js.Object

object MarginBlockProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): MarginBlockProperty[TLength] = value.asInstanceOf[MarginBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MarginBlockProperty[TLength] = value.asInstanceOf[MarginBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MarginBlockProperty[TLength] = value.asInstanceOf[MarginBlockProperty[TLength]]
}

