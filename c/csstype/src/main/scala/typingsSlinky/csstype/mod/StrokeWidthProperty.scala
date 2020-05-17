package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - java.lang.String
*/
trait StrokeWidthProperty[TLength] extends js.Object

object StrokeWidthProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): StrokeWidthProperty[TLength] = value.asInstanceOf[StrokeWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): StrokeWidthProperty[TLength] = value.asInstanceOf[StrokeWidthProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): StrokeWidthProperty[TLength] = value.asInstanceOf[StrokeWidthProperty[TLength]]
}

