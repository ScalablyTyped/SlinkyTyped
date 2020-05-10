package typingsSlinky.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Cloud Function that contains user computation executed in
  * response to an event. It encapsulate function and triggers configurations.
  */
@js.native
trait SchemaCloudFunction extends js.Object {
  /**
    * The amount of memory in MB available for a function. Defaults to 256MB.
    */
  var availableMemoryMb: js.UndefOr[Double] = js.native
  /**
    * The name of the function (as defined in source code) that will be
    * executed. Defaults to the resource name suffix, if not specified. For
    * backward compatibility, if function with given name is not found, then
    * the system will try to use function named &quot;function&quot;. For
    * Node.js this is name of a function exported by the module specified in
    * `source_location`.
    */
  var entryPoint: js.UndefOr[String] = js.native
  /**
    * Environment variables that shall be available during function execution.
    */
  var environmentVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A source that fires events in response to a condition in another service.
    */
  var eventTrigger: js.UndefOr[SchemaEventTrigger] = js.native
  /**
    * An HTTPS endpoint type of source that can be triggered via URL.
    */
  var httpsTrigger: js.UndefOr[SchemaHTTPSTrigger] = js.native
  /**
    * Labels associated with this Cloud Function.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Name of the most recent operation modifying the function. If
    * the function status is `DEPLOYING` or `DELETING`, then it points to the
    * active operation.
    */
  var latestOperation: js.UndefOr[String] = js.native
  /**
    * The limit on the maximum number of function instances that may coexist at
    * a given time. This feature is currently in alpha, available only for
    * whitelisted users.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * A user-defined name of the function. Function names must be unique
    * globally and match pattern `projects/x/locations/x/functions/x
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The VPC Network that this cloud function can connect to. It can be either
    * the fully-qualified URI, or the short name of the network resource. If
    * the short network name is used, the network must belong to the same
    * project. Otherwise, it must belong to a project within the same
    * organization. The format of this field is either
    * `projects/{project}/global/networks/{network}` or `{network}`, where
    * {project} is a project id where the network is defined, and {network} is
    * the short name of the network.  This field is mutually exclusive with
    * `vpc_connector` and will be replaced by it.  See [the VPC
    * documentation](https://cloud.google.com/compute/docs/vpc) for more
    * information on connecting Cloud projects.  This feature is currently in
    * alpha, available only for whitelisted users.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The runtime in which the function is going to run. If empty, defaults to
    * Node.js 6.
    */
  var runtime: js.UndefOr[String] = js.native
  /**
    * The email of the function&#39;s service account. If empty, defaults to
    * {project_id}@appspot.gserviceaccount.com.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage URL, starting with gs://, pointing to the zip
    * archive which contains the function.
    */
  var sourceArchiveUrl: js.UndefOr[String] = js.native
  /**
    * The hosted repository where the function is defined.
    */
  var sourceRepository: js.UndefOr[SchemaSourceRepository] = js.native
  /**
    * The URL pointing to the hosted repository where the function is defined.
    * There are supported Cloud Source Repository URLs in the following
    * formats:  To refer to a specific commit:
    * `https://source.developers.google.com/projects/x/repos/x/revisions/x/paths/x
    * To refer to a moveable alias (branch):
    * `https://source.developers.google.com/projects/x/repos/x/moveable-aliases/x/paths/x
    * In particular, to refer to HEAD use `master` moveable alias. To refer to
    * a specific fixed alias (tag):
    * `https://source.developers.google.com/projects/x/repos/x/fixed-aliases/x/paths/x
    * You may omit `paths/x if you want to use the main directory.
    */
  var sourceRepositoryUrl: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage signed URL used for source uploading, generated
    * by google.cloud.functions.v1beta2.GenerateUploadUrl
    */
  var sourceUploadUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Status of the function deployment.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The function execution timeout. Execution is considered failed and can be
    * terminated if the function is not completed at the end of the timeout
    * period. Defaults to 60 seconds.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Output only. The last update timestamp of a Cloud Function.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The version identifier of the Cloud Function. Each
    * deployment attempt results in a new version of a function being created.
    */
  var versionId: js.UndefOr[String] = js.native
  /**
    * The VPC Network Connector that this cloud function can connect to. It can
    * be either the fully-qualified URI, or the short name of the network
    * connector resource. The format of this field is
    * `projects/x/locations/x/connectors/x  This field is mutually exclusive
    * with `network` field and will eventually replace it.  See [the VPC
    * documentation](https://cloud.google.com/compute/docs/vpc) for more
    * information on connecting Cloud projects.  This feature is currently in
    * alpha, available only for whitelisted users.
    */
  var vpcConnector: js.UndefOr[String] = js.native
}

object SchemaCloudFunction {
  @scala.inline
  def apply(): SchemaCloudFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudFunction]
  }
  @scala.inline
  implicit class SchemaCloudFunctionOps[Self <: SchemaCloudFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableMemoryMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableMemoryMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableMemoryMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableMemoryMb")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTrigger(value: SchemaEventTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsTrigger(value: SchemaHTTPSTrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInstances(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInstances")(js.undefined)
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
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
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
    def withSourceArchiveUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceArchiveUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArchiveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceArchiveUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRepository(value: SchemaSourceRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepository")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRepositoryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRepositoryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRepositoryUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUploadUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
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
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConnector")(js.undefined)
        ret
    }
  }
  
}

