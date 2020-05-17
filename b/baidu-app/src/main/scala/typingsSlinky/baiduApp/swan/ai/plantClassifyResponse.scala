package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.anon.Score
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait plantClassifyResponse extends js.Object {
  var log_id: Double = js.native
   // 	唯一的log id，用于问题定位。
  var result: js.Array[Score] = js.native
}

object plantClassifyResponse {
  @scala.inline
  def apply(log_id: Double, result: js.Array[Score]): plantClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[plantClassifyResponse]
  }
  @scala.inline
  implicit class plantClassifyResponseOps[Self <: plantClassifyResponse] (val x: Self) extends AnyVal {
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
    def withResult(value: js.Array[Score]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

