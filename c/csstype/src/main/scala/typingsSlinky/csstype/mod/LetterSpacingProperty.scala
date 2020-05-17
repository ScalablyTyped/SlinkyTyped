package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.normal
*/
trait LetterSpacingProperty[TLength] extends js.Object

object LetterSpacingProperty {
  @scala.inline
  def normal[TLength]: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply[TLength](value: Globals): LetterSpacingProperty[TLength] = value.asInstanceOf[LetterSpacingProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): LetterSpacingProperty[TLength] = value.asInstanceOf[LetterSpacingProperty[TLength]]
}

