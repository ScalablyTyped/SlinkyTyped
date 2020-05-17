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
trait InsetBlockProperty[TLength] extends js.Object

object InsetBlockProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): InsetBlockProperty[TLength] = value.asInstanceOf[InsetBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): InsetBlockProperty[TLength] = value.asInstanceOf[InsetBlockProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): InsetBlockProperty[TLength] = value.asInstanceOf[InsetBlockProperty[TLength]]
}

