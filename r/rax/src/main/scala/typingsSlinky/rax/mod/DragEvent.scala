package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent[T]
  extends MouseEvent[T, org.scalajs.dom.raw.DragEvent] {
  var dataTransfer: DataTransfer = js.native
}

