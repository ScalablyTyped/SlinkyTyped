package typingsSlinky.baiduApp.swan.ai

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.baiduApp.AnonWords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ocrVehicleLicenseResponse extends js.Object {
  var log_id: String = js.native
   // 识别结果数，表示 words_result 的元素个数。
  var words_result: StringDictionary[AnonWords] = js.native
   // 唯一的log id，用于问题定位。
  var words_result_num: Double = js.native
}

object ocrVehicleLicenseResponse {
  @scala.inline
  def apply(log_id: String, words_result: StringDictionary[AnonWords], words_result_num: Double): ocrVehicleLicenseResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], words_result = words_result.asInstanceOf[js.Any], words_result_num = words_result_num.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrVehicleLicenseResponse]
  }
  @scala.inline
  implicit class ocrVehicleLicenseResponseOps[Self <: ocrVehicleLicenseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords_result(value: StringDictionary[AnonWords]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords_result_num(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words_result_num")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

