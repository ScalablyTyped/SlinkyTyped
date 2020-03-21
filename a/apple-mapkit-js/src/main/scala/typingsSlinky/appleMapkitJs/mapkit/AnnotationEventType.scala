package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.select
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.deselect
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.`drag-start`
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.dragging
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.`drag-end`
*/
trait AnnotationEventType extends js.Object

object AnnotationEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deselect: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.deselect = this.cast("deselect")
  @scala.inline
  def `drag-end`: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.`drag-end` = this.cast("drag-end")
  @scala.inline
  def `drag-start`: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.`drag-start` = this.cast("drag-start")
  @scala.inline
  def dragging: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.dragging = this.cast("dragging")
  @scala.inline
  def select: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.select = this.cast("select")
}

