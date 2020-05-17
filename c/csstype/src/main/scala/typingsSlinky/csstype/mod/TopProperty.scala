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
trait TopProperty[TLength] extends js.Object

object TopProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): TopProperty[TLength] = value.asInstanceOf[TopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): TopProperty[TLength] = value.asInstanceOf[TopProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): TopProperty[TLength] = value.asInstanceOf[TopProperty[TLength]]
}

