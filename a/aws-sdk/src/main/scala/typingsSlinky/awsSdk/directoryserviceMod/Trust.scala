package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trust extends js.Object {
  /**
    * The date and time that the trust relationship was created.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The Directory ID of the AWS directory involved in the trust relationship.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The date and time that the trust relationship was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
    */
  var RemoteDomainName: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName] = js.native
  /**
    * Current state of selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  /**
    * The date and time that the TrustState was last updated.
    */
  var StateLastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The trust relationship direction.
    */
  var TrustDirection: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustDirection] = js.native
  /**
    * The unique ID of the trust relationship.
    */
  var TrustId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustId] = js.native
  /**
    * The trust relationship state.
    */
  var TrustState: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustState] = js.native
  /**
    * The reason for the TrustState.
    */
  var TrustStateReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustStateReason] = js.native
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustType] = js.native
}

object Trust {
  @scala.inline
  def apply(): Trust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trust]
  }
  @scala.inline
  implicit class TrustOps[Self <: Trust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteDomainName(value: RemoteDomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectiveAuth(value: SelectiveAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectiveAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectiveAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectiveAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withStateLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateLastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateLastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustDirection(value: TrustDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustId(value: TrustId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustState(value: TrustState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustState")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustStateReason(value: TrustStateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustStateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustStateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustType(value: TrustType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustType")(js.undefined)
        ret
    }
  }
  
}

