package typingsSlinky.baiduApp.swan.ai

import typingsSlinky.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
		 * 自动化、智能化的文本审核。
		 */
@js.native
trait textReviewOptions
  extends BaseOptions[js.Any, js.Any] {
  var content: String = js.native
   // 待审核文本，UTF-8，不可为空，不超过20000字节。
  @JSName("success")
  var success_textReviewOptions: js.UndefOr[js.Function1[/* res */ textReviewResponse, Unit]] = js.native
}

object textReviewOptions {
  @scala.inline
  def apply(content: String): textReviewOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[textReviewOptions]
  }
  @scala.inline
  implicit class textReviewOptionsOps[Self <: textReviewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ textReviewResponse => Unit): Self = {
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
  }
  
}

