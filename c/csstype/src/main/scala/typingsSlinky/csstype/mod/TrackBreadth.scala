package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - typingsSlinky.csstype.csstypeStrings.`max-content`
  - typingsSlinky.csstype.csstypeStrings.`min-content`
  - java.lang.String
*/
trait TrackBreadth[TLength]
  extends GridAutoColumnsProperty[TLength]
     with GridAutoRowsProperty[TLength]
     with GridTemplateColumnsProperty[TLength]
     with GridTemplateRowsProperty[TLength]

object TrackBreadth {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  def `max-content`[TLength]: typingsSlinky.csstype.csstypeStrings.`max-content` = "max-content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`max-content`]
  @scala.inline
  def `min-content`[TLength]: typingsSlinky.csstype.csstypeStrings.`min-content` = "min-content".asInstanceOf[typingsSlinky.csstype.csstypeStrings.`min-content`]
  @scala.inline
  implicit def apply[TLength](value: String): TrackBreadth[TLength] = value.asInstanceOf[TrackBreadth[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): TrackBreadth[TLength] = value.asInstanceOf[TrackBreadth[TLength]]
}

