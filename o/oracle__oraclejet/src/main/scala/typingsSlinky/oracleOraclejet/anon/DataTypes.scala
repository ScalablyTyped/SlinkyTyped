package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypes extends js.Object {
  var dataTypes: String | js.Array[String]
  def drag(param0: org.scalajs.dom.raw.Event): Unit
  def dragEnd(param0: org.scalajs.dom.raw.Event): Unit
  def dragStart(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit
}

object DataTypes {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: org.scalajs.dom.raw.Event => Unit,
    dragEnd: org.scalajs.dom.raw.Event => Unit,
    dragStart: (org.scalajs.dom.raw.Event, js.Object) => Unit
  ): DataTypes = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart))
    __obj.asInstanceOf[DataTypes]
  }
}

