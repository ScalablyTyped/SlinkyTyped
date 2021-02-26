package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters that describe the nodes in a cluster.
  */
@js.native
trait SchemaNodeConfig extends StObject {
  
  /**
    * A list of hardware accelerators to be attached to each node. See
    * https://cloud.google.com/compute/docs/gpus for more information about
    * support for GPUs.
    */
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
  
  /**
    * Size of the disk attached to each node, specified in GB. The smallest
    * allowed disk size is 10GB.  If unspecified, the default disk size is
    * 100GB.
    */
  var diskSizeGb: js.UndefOr[Double] = js.native
  
  /**
    * Type of the disk attached to each node (e.g. &#39;pd-standard&#39; or
    * &#39;pd-ssd&#39;)  If unspecified, the default disk type is
    * &#39;pd-standard&#39;
    */
  var diskType: js.UndefOr[String] = js.native
  
  /**
    * The image type to use for this node. Note that for a given image type,
    * the latest version of it will be used.
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * The map of Kubernetes labels (key/value pairs) to be applied to each
    * node. These will added in addition to any default label(s) that
    * Kubernetes may apply to the node. In case of conflict in label keys, the
    * applied set may differ depending on the Kubernetes version -- it&#39;s
    * best to assume the behavior is undefined and conflicts should be avoided.
    * For more information, including usage and the valid values, see:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The number of local SSD disks to be attached to the node.  The limit for
    * this value is dependant upon the maximum number of disks available on a
    * machine per zone. See:
    * https://cloud.google.com/compute/docs/disks/local-ssd#local_ssd_limits
    * for more information.
    */
  var localSsdCount: js.UndefOr[Double] = js.native
  
  /**
    * The name of a Google Compute Engine [machine
    * type](/compute/docs/machine-types) (e.g. `n1-standard-1`).  If
    * unspecified, the default machine type is `n1-standard-1`.
    */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * The metadata key/value pairs assigned to instances in the cluster.  Keys
    * must conform to the regexp [a-zA-Z0-9-_]+ and be less than 128 bytes in
    * length. These are reflected as part of a URL in the metadata server.
    * Additionally, to avoid ambiguity, keys must not conflict with any other
    * metadata keys for the project or be one of the reserved keys:
    * &quot;cluster-location&quot;  &quot;cluster-name&quot;
    * &quot;cluster-uid&quot;  &quot;configure-sh&quot;
    * &quot;containerd-configure-sh&quot;  &quot;enable-oslogin&quot;
    * &quot;gci-ensure-gke-docker&quot;  &quot;gci-update-strategy&quot;
    * &quot;instance-template&quot;  &quot;kube-env&quot;
    * &quot;startup-script&quot;  &quot;user-data&quot;  Values are free-form
    * strings, and only have meaning as interpreted by the image running in the
    * instance. The only restriction placed on them is that each value&#39;s
    * size must be less than or equal to 32 KB.  The total size of all keys and
    * values must be less than 512 KB.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Minimum CPU platform to be used by this instance. The instance may be
    * scheduled on the specified or newer CPU platform. Applicable values are
    * the friendly names of CPU platforms, such as &lt;code&gt;minCpuPlatform:
    * &amp;quot;Intel Haswell&amp;quot;&lt;/code&gt; or
    * &lt;code&gt;minCpuPlatform: &amp;quot;Intel Sandy
    * Bridge&amp;quot;&lt;/code&gt;. For more information, read [how to specify
    * min CPU
    * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /**
    * The set of Google API scopes to be made available on all of the node VMs
    * under the &quot;default&quot; service account.  The following scopes are
    * recommended, but not required, and by default are not included:  *
    * `https://www.googleapis.com/auth/compute` is required for mounting
    * persistent storage on your nodes. *
    * `https://www.googleapis.com/auth/devstorage.read_only` is required for
    * communicating with **gcr.io** (the [Google Container
    * Registry](/container-registry/)).  If unspecified, no scopes are added,
    * unless Cloud Logging or Cloud Monitoring are enabled, in which case their
    * required scopes will be added.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the nodes are created as preemptible VM instances. See:
    * https://cloud.google.com/compute/docs/instances/preemptible for more
    * inforamtion about preemptible VM instances.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
  
  /**
    * The Google Cloud Platform Service Account to be used by the node VMs. If
    * no Service Account is specified, the &quot;default&quot; service account
    * is used.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /**
    * The list of instance tags applied to all nodes. Tags are used to identify
    * valid sources or targets for network firewalls and are specified by the
    * client during cluster or node pool creation. Each tag within the list
    * must comply with RFC1035.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of kubernetes taints to be applied to each node.  For more
    * information, including usage and the valid values, see:
    * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
    */
  var taints: js.UndefOr[js.Array[SchemaNodeTaint]] = js.native
  
  /**
    * The workload metadata configuration for this node.
    */
  var workloadMetadataConfig: js.UndefOr[SchemaWorkloadMetadataConfig] = js.native
}
object SchemaNodeConfig {
  
  @scala.inline
  def apply(): SchemaNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeConfig]
  }
  
  @scala.inline
  implicit class SchemaNodeConfigMutableBuilder[Self <: SchemaNodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    @scala.inline
    def setAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value :_*))
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocalSsdCount(value: Double): Self = StObject.set(x, "localSsdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSsdCountUndefined: Self = StObject.set(x, "localSsdCount", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value :_*))
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaints(value: js.Array[SchemaNodeTaint]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    @scala.inline
    def setTaintsVarargs(value: SchemaNodeTaint*): Self = StObject.set(x, "taints", js.Array(value :_*))
    
    @scala.inline
    def setWorkloadMetadataConfig(value: SchemaWorkloadMetadataConfig): Self = StObject.set(x, "workloadMetadataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkloadMetadataConfigUndefined: Self = StObject.set(x, "workloadMetadataConfig", js.undefined)
  }
}
