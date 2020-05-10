package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLedgerRequest extends js.Object {
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  var DeletionProtection: js.UndefOr[typingsSlinky.awsSdk.qldbMod.DeletionProtection] = js.native
  /**
    * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current AWS Region.
    */
  var Name: LedgerName = js.native
  /**
    * The permissions mode to assign to the ledger that you want to create.
    */
  var PermissionsMode: typingsSlinky.awsSdk.qldbMod.PermissionsMode = js.native
  /**
    * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.qldbMod.Tags] = js.native
}

object CreateLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName, PermissionsMode: PermissionsMode): CreateLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionsMode = PermissionsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLedgerRequest]
  }
  @scala.inline
  implicit class CreateLedgerRequestOps[Self <: CreateLedgerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: LedgerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissionsMode(value: PermissionsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletionProtection(value: DeletionProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

