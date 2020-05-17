package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.FontWeightAbsolute
  - typingsSlinky.csstype.csstypeStrings.bolder
  - typingsSlinky.csstype.csstypeStrings.lighter
*/
trait FontWeightProperty extends js.Object

object FontWeightProperty {
  @scala.inline
  def bolder: typingsSlinky.csstype.csstypeStrings.bolder = "bolder".asInstanceOf[typingsSlinky.csstype.csstypeStrings.bolder]
  @scala.inline
  def lighter: typingsSlinky.csstype.csstypeStrings.lighter = "lighter".asInstanceOf[typingsSlinky.csstype.csstypeStrings.lighter]
  @scala.inline
  implicit def apply(value: FontWeightAbsolute): FontWeightProperty = value.asInstanceOf[FontWeightProperty]
  @scala.inline
  implicit def apply(value: Globals): FontWeightProperty = value.asInstanceOf[FontWeightProperty]
}

