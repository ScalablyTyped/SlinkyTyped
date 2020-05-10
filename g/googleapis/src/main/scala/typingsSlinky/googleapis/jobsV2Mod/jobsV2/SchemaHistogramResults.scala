package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Histogram results that matches HistogramFacets specified in
  * SearchJobsRequest.
  */
@js.native
trait SchemaHistogramResults extends js.Object {
  /**
    * Specifies compensation field-based histogram results that matches
    * HistogramFacets.compensation_histogram_requests.
    */
  var compensationHistogramResults: js.UndefOr[js.Array[SchemaCompensationHistogramResult]] = js.native
  /**
    * Specifies histogram results for custom attributes that matches
    * HistogramFacets.custom_attribute_histogram_facets.
    */
  var customAttributeHistogramResults: js.UndefOr[js.Array[SchemaCustomAttributeHistogramResult]] = js.native
  /**
    * Specifies histogram results that matches
    * HistogramFacets.simple_histogram_facets.
    */
  var simpleHistogramResults: js.UndefOr[js.Array[SchemaHistogramResult]] = js.native
}

object SchemaHistogramResults {
  @scala.inline
  def apply(): SchemaHistogramResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResults]
  }
  @scala.inline
  implicit class SchemaHistogramResultsOps[Self <: SchemaHistogramResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompensationHistogramResults(value: js.Array[SchemaCompensationHistogramResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationHistogramResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompensationHistogramResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationHistogramResults")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributeHistogramResults(value: js.Array[SchemaCustomAttributeHistogramResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributeHistogramResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributeHistogramResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributeHistogramResults")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleHistogramResults(value: js.Array[SchemaHistogramResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleHistogramResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleHistogramResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleHistogramResults")(js.undefined)
        ret
    }
  }
  
}

