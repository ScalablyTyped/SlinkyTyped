package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateUserStackResult extends js.Object {
  /**
    * The list of UserStackAssociationError objects.
    */
  var errors: js.UndefOr[UserStackAssociationErrorList] = js.native
}

object BatchAssociateUserStackResult {
  @scala.inline
  def apply(): BatchAssociateUserStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateUserStackResult]
  }
  @scala.inline
  implicit class BatchAssociateUserStackResultOps[Self <: BatchAssociateUserStackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: UserStackAssociationErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

