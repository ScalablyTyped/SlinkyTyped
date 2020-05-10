package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setSubTapp()
@js.native
trait SubTappConfig extends js.Object {
  var boldText: js.UndefOr[Boolean] = js.native
  var buttonName: String = js.native
  var callbackURL: js.UndefOr[js.Function1[/* result */ js.Any, _]] = js.native
  var color: String = js.native
  var colorText: js.UndefOr[String] = js.native
  var icon: String = js.native
  var isExclusiveView: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var replaceParent: js.UndefOr[Boolean] = js.native
  var sortID: Double = js.native
  var tappID: Double = js.native
  var url: String = js.native
}

object SubTappConfig {
  @scala.inline
  def apply(
    buttonName: String,
    color: String,
    icon: String,
    name: String,
    sortID: Double,
    tappID: Double,
    url: String
  ): SubTappConfig = {
    val __obj = js.Dynamic.literal(buttonName = buttonName.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sortID = sortID.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubTappConfig]
  }
  @scala.inline
  implicit class SubTappConfigOps[Self <: SubTappConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTappID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoldText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoldText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldText")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackURL(value: /* result */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallbackURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackURL")(js.undefined)
        ret
    }
    @scala.inline
    def withColorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExclusiveView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExclusiveView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExclusiveView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExclusiveView")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceParent")(js.undefined)
        ret
    }
  }
  
}

