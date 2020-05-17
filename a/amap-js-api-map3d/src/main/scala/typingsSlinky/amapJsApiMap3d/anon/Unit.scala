package typingsSlinky.amapJsApiMap3d.anon

import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unit extends js.Object {
  var path: js.Array[Pixel | (js.Tuple2[Double, Double])] = js.native
  var unit: px = js.native
}

object Unit {
  @scala.inline
  def apply(path: js.Array[Pixel | (js.Tuple2[Double, Double])], unit: px): Unit = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
  @scala.inline
  implicit class UnitOps[Self <: Unit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: js.Array[Pixel | (js.Tuple2[Double, Double])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: px): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

