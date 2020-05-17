package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDectect extends js.Object {
  var autoDectect: Boolean = js.native
  var buttons: js.Array[_] = js.native
  var show: Boolean = js.native
  var title: String = js.native
  var `type`: String = js.native
}

object AutoDectect {
  @scala.inline
  def apply(autoDectect: Boolean, buttons: js.Array[_], show: Boolean, title: String, `type`: String): AutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDectect]
  }
  @scala.inline
  implicit class AutoDectectOps[Self <: AutoDectect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDectect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDectect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

