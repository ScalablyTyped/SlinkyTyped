package typingsSlinky.nivoLine.anon

import typingsSlinky.nivoLine.mod.LineComputedSerieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Y
  var position: X
  var serie: LineComputedSerieData
}

object Data {
  @scala.inline
  def apply(data: Y, position: X, serie: LineComputedSerieData): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], serie = serie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

