package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.TrackBreadth[TLength]
  - typingsSlinky.csstype.csstypeStrings.none
  - java.lang.String
*/
trait GridTemplateColumnsProperty[TLength] extends js.Object

object GridTemplateColumnsProperty {
  @scala.inline
  def none[TLength]: typingsSlinky.csstype.csstypeStrings.none = "none".asInstanceOf[typingsSlinky.csstype.csstypeStrings.none]
  @scala.inline
  implicit def apply[TLength](value: Globals): GridTemplateColumnsProperty[TLength] = value.asInstanceOf[GridTemplateColumnsProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): GridTemplateColumnsProperty[TLength] = value.asInstanceOf[GridTemplateColumnsProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TrackBreadth[TLength]): GridTemplateColumnsProperty[TLength] = value.asInstanceOf[GridTemplateColumnsProperty[TLength]]
}

