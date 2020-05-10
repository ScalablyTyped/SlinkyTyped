package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DimensionValuesRequest.
  */
@js.native
trait SchemaDimensionValueRequest extends js.Object {
  /**
    * The name of the dimension for which values should be requested.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The end date of the date range for which to retrieve dimension values. A
    * string of the format &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The list of filters by which to filter values. The filters are ANDed.
    */
  var filters: js.UndefOr[js.Array[SchemaDimensionFilter]] = js.native
  /**
    * The kind of request this is, in this case
    * dfareporting#dimensionValueRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The start date of the date range for which to retrieve dimension values.
    * A string of the format &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaDimensionValueRequest {
  @scala.inline
  def apply(): SchemaDimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionValueRequest]
  }
  @scala.inline
  implicit class SchemaDimensionValueRequestOps[Self <: SchemaDimensionValueRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[SchemaDimensionFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
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
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
  }
  
}

