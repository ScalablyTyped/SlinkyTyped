package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompatibleFields extends js.Object {
  /** Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[CrossDimensionReachReportCompatibleFields] = js.native
  /** Contains items that are compatible to be selected for a report of type "FLOODLIGHT". */
  var floodlightReportCompatibleFields: js.UndefOr[FloodlightReportCompatibleFields] = js.native
  /** The kind of resource this is, in this case dfareporting#compatibleFields. */
  var kind: js.UndefOr[String] = js.native
  /** Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionReportCompatibleFields: js.UndefOr[PathToConversionReportCompatibleFields] = js.native
  /** Contains items that are compatible to be selected for a report of type "REACH". */
  var reachReportCompatibleFields: js.UndefOr[ReachReportCompatibleFields] = js.native
  /** Contains items that are compatible to be selected for a report of type "STANDARD". */
  var reportCompatibleFields: js.UndefOr[ReportCompatibleFields] = js.native
}

object CompatibleFields {
  @scala.inline
  def apply(): CompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleFields]
  }
  @scala.inline
  implicit class CompatibleFieldsOps[Self <: CompatibleFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossDimensionReachReportCompatibleFields(value: CrossDimensionReachReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDimensionReachReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossDimensionReachReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDimensionReachReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightReportCompatibleFields(value: FloodlightReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightReportCompatibleFields")(js.undefined)
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
    def withPathToConversionReportCompatibleFields(value: PathToConversionReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConversionReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathToConversionReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConversionReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withReachReportCompatibleFields(value: ReachReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withReportCompatibleFields(value: ReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompatibleFields")(js.undefined)
        ret
    }
  }
  
}

