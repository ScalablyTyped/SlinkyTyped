package typingsSlinky.amapJsApi.AMap.Ellipse

import typingsSlinky.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.amapJsApi.ReferOverlayOptions because Already inherited */ @js.native
trait Options[ExtraData]
  extends typingsSlinky.amapJsApi.AMap.Polygon.Options[ExtraData] {
  /**
    * 椭圆的中心
    */
  var center: js.UndefOr[LocationValue] = js.native
  /**
    * 椭圆半径
    */
  var radius: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  @scala.inline
  implicit class OptionsOps[Self[extradata] <: Options[extradata], ExtraData] (val x: Self[ExtraData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ExtraData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ExtraData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ExtraData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ExtraData] with Other]
    @scala.inline
    def withCenter(value: LocationValue): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: js.Tuple2[Double, Double]): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
  }
  
}

