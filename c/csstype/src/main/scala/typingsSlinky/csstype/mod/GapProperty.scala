package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.normal
  - java.lang.String
*/
trait GapProperty[TLength] extends js.Object

object GapProperty {
  @scala.inline
  def normal[TLength]: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply[TLength](value: Globals): GapProperty[TLength] = value.asInstanceOf[GapProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): GapProperty[TLength] = value.asInstanceOf[GapProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): GapProperty[TLength] = value.asInstanceOf[GapProperty[TLength]]
}

