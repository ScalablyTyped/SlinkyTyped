package typingsSlinky.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactSketchapp.reactSketchappStrings.normal
  - typingsSlinky.reactSketchapp.reactSketchappStrings.italic
  - typingsSlinky.reactSketchapp.reactSketchappStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typingsSlinky.reactSketchapp.reactSketchappStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typingsSlinky.reactSketchapp.reactSketchappStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typingsSlinky.reactSketchapp.reactSketchappStrings.oblique = this.cast("oblique")
}

