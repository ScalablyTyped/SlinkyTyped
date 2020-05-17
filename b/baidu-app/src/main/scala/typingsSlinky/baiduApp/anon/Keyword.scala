package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyword extends js.Object {
  // 标签结果数组
  var keyword: String = js.native
   // 置信度，0-1
  var root: String = js.native
   // 图片中的物体或场景名称
  var score: Double = js.native
}

object Keyword {
  @scala.inline
  def apply(keyword: String, root: String, score: Double): Keyword = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  @scala.inline
  implicit class KeywordOps[Self <: Keyword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

