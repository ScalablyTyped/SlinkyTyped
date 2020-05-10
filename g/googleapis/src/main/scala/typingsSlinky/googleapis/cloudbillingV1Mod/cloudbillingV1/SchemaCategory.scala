package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the category hierarchy of a SKU.
  */
@js.native
trait SchemaCategory extends js.Object {
  /**
    * The type of product the SKU refers to. Example: &quot;Compute&quot;,
    * &quot;Storage&quot;, &quot;Network&quot;, &quot;ApplicationServices&quot;
    * etc.
    */
  var resourceFamily: js.UndefOr[String] = js.native
  /**
    * A group classification for related SKUs. Example: &quot;RAM&quot;,
    * &quot;GPU&quot;, &quot;Prediction&quot;, &quot;Ops&quot;,
    * &quot;GoogleEgress&quot; etc.
    */
  var resourceGroup: js.UndefOr[String] = js.native
  /**
    * The display name of the service this SKU belongs to.
    */
  var serviceDisplayName: js.UndefOr[String] = js.native
  /**
    * Represents how the SKU is consumed. Example: &quot;OnDemand&quot;,
    * &quot;Preemptible&quot;, &quot;Commit1Mo&quot;, &quot;Commit1Yr&quot;
    * etc.
    */
  var usageType: js.UndefOr[String] = js.native
}

object SchemaCategory {
  @scala.inline
  def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  @scala.inline
  implicit class SchemaCategoryOps[Self <: SchemaCategory] (val x: Self) extends AnyVal {
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

