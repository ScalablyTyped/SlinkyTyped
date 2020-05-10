package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductStatusDestinationStatus extends js.Object {
  /**
    * Whether the approval status might change due to further processing.
    */
  var approvalPending: js.UndefOr[Boolean] = js.native
  /**
    * The destination&#39;s approval status.
    */
  var approvalStatus: js.UndefOr[String] = js.native
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Provided for backward compatibility only. Always set to
    * &quot;required&quot;.
    */
  var intention: js.UndefOr[String] = js.native
}

object SchemaProductStatusDestinationStatus {
  @scala.inline
  def apply(): SchemaProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusDestinationStatus]
  }
  @scala.inline
  implicit class SchemaProductStatusDestinationStatusOps[Self <: SchemaProductStatusDestinationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalPending")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withIntention(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intention")(js.undefined)
        ret
    }
  }
  
}

