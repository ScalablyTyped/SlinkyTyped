package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of measurements taken by a device
  */
@js.native
trait SampledData extends Element {
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'dimensions'.
    */
  var _dimensions: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lowerLimit'.
    */
  var _lowerLimit: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'upperLimit'.
    */
  var _upperLimit: js.UndefOr[Element] = js.native
  /**
    * Decimal values with spaces, or "E" | "U" | "L"
    */
  var data: String = js.native
  /**
    * Number of sample points at each time point
    */
  var dimensions: positiveInt = js.native
  /**
    * Multiply data by this before adding to origin
    */
  var factor: js.UndefOr[decimal] = js.native
  /**
    * Lower limit of detection
    */
  var lowerLimit: js.UndefOr[decimal] = js.native
  /**
    * Zero value and units
    */
  var origin: Quantity = js.native
  /**
    * Number of milliseconds between samples
    */
  var period: decimal = js.native
  /**
    * Upper limit of detection
    */
  var upperLimit: js.UndefOr[decimal] = js.native
}

object SampledData {
  @scala.inline
  def apply(data: String, dimensions: positiveInt, origin: Quantity, period: decimal): SampledData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledData]
  }
  @scala.inline
  implicit class SampledDataOps[Self <: SampledData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_data(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_data")(js.undefined)
        ret
    }
    @scala.inline
    def with_dimensions(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def with_factor(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_factor")(js.undefined)
        ret
    }
    @scala.inline
    def with_lowerLimit(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lowerLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lowerLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lowerLimit")(js.undefined)
        ret
    }
    @scala.inline
    def with_period(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_period: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_period")(js.undefined)
        ret
    }
    @scala.inline
    def with_upperLimit(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_upperLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_upperLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_upperLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerLimit(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperLimit(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLimit")(js.undefined)
        ret
    }
  }
  
}

