package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - typingsSlinky.csstype.csstypeStrings.available
  - typingsSlinky.csstype.csstypeStrings.content
  - typingsSlinky.csstype.csstypeStrings.`fit-content`
  - typingsSlinky.csstype.csstypeStrings.`max-content`
  - typingsSlinky.csstype.csstypeStrings.`min-content`
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
  - scala.Double
*/
trait FlexProperty[TLength] extends js.Object

object FlexProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  def available[TLength]: typingsSlinky.csstype.csstypeStrings.available = "available".asInstanceOf[typingsSlinky.csstype.csstypeStrings.available]
  @scala.inline
  def content[TLength]: typingsSlinky.csstype.csstypeStrings.content = "content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.content]
  @scala.inline
  def `fit-content`[TLength]: typingsSlinky.csstype.csstypeStrings.`fit-content` = "fit-content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`fit-content`]
  @scala.inline
  def `max-content`[TLength]: typingsSlinky.csstype.csstypeStrings.`max-content` = "max-content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`max-content`]
  @scala.inline
  def `min-content`[TLength]: typingsSlinky.csstype.csstypeStrings.`min-content` = "min-content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`min-content`]
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Double): FlexProperty[TLength] = value.asInstanceOf[FlexProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): FlexProperty[TLength] = value.asInstanceOf[FlexProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): FlexProperty[TLength] = value.asInstanceOf[FlexProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): FlexProperty[TLength] = value.asInstanceOf[FlexProperty[TLength]]
}

