package typingsSlinky.amapJsApiMap3d.AMap.Object3D.Prism

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var color: String | (js.Array[js.Array[Double] | Double | String]) = js.native
  var color2: js.UndefOr[String | (js.Array[js.Array[Double] | Double | String])] = js.native
  var height: js.UndefOr[Double] = js.native
  var path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel] = js.native
}

object Options {
  @scala.inline
  def apply(
    color: String | (js.Array[js.Array[Double] | Double | String]),
    path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]
  ): Options = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String | (js.Array[js.Array[Double] | Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor2(value: String | (js.Array[js.Array[Double] | Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
  }
  
}

