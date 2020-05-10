package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatIntelIndicator extends js.Object {
  /**
    * The category of a threat intelligence indicator.
    */
  var Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.native
  /**
    * The date and time when the most recent instance of a threat intelligence indicator was observed.
    */
  var LastObservedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source of the threat intelligence indicator.
    */
  var Source: js.UndefOr[NonEmptyString] = js.native
  /**
    * The URL to the page or site where you can get more information about the threat intelligence indicator.
    */
  var SourceUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of threat intelligence indicator.
    */
  var Type: js.UndefOr[ThreatIntelIndicatorType] = js.native
  /**
    * The value of a threat intelligence indicator.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object ThreatIntelIndicator {
  @scala.inline
  def apply(): ThreatIntelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatIntelIndicator]
  }
  @scala.inline
  implicit class ThreatIntelIndicatorOps[Self <: ThreatIntelIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: ThreatIntelIndicatorCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(js.undefined)
        ret
    }
    @scala.inline
    def withLastObservedAt(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastObservedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastObservedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastObservedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUrl(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ThreatIntelIndicatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

