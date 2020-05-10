package typingsSlinky.baiduApp.swan.ai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait imageAuditResponse extends js.Object {
   // 请求唯一id
  var conclusion: String = js.native
   // 审核结果描述，成功才返回，失败不返回。
  var conclusionType: Double = js.native
   // 审核结果标识，成功才返回，失败不返回。
  var data: js.Array[imageAuditdata] = js.native
  var log_id: String = js.native
}

object imageAuditResponse {
  @scala.inline
  def apply(conclusion: String, conclusionType: Double, data: js.Array[imageAuditdata], log_id: String): imageAuditResponse = {
    val __obj = js.Dynamic.literal(conclusion = conclusion.asInstanceOf[js.Any], conclusionType = conclusionType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[imageAuditResponse]
  }
  @scala.inline
  implicit class imageAuditResponseOps[Self <: imageAuditResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConclusion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConclusionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conclusionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[imageAuditdata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

