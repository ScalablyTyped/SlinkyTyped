package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Update Conversions Response.
  */
@js.native
trait SchemaConversionsBatchUpdateResponse extends js.Object {
  /**
    * Indicates that some or all conversions failed to update.
    */
  var hasFailures: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchUpdateResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The update status of each conversion. Statuses are returned in the same
    * order that conversions are updated.
    */
  var status: js.UndefOr[js.Array[SchemaConversionStatus]] = js.native
}

object SchemaConversionsBatchUpdateResponse {
  @scala.inline
  def apply(): SchemaConversionsBatchUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchUpdateResponse]
  }
  @scala.inline
  implicit class SchemaConversionsBatchUpdateResponseOps[Self <: SchemaConversionsBatchUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFailures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFailures")(js.undefined)
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
    def withStatus(value: js.Array[SchemaConversionStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

