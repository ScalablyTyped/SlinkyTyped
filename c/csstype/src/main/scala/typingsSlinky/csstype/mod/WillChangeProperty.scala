package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.AnimateableFeature
  - typingsSlinky.csstype.csstypeStrings.auto
  - java.lang.String
*/
trait WillChangeProperty extends js.Object

object WillChangeProperty {
  @scala.inline
  def auto: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply(value: AnimateableFeature): WillChangeProperty = value.asInstanceOf[WillChangeProperty]
  @scala.inline
  implicit def apply(value: Globals): WillChangeProperty = value.asInstanceOf[WillChangeProperty]
  @scala.inline
  implicit def apply(value: String): WillChangeProperty = value.asInstanceOf[WillChangeProperty]
}

