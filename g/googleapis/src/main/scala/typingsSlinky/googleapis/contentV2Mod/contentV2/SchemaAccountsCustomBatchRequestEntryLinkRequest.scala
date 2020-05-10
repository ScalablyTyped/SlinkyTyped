package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountsCustomBatchRequestEntryLinkRequest extends js.Object {
  /**
    * Action to perform for this link. The &quot;request&quot; action is only
    * available to select merchants.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Type of the link between the two accounts.
    */
  var linkType: js.UndefOr[String] = js.native
  /**
    * The ID of the linked account.
    */
  var linkedAccountId: js.UndefOr[String] = js.native
}

object SchemaAccountsCustomBatchRequestEntryLinkRequest {
  @scala.inline
  def apply(): SchemaAccountsCustomBatchRequestEntryLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntryLinkRequest]
  }
  @scala.inline
  implicit class SchemaAccountsCustomBatchRequestEntryLinkRequestOps[Self <: SchemaAccountsCustomBatchRequestEntryLinkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedAccountId")(js.undefined)
        ret
    }
  }
  
}

