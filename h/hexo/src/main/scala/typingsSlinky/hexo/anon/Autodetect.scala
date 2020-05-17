package typingsSlinky.hexo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autodetect extends js.Object {
  val auto_detect: Boolean = js.native
  val enable: Boolean = js.native
  val line_number: Boolean = js.native
  val tab_replace: String | Null = js.native
}

object Autodetect {
  @scala.inline
  def apply(auto_detect: Boolean, enable: Boolean, line_number: Boolean): Autodetect = {
    val __obj = js.Dynamic.literal(auto_detect = auto_detect.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], line_number = line_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autodetect]
  }
  @scala.inline
  implicit class AutodetectOps[Self <: Autodetect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_detect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_detect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine_number(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab_replace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab_replaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab_replace")(null)
        ret
    }
  }
  
}

