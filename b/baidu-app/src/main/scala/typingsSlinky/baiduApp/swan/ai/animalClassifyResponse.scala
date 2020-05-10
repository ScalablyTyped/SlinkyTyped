package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.AnonScore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait animalClassifyResponse extends js.Object {
  var log_id: Double = js.native
   // 识别结果数，标识返回结果数目。
  var result: js.Array[AnonScore] = js.native
   // 	唯一的log id，用于问题定位。
  var result_num: Double = js.native
}

object animalClassifyResponse {
  @scala.inline
  def apply(log_id: Double, result: js.Array[AnonScore], result_num: Double): animalClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], result_num = result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[animalClassifyResponse]
  }
  @scala.inline
  implicit class animalClassifyResponseOps[Self <: animalClassifyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Array[AnonScore]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult_num(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_num")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

