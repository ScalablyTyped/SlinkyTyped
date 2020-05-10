package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main response class which holds the reports from the Reporting API
  * `batchGet` call.
  */
@js.native
trait SchemaGetReportsResponse extends js.Object {
  /**
    * The amount of resource quota tokens deducted to execute the query.
    * Includes all responses.
    */
  var queryCost: js.UndefOr[Double] = js.native
  /**
    * Responses corresponding to each of the request.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.native
  /**
    * The amount of resource quota remaining for the property.
    */
  var resourceQuotasRemaining: js.UndefOr[SchemaResourceQuotasRemaining] = js.native
}

object SchemaGetReportsResponse {
  @scala.inline
  def apply(): SchemaGetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReportsResponse]
  }
  @scala.inline
  implicit class SchemaGetReportsResponseOps[Self <: SchemaGetReportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCost")(js.undefined)
        ret
    }
    @scala.inline
    def withReports(value: js.Array[SchemaReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceQuotasRemaining(value: SchemaResourceQuotasRemaining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuotasRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceQuotasRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuotasRemaining")(js.undefined)
        ret
    }
  }
  
}

