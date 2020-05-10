package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measurement, calculation or setting capability of a medical device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceMetric extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'color'.
    */
  var _color: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'operationalStatus'.
    */
  var _operationalStatus: js.UndefOr[Element] = js.native
  /**
    * Describes the calibrations that have been performed or that are required to be performed
    */
  var calibration: js.UndefOr[js.Array[DeviceMetricCalibration]] = js.native
  /**
    * measurement | setting | calculation | unspecified
    */
  var category: code = js.native
  /**
    * black | red | green | yellow | blue | magenta | cyan | white
    */
  var color: js.UndefOr[code] = js.native
  /**
    * Unique identifier of this DeviceMetric
    */
  var identifier: Identifier = js.native
  /**
    * Describes the measurement repetition time
    */
  var measurementPeriod: js.UndefOr[Timing] = js.native
  /**
    * on | off | standby | entered-in-error
    */
  var operationalStatus: js.UndefOr[code] = js.native
  /**
    * Describes the link to the parent DeviceComponent
    */
  var parent: js.UndefOr[Reference] = js.native
  /**
    * Describes the link to the source Device
    */
  var source: js.UndefOr[Reference] = js.native
  /**
    * Identity of metric, for example Heart Rate or PEEP Setting
    */
  var `type`: CodeableConcept = js.native
  /**
    * Unit of Measure for the Metric
    */
  var unit: js.UndefOr[CodeableConcept] = js.native
}

object DeviceMetric {
  @scala.inline
  def apply(category: code, identifier: Identifier, `type`: CodeableConcept): DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetric]
  }
  @scala.inline
  implicit class DeviceMetricOps[Self <: DeviceMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_category(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_category")(js.undefined)
        ret
    }
    @scala.inline
    def with_color(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_color")(js.undefined)
        ret
    }
    @scala.inline
    def with_operationalStatus(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_operationalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_operationalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_operationalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCalibration(value: js.Array[DeviceMetricCalibration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calibration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalibration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calibration")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurementPeriod(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationalStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

