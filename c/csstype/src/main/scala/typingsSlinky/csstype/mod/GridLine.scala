package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.auto
  - java.lang.String
  - scala.Double
*/
trait GridLine
  extends GridAreaProperty
     with GridColumnEndProperty
     with GridColumnProperty
     with GridColumnStartProperty
     with GridRowEndProperty
     with GridRowProperty
     with GridRowStartProperty

object GridLine {
  @scala.inline
  def auto: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply(value: Double): GridLine = value.asInstanceOf[GridLine]
  @scala.inline
  implicit def apply(value: String): GridLine = value.asInstanceOf[GridLine]
}

