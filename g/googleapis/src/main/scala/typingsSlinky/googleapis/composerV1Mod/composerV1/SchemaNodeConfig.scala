package typingsSlinky.googleapis.composerV1Mod.composerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration information for the Kubernetes Engine nodes running the
  * Apache Airflow software.
  */
@js.native
trait SchemaNodeConfig extends js.Object {
  /**
    * Optional. The disk size in GB used for node VMs. Minimum size is 20GB. If
    * unspecified, defaults to 100GB. Cannot be updated.
    */
  var diskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which
    * to deploy the VMs used to run the Apache Airflow software, specified as a
    * [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/zones/{zoneId}&quot;.  This `location` must
    * belong to the enclosing environment&#39;s project and location. If both
    * this field and `nodeConfig.machineType` are specified,
    * `nodeConfig.machineType` must belong to this `location`; if both are
    * unspecified, the service will pick a zone in the Compute Engine region
    * corresponding to the Cloud Composer location, and propagate that choice
    * to both fields. If only one field (`location` or
    * `nodeConfig.machineType`) is specified, the location information from the
    * specified field will be propagated to the unspecified field.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Optional. The Compute Engine [machine type](/compute/docs/machine-types)
    * used for cluster instances, specified as a [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}&quot;.
    * The `machineType` must belong to the enclosing environment&#39;s project
    * and location. If both this field and `nodeConfig.location` are specified,
    * this `machineType` must belong to the `nodeConfig.location`; if both are
    * unspecified, the service will pick a zone in the Compute Engine region
    * corresponding to the Cloud Composer location, and propagate that choice
    * to both fields. If exactly one of this field and `nodeConfig.location` is
    * specified, the location information from the specified field will be
    * propagated to the unspecified field.  If this field is unspecified, the
    * `machineTypeId` defaults to &quot;n1-standard-1&quot;.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Optional. The Compute Engine network to be used for machine
    * communications, specified as a [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/global/networks/{networkId}&quot;.  [Shared
    * VPC](/vpc/docs/shared-vpc) is not currently supported. The network must
    * belong to the environment&#39;s project. If unspecified, the
    * &quot;default&quot; network ID in the environment&#39;s project is used.
    * If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is
    * provided, `nodeConfig.subnetwork` must also be provided.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Optional. The set of Google API scopes to be made available on all node
    * VMs. If `oauth_scopes` is empty, defaults to
    * [&quot;https://www.googleapis.com/auth/cloud-platform&quot;]. Cannot be
    * updated.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The Google Cloud Platform Service Account to be used by the
    * node VMs. If a service account is not specified, the &quot;default&quot;
    * Compute Engine service account is used. Cannot be updated.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * Optional. The Compute Engine subnetwork to be used for machine
    * communications, specified as a [relative resource
    * name](/apis/design/resource_names#relative_resource_name). For example:
    * &quot;projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}&quot;
    * If a subnetwork is provided, `nodeConfig.network` must also be provided,
    * and the subnetwork must belong to the enclosing environment&#39;s project
    * and location.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * Optional. The list of instance tags applied to all node VMs. Tags are
    * used to identify valid sources or targets for network firewalls. Each tag
    * within the list must comply with
    * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaNodeConfig {
  @scala.inline
  def apply(): SchemaNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeConfig]
  }
  @scala.inline
  implicit class SchemaNodeConfigOps[Self <: SchemaNodeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskSizeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMachineType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineType")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScopes")(js.undefined)
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
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
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
  }
  
}

