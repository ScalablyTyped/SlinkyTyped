package typingsSlinky.amapJsApiMap3d.anon

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiMap3d.amapJsApiMap3dStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var path: js.Array[LngLat | (js.Tuple2[Double, Double])] = js.native
  var unit: js.UndefOr[meter] = js.native
}

object Path {
  @scala.inline
  def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])]): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: js.Array[LngLat | (js.Tuple2[Double, Double])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnit(value: meter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

