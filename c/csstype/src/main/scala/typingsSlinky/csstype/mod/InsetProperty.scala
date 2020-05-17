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
trait InsetProperty[TLength] extends js.Object

object InsetProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): InsetProperty[TLength] = value.asInstanceOf[InsetProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): InsetProperty[TLength] = value.asInstanceOf[InsetProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): InsetProperty[TLength] = value.asInstanceOf[InsetProperty[TLength]]
}

