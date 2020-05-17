package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionColor extends js.Object {
  var actionColor: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object ActionColor {
  @scala.inline
  def apply(): ActionColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionColor]
  }
  @scala.inline
  implicit class ActionColorOps[Self <: ActionColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

