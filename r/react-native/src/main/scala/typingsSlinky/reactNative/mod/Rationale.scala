package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rationale extends js.Object {
  var buttonNegative: js.UndefOr[String] = js.native
  var buttonNeutral: js.UndefOr[String] = js.native
  var buttonPositive: String = js.native
  var message: String = js.native
  var title: String = js.native
}

object Rationale {
  @scala.inline
  def apply(buttonPositive: String, message: String, title: String): Rationale = {
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rationale]
  }
  @scala.inline
  implicit class RationaleOps[Self <: Rationale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonPositive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPositive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonNegative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNegative")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonNeutral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNeutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonNeutral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNeutral")(js.undefined)
        ret
    }
  }
  
}

