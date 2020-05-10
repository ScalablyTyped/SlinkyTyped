package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Filter on job compensation type and amount.
  */
@js.native
trait SchemaCompensationFilter extends js.Object {
  /**
    * Optional.  Whether to include jobs whose compensation range is
    * unspecified.
    */
  var includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Compensation range.
    */
  var range: js.UndefOr[SchemaCompensationRange] = js.native
  /**
    * Required.  Type of filter.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Required.  Specify desired `base compensation entry&#39;s`
    * CompensationInfo.CompensationUnit.
    */
  var units: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCompensationFilter {
  @scala.inline
  def apply(): SchemaCompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationFilter]
  }
  @scala.inline
  implicit class SchemaCompensationFilterOps[Self <: SchemaCompensationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeJobsWithUnspecifiedCompensationRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobsWithUnspecifiedCompensationRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeJobsWithUnspecifiedCompensationRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeJobsWithUnspecifiedCompensationRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: SchemaCompensationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

