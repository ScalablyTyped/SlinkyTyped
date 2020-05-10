package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center&#39;s (Cloud SCC) representation of a Google
  * Cloud Platform (GCP) resource.  The Asset is a Cloud SCC resource that
  * captures information about a single GCP resource. All modifications to an
  * Asset are only within the context of Cloud SCC and don&#39;t affect the
  * referenced GCP resource.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * The time at which the asset was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * IAM Policy information associated with the GCP resource described by the
    * Cloud SCC asset. This information is managed and defined by the GCP
    * resource and cannot be modified by the user.
    */
  var iamPolicy: js.UndefOr[SchemaIamPolicy] = js.native
  /**
    * The relative resource name of this asset. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/assets/456&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Resource managed properties. These properties are managed and defined by
    * the GCP resource and cannot be modified by the user.
    */
  var resourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Cloud SCC managed properties. These properties are managed by Cloud SCC
    * and cannot be modified by the user.
    */
  var securityCenterProperties: js.UndefOr[SchemaSecurityCenterProperties] = js.native
  /**
    * User specified security marks. These marks are entirely managed by the
    * user and come from the SecurityMarks resource that belongs to the asset.
    */
  var securityMarks: js.UndefOr[SchemaSecurityMarks] = js.native
  /**
    * The time at which the asset was last updated, added, or deleted in Cloud
    * SCC.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIamPolicy(value: SchemaIamPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityCenterProperties(value: SchemaSecurityCenterProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityCenterProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityCenterProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityCenterProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityMarks(value: SchemaSecurityMarks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityMarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityMarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityMarks")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

