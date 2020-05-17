package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait TranslateProperty[TLength] extends js.Object

object TranslateProperty {
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Globals): TranslateProperty[TLength] = value.asInstanceOf[TranslateProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): TranslateProperty[TLength] = value.asInstanceOf[TranslateProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): TranslateProperty[TLength] = value.asInstanceOf[TranslateProperty[TLength]]
}

