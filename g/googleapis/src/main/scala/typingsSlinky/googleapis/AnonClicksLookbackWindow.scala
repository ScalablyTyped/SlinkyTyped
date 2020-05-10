package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClicksLookbackWindow extends js.Object {
  var clicksLookbackWindow: js.UndefOr[Double] = js.native
  var impressionsLookbackWindow: js.UndefOr[Double] = js.native
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
  var maximumClickInteractions: js.UndefOr[Double] = js.native
  var maximumImpressionInteractions: js.UndefOr[Double] = js.native
  var maximumInteractionGap: js.UndefOr[Double] = js.native
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.native
}

object AnonClicksLookbackWindow {
  @scala.inline
  def apply(): AnonClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClicksLookbackWindow]
  }
  @scala.inline
  implicit class AnonClicksLookbackWindowOps[Self <: AnonClicksLookbackWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClicksLookbackWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicksLookbackWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClicksLookbackWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicksLookbackWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withImpressionsLookbackWindow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionsLookbackWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionsLookbackWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionsLookbackWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAttributedIPConversions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributedIPConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAttributedIPConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAttributedIPConversions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUnattributedCookieConversions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedCookieConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUnattributedCookieConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedCookieConversions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUnattributedIPConversions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedIPConversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUnattributedIPConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUnattributedIPConversions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumClickInteractions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumClickInteractions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumClickInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumClickInteractions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumImpressionInteractions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumImpressionInteractions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumImpressionInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumImpressionInteractions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumInteractionGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumInteractionGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumInteractionGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumInteractionGap")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotOnInteractionPath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotOnInteractionPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotOnInteractionPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotOnInteractionPath")(js.undefined)
        ret
    }
  }
  
}

