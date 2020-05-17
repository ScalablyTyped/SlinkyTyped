package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.baseline
  - typingsSlinky.csstype.csstypeStrings.sub
  - typingsSlinky.csstype.csstypeStrings.`super`
  - java.lang.String
*/
trait BaselineShiftProperty[TLength] extends js.Object

object BaselineShiftProperty {
  @scala.inline
  def baseline[TLength]: typingsSlinky.csstype.csstypeStrings.baseline = "baseline".asInstanceOf[typingsSlinky.csstype.csstypeStrings.baseline]
  @scala.inline
  def sub[TLength]: typingsSlinky.csstype.csstypeStrings.sub = "sub".asInstanceOf[typingsSlinky.csstype.csstypeStrings.sub]
  @scala.inline
  def `super`[TLength]: typingsSlinky.csstype.csstypeStrings.`super` = "super".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`super`]
  @scala.inline
  implicit def apply[TLength](value: Globals): BaselineShiftProperty[TLength] = value.asInstanceOf[BaselineShiftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BaselineShiftProperty[TLength] = value.asInstanceOf[BaselineShiftProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): BaselineShiftProperty[TLength] = value.asInstanceOf[BaselineShiftProperty[TLength]]
}

