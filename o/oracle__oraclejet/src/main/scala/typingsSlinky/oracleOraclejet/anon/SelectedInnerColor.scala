package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedInnerColor extends js.Object {
  var borderColor: js.UndefOr[String] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var selectedInnerColor: js.UndefOr[String] = js.native
  var selectedOuterColor: js.UndefOr[String] = js.native
}

object SelectedInnerColor {
  @scala.inline
  def apply(): SelectedInnerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedInnerColor]
  }
  @scala.inline
  implicit class SelectedInnerColorOps[Self <: SelectedInnerColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedInnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedInnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedInnerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedInnerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOuterColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOuterColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOuterColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOuterColor")(js.undefined)
        ret
    }
  }
  
}

