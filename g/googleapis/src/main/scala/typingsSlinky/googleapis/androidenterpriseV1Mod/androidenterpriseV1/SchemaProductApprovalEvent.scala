package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a product&#39;s approval status is changed.
  */
@js.native
trait SchemaProductApprovalEvent extends js.Object {
  /**
    * Whether the product was approved or unapproved. This field will always be
    * present.
    */
  var approved: js.UndefOr[String] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the approval status has changed. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaProductApprovalEvent {
  @scala.inline
  def apply(): SchemaProductApprovalEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductApprovalEvent]
  }
  @scala.inline
  implicit class SchemaProductApprovalEventOps[Self <: SchemaProductApprovalEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

