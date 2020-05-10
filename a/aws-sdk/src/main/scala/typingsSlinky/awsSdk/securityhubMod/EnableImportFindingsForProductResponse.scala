package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableImportFindingsForProductResponse extends js.Object {
  /**
    * The ARN of your subscription to the product to enable integrations for.
    */
  var ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.native
}

object EnableImportFindingsForProductResponse {
  @scala.inline
  def apply(): EnableImportFindingsForProductResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableImportFindingsForProductResponse]
  }
  @scala.inline
  implicit class EnableImportFindingsForProductResponseOps[Self <: EnableImportFindingsForProductResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductSubscriptionArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductSubscriptionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSubscriptionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductSubscriptionArn")(js.undefined)
        ret
    }
  }
  
}

