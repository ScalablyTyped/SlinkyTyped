package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateAssociation extends js.Object {
  /**
    * The association.
    */
  var Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.native
  /**
    * The source of the failure.
    */
  var Fault: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Fault] = js.native
  /**
    * A description of the failure.
    */
  var Message: js.UndefOr[BatchErrorMessage] = js.native
}

object FailedCreateAssociation {
  @scala.inline
  def apply(): FailedCreateAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateAssociation]
  }
  @scala.inline
  implicit class FailedCreateAssociationOps[Self <: FailedCreateAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntry(value: CreateAssociationBatchRequestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entry")(js.undefined)
        ret
    }
    @scala.inline
    def withFault(value: Fault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: BatchErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

