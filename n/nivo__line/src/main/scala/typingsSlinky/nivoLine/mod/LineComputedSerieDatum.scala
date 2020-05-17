package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoLine.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineComputedSerieDatum extends js.Object {
  var data: LineDatum = js.native
  var position: X = js.native
}

object LineComputedSerieDatum {
  @scala.inline
  def apply(data: LineDatum, position: X): LineComputedSerieDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineComputedSerieDatum]
  }
  @scala.inline
  implicit class LineComputedSerieDatumOps[Self <: LineComputedSerieDatum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: LineDatum): Self = {
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
  }
  
}

