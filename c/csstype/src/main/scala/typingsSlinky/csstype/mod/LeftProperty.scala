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
trait LeftProperty[TLength] extends js.Object

object LeftProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): LeftProperty[TLength] = value.asInstanceOf[LeftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): LeftProperty[TLength] = value.asInstanceOf[LeftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): LeftProperty[TLength] = value.asInstanceOf[LeftProperty[TLength]]
}

