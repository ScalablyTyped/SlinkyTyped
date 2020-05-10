package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Histogram facets to be specified in SearchJobsRequest.
  */
@js.native
trait SchemaHistogramFacets extends js.Object {
  /**
    * Optional.  Specifies compensation field-based histogram requests.
    * Duplicate values of CompensationHistogramRequest.type are not allowed.
    */
  var compensationHistogramFacets: js.UndefOr[js.Array[SchemaCompensationHistogramRequest]] = js.native
  /**
    * Optional.  Specifies the custom attributes histogram requests. Duplicate
    * values of CustomAttributeHistogramRequest.key are not allowed.
    */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[SchemaCustomAttributeHistogramRequest]] = js.native
  /**
    * Optional. Specifies the simple type of histogram facets, for example,
    * `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc. This field is equivalent to
    * GetHistogramRequest.
    */
  var simpleHistogramFacets: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHistogramFacets {
  @scala.inline
  def apply(): SchemaHistogramFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramFacets]
  }
  @scala.inline
  implicit class SchemaHistogramFacetsOps[Self <: SchemaHistogramFacets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompensationHistogramFacets(value: js.Array[SchemaCompensationHistogramRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationHistogramFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompensationHistogramFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensationHistogramFacets")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributeHistogramFacets(value: js.Array[SchemaCustomAttributeHistogramRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributeHistogramFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributeHistogramFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributeHistogramFacets")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleHistogramFacets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleHistogramFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleHistogramFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleHistogramFacets")(js.undefined)
        ret
    }
  }
  
}

