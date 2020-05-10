package typingsSlinky.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportingMetadataEntry extends js.Object {
  var compatibleDimensions: js.UndefOr[js.Array[String]] = js.native
  var compatibleMetrics: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var requiredDimensions: js.UndefOr[js.Array[String]] = js.native
  var requiredMetrics: js.UndefOr[js.Array[String]] = js.native
  var supportedProducts: js.UndefOr[js.Array[String]] = js.native
}

object ReportingMetadataEntry {
  @scala.inline
  def apply(): ReportingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingMetadataEntry]
  }
  @scala.inline
  implicit class ReportingMetadataEntryOps[Self <: ReportingMetadataEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleDimensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatibleMetrics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibleMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredDimensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredMetrics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedProducts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedProducts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedProducts")(js.undefined)
        ret
    }
  }
  
}

