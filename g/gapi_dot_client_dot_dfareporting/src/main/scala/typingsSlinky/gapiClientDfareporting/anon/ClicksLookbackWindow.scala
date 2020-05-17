package typingsSlinky.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClicksLookbackWindow extends js.Object {
  /**
    * DFA checks to see if a click interaction occurred within the specified period of time before a conversion. By default the value is pulled from
    * Floodlight or you can manually enter a custom value. Valid values: 1-90.
    */
  var clicksLookbackWindow: js.UndefOr[Double] = js.native
  /**
    * DFA checks to see if an impression interaction occurred within the specified period of time before a conversion. By default the value is pulled from
    * Floodlight or you can manually enter a custom value. Valid values: 1-90.
    */
  var impressionsLookbackWindow: js.UndefOr[Double] = js.native
  /** Deprecated: has no effect. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser
    * within the Floodlight group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the
    * lookback window prior to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100
    * impressions). If another advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumClickInteractions: js.UndefOr[Double] = js.native
  /**
    * The maximum number of click interactions to include in the report. Advertisers currently paying for E2C reports get up to 200 (100 clicks, 100
    * impressions). If another advertiser in your network is paying for E2C, you can have up to 5 total exposures per report.
    */
  var maximumImpressionInteractions: js.UndefOr[Double] = js.native
  /** The maximum amount of time that can take place between interactions (clicks or impressions) by the same user. Valid values: 1-90. */
  var maximumInteractionGap: js.UndefOr[Double] = js.native
  /** Enable pivoting on interaction path. */
  var pivotOnInteractionPath: js.UndefOr[Boolean] = js.native
}

object ClicksLookbackWindow {
  @scala.inline
  def apply(): ClicksLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClicksLookbackWindow]
  }
  @scala.inline
  implicit class ClicksLookbackWindowOps[Self <: ClicksLookbackWindow] (val x: Self) extends AnyVal {
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

