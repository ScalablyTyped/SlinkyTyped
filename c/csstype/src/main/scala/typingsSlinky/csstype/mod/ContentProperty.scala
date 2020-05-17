package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.ContentList
  - typingsSlinky.csstype.csstypeStrings.none
  - typingsSlinky.csstype.csstypeStrings.normal
  - java.lang.String
*/
trait ContentProperty extends js.Object

object ContentProperty {
  @scala.inline
  def none: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  def normal: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply(value: ContentList): ContentProperty = value.asInstanceOf[ContentProperty]
  @scala.inline
  implicit def apply(value: Globals): ContentProperty = value.asInstanceOf[ContentProperty]
  @scala.inline
  implicit def apply(value: String): ContentProperty = value.asInstanceOf[ContentProperty]
}

