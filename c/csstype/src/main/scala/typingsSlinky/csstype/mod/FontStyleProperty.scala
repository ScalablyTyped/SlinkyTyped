package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.csstypeStrings.italic
  - typingsSlinky.csstype.csstypeStrings.normal
  - typingsSlinky.csstype.csstypeStrings.oblique
  - java.lang.String
*/
trait FontStyleProperty extends js.Object

object FontStyleProperty {
  @scala.inline
  def italic: typingsSlinky.csstype.csstypeStrings.italic = "italic".asInstanceOf[typingsSlinky.csstype.csstypeStrings.italic]
  @scala.inline
  def normal: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  def oblique: typingsSlinky.csstype.csstypeStrings.oblique = "oblique".asInstanceOf[typingsSlinky.csstype.csstypeStrings.oblique]
  @scala.inline
  implicit def apply(value: Globals): FontStyleProperty = value.asInstanceOf[FontStyleProperty]
  @scala.inline
  implicit def apply(value: String): FontStyleProperty = value.asInstanceOf[FontStyleProperty]
}

