package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.bold
  - typingsSlinky.csstype.csstypeStrings.normal
  - scala.Double
*/
trait FontWeightAbsolute
  extends FontFaceFontWeightProperty
     with FontWeightProperty

object FontWeightAbsolute {
  @scala.inline
  def bold: typingsSlinky.csstype.csstypeStrings.bold = "bold".asInstanceOf[typingsSlinky.csstype.csstypeStrings.bold]
  @scala.inline
  def normal: typingsSlinky.csstype.csstypeStrings.normal = "normal".asInstanceOf[typingsSlinky.csstype.csstypeStrings.normal]
  @scala.inline
  implicit def apply(value: Double): FontWeightAbsolute = value.asInstanceOf[FontWeightAbsolute]
}

