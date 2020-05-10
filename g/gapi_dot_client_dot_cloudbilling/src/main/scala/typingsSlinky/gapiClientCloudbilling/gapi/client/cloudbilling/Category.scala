package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  /**
    * The type of product the SKU refers to.
    * Example: "Compute", "Storage", "Network", "ApplicationServices" etc.
    */
  var resourceFamily: js.UndefOr[String] = js.native
  /**
    * A group classification for related SKUs.
    * Example: "RAM", "GPU", "Prediction", "Ops", "GoogleEgress" etc.
    */
  var resourceGroup: js.UndefOr[String] = js.native
  /** The display name of the service this SKU belongs to. */
  var serviceDisplayName: js.UndefOr[String] = js.native
  /**
    * Represents how the SKU is consumed.
    * Example: "OnDemand", "Preemptible", "Commit1Mo", "Commit1Yr" etc.
    */
  var usageType: js.UndefOr[String] = js.native
}

object Category {
  @scala.inline
  def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageType")(js.undefined)
        ret
    }
  }
  
}

