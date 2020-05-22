package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragLeave extends js.Object {
  var dataTypes: String | js.Array[String]
  var selector: String
  def dragEnter(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit
  def dragLeave(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit
  def dragOver(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit
  def drop(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit
}

object DragLeave {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    dragLeave: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    dragOver: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    drop: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    selector: String
  ): DragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragLeave]
  }
}

