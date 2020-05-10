package typingsSlinky.aliApp

import typingsSlinky.aliApp.my.TextRiskIdentificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHitKeywords extends js.Object {
  /**
  				 * 仅当识别命中了 type 为 keyword 时，才会返回该字段
  				 */
  var hitKeywords: js.UndefOr[js.Array[String]] = js.native
  /**
  				 * 识别命中得分，最高分100分。仅当识别没有命中 keyword ，但入参中包含了广告或涉政或涉黄时，才会返回该字段
  				 */
  var score: js.UndefOr[String] = js.native
  /**
  				 * 目标内容文本识别到的类型，keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
  				 */
  var `type`: TextRiskIdentificationType = js.native
}

object AnonHitKeywords {
  @scala.inline
  def apply(`type`: TextRiskIdentificationType): AnonHitKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHitKeywords]
  }
  @scala.inline
  implicit class AnonHitKeywordsOps[Self <: AnonHitKeywords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: TextRiskIdentificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
  }
  
}

