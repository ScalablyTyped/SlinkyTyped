package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pass extends js.Object {
   // 待人工复审的类别列表与详情
  var pass: js.Array[Hit] = js.native
   // 请求中是否包含违禁，0表示非违禁，1表示违禁，2表示建议人工复审 。
  var reject: js.Array[_] = js.native
   // 审核未通过的类别列表与详情
  var review: js.Array[_] = js.native
  // 审核结果详情
  var spam: Double = js.native
}

object Pass {
  @scala.inline
  def apply(pass: js.Array[Hit], reject: js.Array[_], review: js.Array[_], spam: Double): Pass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
  @scala.inline
  implicit class PassOps[Self <: Pass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPass(value: js.Array[Hit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReject(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReview(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("review")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpam(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

