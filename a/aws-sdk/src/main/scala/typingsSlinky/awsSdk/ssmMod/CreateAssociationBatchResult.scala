package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssociationBatchResult extends js.Object {
  /**
    * Information about the associations that failed.
    */
  var Failed: js.UndefOr[FailedCreateAssociationList] = js.native
  /**
    * Information about the associations that succeeded.
    */
  var Successful: js.UndefOr[AssociationDescriptionList] = js.native
}

object CreateAssociationBatchResult {
  @scala.inline
  def apply(): CreateAssociationBatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssociationBatchResult]
  }
  @scala.inline
  implicit class CreateAssociationBatchResultOps[Self <: CreateAssociationBatchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailed(value: FailedCreateAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failed")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessful(value: AssociationDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(js.undefined)
        ret
    }
  }
  
}

