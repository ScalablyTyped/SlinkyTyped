package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of an account, i.e., information about its products, which is
  * computed offline and not returned immediately at insertion time.
  */
@js.native
trait SchemaAccountStatus extends js.Object {
  /**
    * The ID of the account for which the status is reported.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * A list of account level issues.
    */
  var accountLevelIssues: js.UndefOr[js.Array[SchemaAccountStatusAccountLevelIssue]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of product-related data by channel, destination, and country. Data
    * in this field may be delayed by up to 30 minutes.
    */
  var products: js.UndefOr[js.Array[SchemaAccountStatusProducts]] = js.native
  /**
    * Whether the account&#39;s website is claimed or not.
    */
  var websiteClaimed: js.UndefOr[Boolean] = js.native
}

object SchemaAccountStatus {
  @scala.inline
  def apply(): SchemaAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatus]
  }
  @scala.inline
  implicit class SchemaAccountStatusOps[Self <: SchemaAccountStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountLevelIssues(value: js.Array[SchemaAccountStatusAccountLevelIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountLevelIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountLevelIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountLevelIssues")(js.undefined)
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
    def withProducts(value: js.Array[SchemaAccountStatusProducts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteClaimed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteClaimed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteClaimed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteClaimed")(js.undefined)
        ret
    }
  }
  
}

