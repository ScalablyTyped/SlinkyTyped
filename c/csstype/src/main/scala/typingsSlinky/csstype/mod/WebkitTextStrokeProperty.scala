package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Color
  - TLength
  - java.lang.String
*/
trait WebkitTextStrokeProperty[TLength] extends js.Object

object WebkitTextStrokeProperty {
  @scala.inline
  implicit def apply[TLength](value: Color): WebkitTextStrokeProperty[TLength] = value.asInstanceOf[WebkitTextStrokeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): WebkitTextStrokeProperty[TLength] = value.asInstanceOf[WebkitTextStrokeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): WebkitTextStrokeProperty[TLength] = value.asInstanceOf[WebkitTextStrokeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): WebkitTextStrokeProperty[TLength] = value.asInstanceOf[WebkitTextStrokeProperty[TLength]]
}

