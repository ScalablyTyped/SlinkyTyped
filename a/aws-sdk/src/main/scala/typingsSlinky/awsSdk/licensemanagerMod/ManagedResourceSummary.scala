package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedResourceSummary extends js.Object {
  /**
    * Number of resources associated with licenses.
    */
  var AssociationCount: js.UndefOr[BoxLong] = js.native
  /**
    * Type of resource associated with a license.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object ManagedResourceSummary {
  @scala.inline
  def apply(): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedResourceSummary]
  }
  @scala.inline
  implicit class ManagedResourceSummaryOps[Self <: ManagedResourceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationCount(value: BoxLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
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

