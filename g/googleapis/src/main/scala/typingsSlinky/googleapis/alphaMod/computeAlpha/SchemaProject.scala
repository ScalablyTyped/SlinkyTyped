package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Project resource. For an overview of projects, see  Cloud Platform
  * Resource Hierarchy. (== resource_for v1.projects ==) (== resource_for
  * beta.projects ==)
  */
@js.native
trait SchemaProject extends js.Object {
  /**
    * Metadata key/value pairs available to all instances contained in this
    * project. See Custom metadata for more information.
    */
  var commonInstanceMetadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * This signifies the default network tier used for configuring resources of
    * the project and can only take the following values: PREMIUM, STANDARD.
    * Initially the default network tier is PREMIUM.
    */
  var defaultNetworkTier: js.UndefOr[String] = js.native
  /**
    * [Output Only] Default service account used by VMs running in this
    * project.
    */
  var defaultServiceAccount: js.UndefOr[String] = js.native
  /**
    * An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Restricted features enabled for use on this project.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server. This is not the project ID, and is just a unique
    * ID used by Compute Engine to identify resources.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#project for projects.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The project ID. For example: my-example-project. Use the project ID to
    * make requests to Compute Engine.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Quotas assigned to this project.
    */
  var quotas: js.UndefOr[js.Array[SchemaQuota]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The naming prefix for daily usage reports and the Google Cloud Storage
    * bucket where they are stored.
    */
  var usageExportLocation: js.UndefOr[SchemaUsageExportLocation] = js.native
  /**
    * [Output Only] The role this project has in a shared VPC configuration.
    * Currently only HOST projects are differentiated.
    */
  var xpnProjectStatus: js.UndefOr[String] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  @scala.inline
  implicit class SchemaProjectOps[Self <: SchemaProject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommonInstanceMetadata(value: SchemaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonInstanceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonInstanceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonInstanceMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNetworkTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNetworkTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNetworkTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNetworkTier")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultServiceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultServiceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultServiceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withQuotas(value: js.Array[SchemaQuota]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotas")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageExportLocation(value: SchemaUsageExportLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageExportLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageExportLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageExportLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withXpnProjectStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpnProjectStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpnProjectStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpnProjectStatus")(js.undefined)
        ret
    }
  }
  
}

