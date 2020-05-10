package typingsSlinky.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlobalMessageOptions extends js.Object {
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var horizontalSpacing: js.UndefOr[Double] = js.native
  var maxCount: js.UndefOr[Double] = js.native
  var onClose: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.native
  var positionX: js.UndefOr[XPosition] = js.native
  var positionY: js.UndefOr[YPosition] = js.native
  var replaceMessage: js.UndefOr[Boolean] = js.native
  var startRight: js.UndefOr[Double] = js.native
  var startTop: js.UndefOr[Double] = js.native
  var templateUrl: js.UndefOr[String] = js.native
  var verticalSpacing: js.UndefOr[Double] = js.native
}

object IGlobalMessageOptions {
  @scala.inline
  def apply(): IGlobalMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalMessageOptions]
  }
  @scala.inline
  implicit class IGlobalMessageOptionsOps[Self <: IGlobalMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* element */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionX(value: XPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionY(value: YPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRight")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTop")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSpacing")(js.undefined)
        ret
    }
  }
  
}

