package typingsSlinky.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumedLicenseSummary extends js.Object {
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Resource type of the resource consuming a license.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.licensemanagerMod.ResourceType] = js.native
}

object ConsumedLicenseSummary {
  @scala.inline
  def apply(): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
  @scala.inline
  implicit class ConsumedLicenseSummaryOps[Self <: ConsumedLicenseSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumedLicenses(value: BoxLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedLicenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedLicenses")(js.undefined)
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

