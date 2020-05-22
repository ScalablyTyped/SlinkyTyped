package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoLine.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSliceData extends js.Object {
  var data: js.Array[Data]
  var id: LineValue
  var x: Double
}

object LineSliceData {
  @scala.inline
  def apply(data: js.Array[Data], id: LineValue, x: Double): LineSliceData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSliceData]
  }
}

