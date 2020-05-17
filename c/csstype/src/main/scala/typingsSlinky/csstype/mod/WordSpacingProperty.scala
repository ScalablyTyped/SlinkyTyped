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
trait WordSpacingProperty[TLength] extends js.Object

object WordSpacingProperty {
  @scala.inline
  def normal[TLength]: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply[TLength](value: Globals): WordSpacingProperty[TLength] = value.asInstanceOf[WordSpacingProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): WordSpacingProperty[TLength] = value.asInstanceOf[WordSpacingProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): WordSpacingProperty[TLength] = value.asInstanceOf[WordSpacingProperty[TLength]]
}

