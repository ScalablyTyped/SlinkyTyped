package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.baiduAppStrings.gcj02
import typingsSlinky.baiduApp.baiduAppStrings.wgs84
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  var altitude: js.UndefOr[Boolean] = js.native
   // 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  var success_GetLocationOptions: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.native
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于swan.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.native
}

object GetLocationOptions {
  @scala.inline
  def apply(): GetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationOptions]
  }
  @scala.inline
  implicit class GetLocationOptionsOps[Self <: GetLocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ LocationData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: wgs84 | gcj02): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

