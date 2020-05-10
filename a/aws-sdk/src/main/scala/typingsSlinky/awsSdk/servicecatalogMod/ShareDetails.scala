package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareDetails extends js.Object {
  /**
    * List of errors.
    */
  var ShareErrors: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ShareErrors] = js.native
  /**
    * List of accounts for whom the operation succeeded.
    */
  var SuccessfulShares: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SuccessfulShares] = js.native
}

object ShareDetails {
  @scala.inline
  def apply(): ShareDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareDetails]
  }
  @scala.inline
  implicit class ShareDetailsOps[Self <: ShareDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareErrors(value: ShareErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulShares(value: SuccessfulShares): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulShares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulShares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessfulShares")(js.undefined)
        ret
    }
  }
  
}

