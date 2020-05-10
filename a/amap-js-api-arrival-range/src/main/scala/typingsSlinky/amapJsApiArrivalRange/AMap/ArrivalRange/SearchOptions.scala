package typingsSlinky.amapJsApiArrivalRange.AMap.ArrivalRange

import typingsSlinky.amapJsApi.AMap.LocationValue
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.coverage
import typingsSlinky.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
   // useless
  /**
    * 选择一个想到达的目的地坐标，最多支持5个目的地坐标
    */
  var destination: js.UndefOr[LocationValue | js.Array[LocationValue]] = js.native
  /**
    * 公交出行策略,可选为：地铁：SUBWAY， 公交：BUS，多策略使用逗号分隔
    */
  var policy: js.UndefOr[String] = js.native
   // 'BUS' | 'SUBWAY' | 'BUS,SUBWAY' | 'SUBWAY,BUS';
  /**
    * 结果返回样式：polygon：返回多边形边界值，coverage：判断设定的终点坐标是否在到达圈范围内
    */
  var resultType: js.UndefOr[polygon | coverage] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: LocationValue | js.Array[LocationValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withResultType(value: polygon | coverage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultType")(js.undefined)
        ret
    }
  }
  
}

