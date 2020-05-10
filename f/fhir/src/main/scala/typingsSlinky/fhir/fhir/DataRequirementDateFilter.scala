package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What dates/date ranges are expected
  */
@js.native
trait DataRequirementDateFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.native
  /**
    * The date-valued attribute of the filter
    */
  var path: String = js.native
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDateTime: js.UndefOr[dateTime] = js.native
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDuration: js.UndefOr[Duration] = js.native
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valuePeriod: js.UndefOr[Period] = js.native
}

object DataRequirementDateFilter {
  @scala.inline
  def apply(path: String): DataRequirementDateFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementDateFilter]
  }
  @scala.inline
  implicit class DataRequirementDateFilterOps[Self <: DataRequirementDateFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_path(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(js.undefined)
        ret
    }
    @scala.inline
    def with_valueDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_valueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_valueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePeriod")(js.undefined)
        ret
    }
  }
  
}

