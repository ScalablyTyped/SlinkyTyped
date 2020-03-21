package typingsSlinky.nivoAnnotations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.circle
  - typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.dot
  - typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.rect
*/
trait AnnotationType extends js.Object

object AnnotationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.circle = this.cast("circle")
  @scala.inline
  def dot: typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.dot = this.cast("dot")
  @scala.inline
  def rect: typingsSlinky.nivoAnnotations.nivoAnnotationsStrings.rect = this.cast("rect")
}

