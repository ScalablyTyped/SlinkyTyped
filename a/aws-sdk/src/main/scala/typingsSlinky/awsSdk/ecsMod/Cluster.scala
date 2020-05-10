package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The number of services that are running on the cluster in an ACTIVE state. You can view these services with ListServices.
    */
  var activeServicesCount: js.UndefOr[Integer] = js.native
  /**
    * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is created will be returned as a cluster attachment.
    */
  var attachments: js.UndefOr[Attachments] = js.native
  /**
    * The status of the capacity providers associated with the cluster. The following are the states that will be returned:  UPDATE_IN_PROGRESS  The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is provisioning or deprovisioning.  UPDATE_COMPLETE  The capacity providers have successfully updated.  UPDATE_FAILED  The capacity provider updates failed.  
    */
  var attachmentsStatus: js.UndefOr[String] = js.native
  /**
    * The capacity providers associated with the cluster.
    */
  var capacityProviders: js.UndefOr[StringList] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the arn:aws:ecs namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the cluster namespace, and then the cluster name. For example, arn:aws:ecs:region:012345678910:cluster/test.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * A user-generated string that you use to identify your cluster.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
    */
  var defaultCapacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.native
  /**
    * The number of container instances registered into the cluster. This includes container instances in both ACTIVE and DRAINING status.
    */
  var registeredContainerInstancesCount: js.UndefOr[Integer] = js.native
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.native
  /**
    * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or disabled for a cluster.
    */
  var settings: js.UndefOr[ClusterSettings] = js.native
  /**
    * Additional information about your clusters that are separated by launch type, including:   runningEC2TasksCount   RunningFargateTasksCount   pendingEC2TasksCount   pendingFargateTasksCount   activeEC2ServiceCount   activeFargateServiceCount   drainingEC2ServiceCount   drainingFargateServiceCount  
    */
  var statistics: js.UndefOr[Statistics] = js.native
  /**
    * The status of the cluster. The following are the possible states that will be returned.  ACTIVE  The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.  PROVISIONING  The cluster has capacity providers associated with it and the resources needed for the capacity provider are being created.  DEPROVISIONING  The cluster has capacity providers associated with it and the resources needed for the capacity provider are being deleted.  FAILED  The cluster has capacity providers associated with it and the resources needed for the capacity provider have failed to create.  INACTIVE  The cluster has been deleted. Clusters with an INACTIVE status may remain discoverable in your account for a period of time. However, this behavior is subject to change in the future, so you should not rely on INACTIVE clusters persisting.  
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveServicesCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeServicesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveServicesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeServicesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: Attachments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentsStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityProviders(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCapacityProviderStrategy(value: CapacityProviderStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCapacityProviderStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCapacityProviderStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCapacityProviderStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingTasksCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTasksCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingTasksCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingTasksCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisteredContainerInstancesCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredContainerInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisteredContainerInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredContainerInstancesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningTasksCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTasksCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningTasksCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningTasksCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: ClusterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: Statistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
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
    def withTags(value: Tags): Self = {
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

