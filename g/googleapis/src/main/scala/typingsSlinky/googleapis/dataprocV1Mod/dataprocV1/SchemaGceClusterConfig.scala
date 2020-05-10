package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common config settings for resources of Compute Engine cluster instances,
  * applicable to all instances in the cluster.
  */
@js.native
trait SchemaGceClusterConfig extends js.Object {
  /**
    * Optional. If true, all instances in the cluster will only have internal
    * IP addresses. By default, clusters are not restricted to internal IP
    * addresses, and will have ephemeral external IP addresses assigned to each
    * instance. This internal_ip_only restriction can only be enabled for
    * subnetwork enabled networks, and all off-cluster dependencies must be
    * configured to be accessible without external IP addresses.
    */
  var internalIpOnly: js.UndefOr[Boolean] = js.native
  /**
    * The Compute Engine metadata entries to add to all instances (see Project
    * and instance metadata
    * (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The Compute Engine network to be used for machine
    * communications. Cannot be specified with subnetwork_uri. If neither
    * network_uri nor subnetwork_uri is specified, the &quot;default&quot;
    * network of the project is used, if it exists. Cannot be a &quot;Custom
    * Subnet Network&quot; (see Using Subnetworks for more information).A full
    * URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default
    * projects/[project_id]/regions/global/default default
    */
  var networkUri: js.UndefOr[String] = js.native
  /**
    * Optional. The service account of the instances. Defaults to the default
    * Compute Engine service account. Custom service accounts need permissions
    * equivalent to the following IAM roles: roles/logging.logWriter
    * roles/storage.objectAdmin(see
    * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
    * for more information). Example:
    * [account_id]@[project_id].iam.gserviceaccount.com
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * Optional. The URIs of service account scopes to be included in Compute
    * Engine instances. The following base set of scopes is always included:
    * https://www.googleapis.com/auth/cloud.useraccounts.readonly
    * https://www.googleapis.com/auth/devstorage.read_write
    * https://www.googleapis.com/auth/logging.writeIf no scopes are specified,
    * the following defaults are also provided:
    * https://www.googleapis.com/auth/bigquery
    * https://www.googleapis.com/auth/bigtable.admin.table
    * https://www.googleapis.com/auth/bigtable.data
    * https://www.googleapis.com/auth/devstorage.full_control
    */
  var serviceAccountScopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The Compute Engine subnetwork to be used for machine
    * communications. Cannot be specified with network_uri.A full URL, partial
    * URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/sub0
    * projects/[project_id]/regions/us-east1/sub0 sub0
    */
  var subnetworkUri: js.UndefOr[String] = js.native
  /**
    * The Compute Engine tags to add to all instances (see Tagging instances).
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The zone where the Compute Engine cluster will be located. On a
    * create request, it is required in the &quot;global&quot; region. If
    * omitted in a non-global Cloud Dataproc region, the service will pick a
    * zone in the corresponding Compute Engine region. On a get request, zone
    * will always be present.A full URL, partial URI, or short name are valid.
    * Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]
    * projects/[project_id]/zones/[zone] us-central1-f
    */
  var zoneUri: js.UndefOr[String] = js.native
}

object SchemaGceClusterConfig {
  @scala.inline
  def apply(): SchemaGceClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGceClusterConfig]
  }
  @scala.inline
  implicit class SchemaGceClusterConfigOps[Self <: SchemaGceClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInternalIpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalIpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalIpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalIpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUri")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetworkUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworkUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withZoneUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoneUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoneUri")(js.undefined)
        ret
    }
  }
  
}

