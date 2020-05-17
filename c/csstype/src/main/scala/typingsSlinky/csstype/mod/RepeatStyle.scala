package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.`no-repeat`
  - typingsSlinky.csstype.csstypeStrings.repeat
  - typingsSlinky.csstype.csstypeStrings.`repeat-x`
  - typingsSlinky.csstype.csstypeStrings.`repeat-y`
  - typingsSlinky.csstype.csstypeStrings.round
  - typingsSlinky.csstype.csstypeStrings.space
  - java.lang.String
*/
trait RepeatStyle
  extends FinalBgLayer[js.Any]
     with BackgroundRepeatProperty
     with MaskLayer[js.Any]
     with MaskRepeatProperty
     with WebkitMaskProperty[js.Any]
     with WebkitMaskRepeatProperty

object RepeatStyle {
  @scala.inline
  def `no-repeat`: typingsSlinky.csstype.csstypeStrings.`no-repeat` = "no-repeat".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`no-repeat`]
  @scala.inline
  def repeat: typingsSlinky.csstype.csstypeStrings.repeat = "repeat".asInstanceOf[typingsSlinky.csstype.csstypeStrings.repeat]
  @scala.inline
  def `repeat-x`: typingsSlinky.csstype.csstypeStrings.`repeat-x` = "repeat-x".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`repeat-x`]
  @scala.inline
  def `repeat-y`: typingsSlinky.csstype.csstypeStrings.`repeat-y` = "repeat-y".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`repeat-y`]
  @scala.inline
  def round: typingsSlinky.csstype.csstypeStrings.round = "round".asInstanceOf[typingsSlinky.csstype.csstypeStrings.round]
  @scala.inline
  def space: typingsSlinky.csstype.csstypeStrings.space = "space".asInstanceOf[typingsSlinky.csstype.csstypeStrings.space]
  @scala.inline
  implicit def apply(value: String): RepeatStyle = value.asInstanceOf[RepeatStyle]
}

