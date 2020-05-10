package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceByResource extends js.Object {
  /**
    * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
    */
  var Compliance: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Compliance] = js.native
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object ComplianceByResource {
  @scala.inline
  def apply(): ComplianceByResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByResource]
  }
  @scala.inline
  implicit class ComplianceByResourceOps[Self <: ComplianceByResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliance(value: Compliance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compliance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compliance")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: BaseResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

