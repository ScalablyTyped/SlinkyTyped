package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.AnonHeight
import typingsSlinky.baiduApp.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait carClassifyResponse extends js.Object {
  var location_result: AnonHeight = js.native
  var log_id: Double = js.native
   // 	唯一的log id，用于问题定位。
  var result: js.Array[AnonName] = js.native
}

object carClassifyResponse {
  @scala.inline
  def apply(location_result: AnonHeight, log_id: Double, result: js.Array[AnonName]): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyResponse]
  }
  @scala.inline
  implicit class carClassifyResponseOps[Self <: carClassifyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation_result(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

