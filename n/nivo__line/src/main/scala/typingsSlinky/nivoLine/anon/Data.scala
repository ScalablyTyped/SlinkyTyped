package typingsSlinky.nivoLine.anon

import typingsSlinky.nivoLine.mod.LineComputedSerieData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: Y = js.native
  var position: X = js.native
  var serie: LineComputedSerieData = js.native
}

object Data {
  @scala.inline
  def apply(data: Y, position: X, serie: LineComputedSerieData): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], serie = serie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerie(value: LineComputedSerieData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serie")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

