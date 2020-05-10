package typingsSlinky.amapJsApi.AMap.Rectangle

import typingsSlinky.amapJsApi.AMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ExtraData]
  extends typingsSlinky.amapJsApi.AMap.Polygon.Options[ExtraData] {
  /**
    * 矩形的范围
    */
  var bounds: js.UndefOr[Bounds] = js.native
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
    def withBounds(value: Bounds): Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self[ExtraData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
  }
  
}

