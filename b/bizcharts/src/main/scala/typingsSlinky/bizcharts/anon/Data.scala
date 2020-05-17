package typingsSlinky.bizcharts.anon

import typingsSlinky.antvG2.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.Any = js.native
  var geom: js.Any = js.native
  var preData: js.Any = js.native
  var preShape: Shape = js.native
  var shape: Shape = js.native
}

object Data {
  @scala.inline
  def apply(data: js.Any, geom: js.Any, preData: js.Any, preShape: Shape, shape: Shape): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geom = geom.asInstanceOf[js.Any], preData = preData.asInstanceOf[js.Any], preShape = preShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

