package typingsSlinky.reactNativeHuaweiProtectedApps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HuaweiProtectedAppsConfig extends js.Object {
  var doNotShowAgainText: String = js.native
  var negativeText: String = js.native
  var positiveText: String = js.native
  var text: String = js.native
  var title: String = js.native
}

object HuaweiProtectedAppsConfig {
  @scala.inline
  def apply(
    doNotShowAgainText: String,
    negativeText: String,
    positiveText: String,
    text: String,
    title: String
  ): HuaweiProtectedAppsConfig = {
    val __obj = js.Dynamic.literal(doNotShowAgainText = doNotShowAgainText.asInstanceOf[js.Any], negativeText = negativeText.asInstanceOf[js.Any], positiveText = positiveText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HuaweiProtectedAppsConfig]
  }
  @scala.inline
  implicit class HuaweiProtectedAppsConfigOps[Self <: HuaweiProtectedAppsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoNotShowAgainText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotShowAgainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositiveText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

