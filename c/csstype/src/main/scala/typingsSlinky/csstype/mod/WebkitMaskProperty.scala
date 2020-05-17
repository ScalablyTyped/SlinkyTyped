package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Position[TLength]
  - typingsSlinky.csstype.mod.RepeatStyle
  - typingsSlinky.csstype.mod.Box
  - typingsSlinky.csstype.csstypeStrings.border
  - typingsSlinky.csstype.csstypeStrings.content
  - typingsSlinky.csstype.csstypeStrings.none
  - typingsSlinky.csstype.csstypeStrings.padding
  - typingsSlinky.csstype.csstypeStrings.text
  - java.lang.String
*/
trait WebkitMaskProperty[TLength] extends js.Object

object WebkitMaskProperty {
  @scala.inline
  def border[TLength]: typingsSlinky.csstype.csstypeStrings.border = "border".asInstanceOf[typingsSlinky.csstype.csstypeStrings.border]
  @scala.inline
  def content[TLength]: typingsSlinky.csstype.csstypeStrings.content = "content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.content]
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  def padding[TLength]: typingsSlinky.csstype.csstypeStrings.padding = "padding".asInstanceOf[typingsSlinky.csstype.csstypeStrings.padding]
  @scala.inline
  def text[TLength]: typingsSlinky.csstype.csstypeStrings.text = "text".asInstanceOf[typingsSlinky.csstype.csstypeStrings.text]
  @scala.inline
  implicit def apply[TLength](value: Box): WebkitMaskProperty[TLength] = value.asInstanceOf[WebkitMaskProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): WebkitMaskProperty[TLength] = value.asInstanceOf[WebkitMaskProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): WebkitMaskProperty[TLength] = value.asInstanceOf[WebkitMaskProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: RepeatStyle): WebkitMaskProperty[TLength] = value.asInstanceOf[WebkitMaskProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): WebkitMaskProperty[TLength] = value.asInstanceOf[WebkitMaskProperty[TLength]]
}

