package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.csstypeStrings.normal
  - typingsSlinky.csstype.csstypeStrings.reset
  - java.lang.String
  - scala.Double
*/
trait ZoomProperty extends js.Object

object ZoomProperty {
  @scala.inline
  def normal: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  def reset: typingsSlinky.csstype.csstypeStrings.reset = "reset".asInstanceOf[typingsSlinky.csstype.csstypeStrings.reset]
  @scala.inline
  implicit def apply(value: Double): ZoomProperty = value.asInstanceOf[ZoomProperty]
  @scala.inline
  implicit def apply(value: Globals): ZoomProperty = value.asInstanceOf[ZoomProperty]
  @scala.inline
  implicit def apply(value: String): ZoomProperty = value.asInstanceOf[ZoomProperty]
}

