package typingsSlinky.knuddelsUserappsApi

import typingsSlinky.knuddelsUserappsApi.mod._Global_.KnuddelTransferDisplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayReasonText extends js.Object {
  var displayReasonText: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  var transferDisplayType: js.UndefOr[KnuddelTransferDisplayType] = js.native
}

object AnonDisplayReasonText {
  @scala.inline
  def apply(): AnonDisplayReasonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisplayReasonText]
  }
  @scala.inline
  implicit class AnonDisplayReasonTextOps[Self <: AnonDisplayReasonText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayReasonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayReasonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayReasonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayReasonText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferDisplayType(value: KnuddelTransferDisplayType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferDisplayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferDisplayType")(js.undefined)
        ret
    }
  }
  
}

