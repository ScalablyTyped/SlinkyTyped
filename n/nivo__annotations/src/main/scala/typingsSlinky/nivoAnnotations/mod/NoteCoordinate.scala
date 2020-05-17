package typingsSlinky.nivoAnnotations.mod

import typingsSlinky.nivoAnnotations.anon.Abs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.nivoAnnotations.anon.Abs
*/
trait NoteCoordinate extends js.Object

object NoteCoordinate {
  @scala.inline
  implicit def apply(value: Abs): NoteCoordinate = value.asInstanceOf[NoteCoordinate]
  @scala.inline
  implicit def apply(value: Double): NoteCoordinate = value.asInstanceOf[NoteCoordinate]
}

