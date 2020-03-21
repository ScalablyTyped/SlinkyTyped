package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mapboxGlStrings.visible
  - typingsSlinky.mapboxGl.mapboxGlStrings.none
*/
trait Visibility extends js.Object

object Visibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.mapboxGl.mapboxGlStrings.none = this.cast("none")
  @scala.inline
  def visible: typingsSlinky.mapboxGl.mapboxGlStrings.visible = this.cast("visible")
}

