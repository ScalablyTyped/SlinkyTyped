package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The cluster config.
  */
@js.native
trait SchemaClusterConfig extends js.Object {
  /**
    * Optional. Autoscaling config for the policy associated with the cluster.
    * Cluster does not autoscale if this field is unset.
    */
  var autoscalingConfig: js.UndefOr[SchemaAutoscalingConfig] = js.native
  /**
    * Optional. A Google Cloud Storage bucket used to stage job dependencies,
    * config files, and job driver console output. If you do not specify a
    * staging bucket, Cloud Dataproc will determine a Cloud Storage location
    * (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the
    * Google Compute Engine zone where your cluster is deployed, and then
    * create and manage this project-level, per-location bucket (see Cloud
    * Dataproc staging bucket).
    */
  var configBucket: js.UndefOr[String] = js.native
  /**
    * Optional. Encryption settings for the cluster.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.native
  /**
    * Optional. Port/endpoint configuration for this cluster
    */
  var endpointConfig: js.UndefOr[SchemaEndpointConfig] = js.native
  /**
    * Optional. The shared Compute Engine config settings for all instances in
    * a cluster.
    */
  var gceClusterConfig: js.UndefOr[SchemaGceClusterConfig] = js.native
  /**
    * Optional. Commands to execute on each node after config is completed. By
    * default, executables are run on master and all worker nodes. You can test
    * a node&#39;s &lt;code&gt;role&lt;/code&gt; metadata to run an executable
    * on a master or worker node, as shown below using curl (you can also use
    * wget): ROLE=$(curl -H Metadata-Flavor:Google
    * http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
    * if [[ &quot;${ROLE}&quot; == &#39;Master&#39; ]]; then   ... master
    * specific actions ... else   ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[SchemaNodeInitializationAction]] = js.native
  /**
    * Optional. The config setting for auto delete cluster schedule.
    */
  var lifecycleConfig: js.UndefOr[SchemaLifecycleConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for the master instance in a
    * cluster.
    */
  var masterConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for additional worker
    * instances in a cluster.
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.native
  /**
    * Optional. Security related configuration.
    */
  var securityConfig: js.UndefOr[SchemaSecurityConfig] = js.native
  /**
    * Optional. The config settings for software inside the cluster.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for worker instances in a
    * cluster.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.native
}

object SchemaClusterConfig {
  @scala.inline
  def apply(): SchemaClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterConfig]
  }
  @scala.inline
  implicit class SchemaClusterConfigOps[Self <: SchemaClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingConfig(value: SchemaAutoscalingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configBucket")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionConfig(value: SchemaEncryptionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointConfig(value: SchemaEndpointConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGceClusterConfig(value: SchemaGceClusterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gceClusterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGceClusterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gceClusterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializationActions(value: js.Array[SchemaNodeInitializationAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializationActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializationActions")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleConfig(value: SchemaLifecycleConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterConfig(value: SchemaInstanceGroupConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryWorkerConfig(value: SchemaInstanceGroupConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryWorkerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryWorkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryWorkerConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfig(value: SchemaSecurityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareConfig(value: SchemaSoftwareConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerConfig(value: SchemaInstanceGroupConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerConfig")(js.undefined)
        ret
    }
  }
  
}

