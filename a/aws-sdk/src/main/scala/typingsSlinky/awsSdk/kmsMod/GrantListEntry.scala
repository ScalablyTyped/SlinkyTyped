package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantListEntry extends js.Object {
  /**
    * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.native
  /**
    * The date and time when the grant was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier for the grant.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  /**
    * The principal that receives the grant's permissions.
    */
  var GranteePrincipal: js.UndefOr[PrincipalIdType] = js.native
  /**
    * The AWS account under which the grant was issued.
    */
  var IssuingAccount: js.UndefOr[PrincipalIdType] = js.native
  /**
    * The unique identifier for the customer master key (CMK) to which the grant applies.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The friendly name that identifies the grant. If a name was provided in the CreateGrant request, that name is returned. Otherwise this value is null.
    */
  var Name: js.UndefOr[GrantNameType] = js.native
  /**
    * The list of operations permitted by the grant.
    */
  var Operations: js.UndefOr[GrantOperationList] = js.native
  /**
    * The principal that can retire the grant.
    */
  var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.native
}

object GrantListEntry {
  @scala.inline
  def apply(): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantListEntry]
  }
  @scala.inline
  implicit class GrantListEntryOps[Self <: GrantListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: GrantConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantId(value: GrantIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantId")(js.undefined)
        ret
    }
    @scala.inline
    def withGranteePrincipal(value: PrincipalIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteePrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranteePrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteePrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuingAccount(value: PrincipalIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuingAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuingAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuingAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: GrantNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: GrantOperationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operations")(js.undefined)
        ret
    }
    @scala.inline
    def withRetiringPrincipal(value: PrincipalIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetiringPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetiringPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetiringPrincipal")(js.undefined)
        ret
    }
  }
  
}

