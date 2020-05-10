package typingsSlinky.officeUiFabricReact.messageBarBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBarState extends js.Object {
  var expandSingleLine: js.UndefOr[Boolean] = js.native
  var labelId: js.UndefOr[String] = js.native
  var showContent: js.UndefOr[Boolean] = js.native
}

object IMessageBarState {
  @scala.inline
  def apply(): IMessageBarState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBarState]
  }
  @scala.inline
  implicit class IMessageBarStateOps[Self <: IMessageBarState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandSingleLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSingleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandSingleLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSingleLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(js.undefined)
        ret
    }
  }
  
}

