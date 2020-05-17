package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.none
*/
trait PerspectiveProperty[TLength] extends js.Object

object PerspectiveProperty {
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Globals): PerspectiveProperty[TLength] = value.asInstanceOf[PerspectiveProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): PerspectiveProperty[TLength] = value.asInstanceOf[PerspectiveProperty[TLength]]
}

