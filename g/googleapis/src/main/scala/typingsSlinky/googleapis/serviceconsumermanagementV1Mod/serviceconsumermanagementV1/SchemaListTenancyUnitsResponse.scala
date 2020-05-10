package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the list request.
  */
@js.native
trait SchemaListTenancyUnitsResponse extends js.Object {
  /**
    * Pagination token for large results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Tenancy units matching the request.
    */
  var tenancyUnits: js.UndefOr[js.Array[SchemaTenancyUnit]] = js.native
}

object SchemaListTenancyUnitsResponse {
  @scala.inline
  def apply(): SchemaListTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTenancyUnitsResponse]
  }
  @scala.inline
  implicit class SchemaListTenancyUnitsResponseOps[Self <: SchemaListTenancyUnitsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTenancyUnits(value: js.Array[SchemaTenancyUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancyUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenancyUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancyUnits")(js.undefined)
        ret
    }
  }
  
}

