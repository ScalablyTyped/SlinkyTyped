package typingsSlinky.gulpHtmlReplace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedTask extends js.Object {
  var src: String | js.Array[String] = js.native
  var tpl: String = js.native
}

object AdvancedTask {
  @scala.inline
  def apply(src: String | js.Array[String], tpl: String): AdvancedTask = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], tpl = tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedTask]
  }
  @scala.inline
  implicit class AdvancedTaskOps[Self <: AdvancedTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTpl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

