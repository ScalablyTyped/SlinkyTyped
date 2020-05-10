package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathToConversionReportCompatibleFields extends js.Object {
  /** Conversion dimensions which are compatible to be selected in the "conversionDimensions" section of the report. */
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.native
  /** Custom floodlight variables which are compatible to be selected in the "customFloodlightVariables" section of the report. */
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.native
  /** The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  /** Per-interaction dimensions which are compatible to be selected in the "perInteractionDimensions" section of the report. */
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.native
}

object PathToConversionReportCompatibleFields {
  @scala.inline
  def apply(): PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathToConversionReportCompatibleFields]
  }
  @scala.inline
  implicit class PathToConversionReportCompatibleFieldsOps[Self <: PathToConversionReportCompatibleFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversionDimensions(value: js.Array[Dimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFloodlightVariables(value: js.Array[Dimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFloodlightVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFloodlightVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFloodlightVariables")(js.undefined)
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
    def withMetrics(value: js.Array[Metric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withPerInteractionDimensions(value: js.Array[Dimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perInteractionDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerInteractionDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perInteractionDimensions")(js.undefined)
        ret
    }
  }
  
}

