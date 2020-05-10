package typingsSlinky.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceDetails extends js.Object {
  /**
    * Whether a resource is compliant with the effective tag policy.
    */
  var ComplianceStatus: js.UndefOr[typingsSlinky.awsSdk.resourcegroupstaggingapiMod.ComplianceStatus] = js.native
  /**
    * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or noncompliant values. 
    */
  var KeysWithNoncompliantValues: js.UndefOr[TagKeyList] = js.native
  /**
    * These tag keys on the resource are noncompliant with the effective tag policy.
    */
  var NoncompliantKeys: js.UndefOr[TagKeyList] = js.native
}

object ComplianceDetails {
  @scala.inline
  def apply(): ComplianceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceDetails]
  }
  @scala.inline
  implicit class ComplianceDetailsOps[Self <: ComplianceDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceStatus(value: ComplianceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysWithNoncompliantValues(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeysWithNoncompliantValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeysWithNoncompliantValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeysWithNoncompliantValues")(js.undefined)
        ret
    }
    @scala.inline
    def withNoncompliantKeys(value: TagKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncompliantKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncompliantKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoncompliantKeys")(js.undefined)
        ret
    }
  }
  
}

