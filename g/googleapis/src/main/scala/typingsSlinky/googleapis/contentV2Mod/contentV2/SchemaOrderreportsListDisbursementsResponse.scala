package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderreportsListDisbursementsResponse extends js.Object {
  /**
    * The list of disbursements.
    */
  var disbursements: js.UndefOr[js.Array[SchemaOrderReportDisbursement]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListDisbursementsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token for the retrieval of the next page of disbursements.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaOrderreportsListDisbursementsResponse {
  @scala.inline
  def apply(): SchemaOrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreportsListDisbursementsResponse]
  }
  @scala.inline
  implicit class SchemaOrderreportsListDisbursementsResponseOps[Self <: SchemaOrderreportsListDisbursementsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisbursements(value: js.Array[SchemaOrderReportDisbursement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisbursements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursements")(js.undefined)
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
  }
  
}

