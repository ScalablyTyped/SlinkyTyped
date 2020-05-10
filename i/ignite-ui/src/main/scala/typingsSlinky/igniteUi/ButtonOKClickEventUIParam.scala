package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOKClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the igGridModalDialog element.
  	 */
  var modalDialog: js.UndefOr[String] = js.native
  /**
  	 * Gets the reference to the igGridModalDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ButtonOKClickEventUIParam {
  @scala.inline
  def apply(): ButtonOKClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOKClickEventUIParam]
  }
  @scala.inline
  implicit class ButtonOKClickEventUIParamOps[Self <: ButtonOKClickEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModalDialog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalDialog")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

