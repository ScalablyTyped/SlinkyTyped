package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentDescription extends js.Object {
  /**
    * Indicates if there is an in-progress environment configuration update or application version deployment that you can cancel.  true: There is an update in progress.   false: There are no updates currently in progress. 
    */
  var AbortableOperationInProgress: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.AbortableOperationInProgress] = js.native
  /**
    * The name of the application associated with this environment.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The URL to the CNAME for this environment.
    */
  var CNAME: js.UndefOr[DNSCname] = js.native
  /**
    * The creation date for this environment.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  /**
    * The last modified date for this environment.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  /**
    * Describes this environment.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * For load-balanced, autoscaling environments, the URL to the LoadBalancer. For single-instance environments, the IP address of the instance.
    */
  var EndpointURL: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EndpointURL] = js.native
  /**
    * The environment's Amazon Resource Name (ARN), which can be used in other API requests that require an ARN.
    */
  var EnvironmentArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentArn] = js.native
  /**
    * The ID of this environment.
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * A list of links to other environments in the same group.
    */
  var EnvironmentLinks: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentLinks] = js.native
  /**
    * The name of this environment.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * Describes the health status of the environment. AWS Elastic Beanstalk indicates the failure levels for a running environment:    Red: Indicates the environment is not responsive. Occurs when three or more consecutive failures occur for an environment.    Yellow: Indicates that something is wrong. Occurs when two consecutive failures occur for an environment.    Green: Indicates the environment is healthy and fully functional.    Grey: Default health for a new environment. The environment is not fully launched and health checks have not started or health checks are suspended during an UpdateEnvironment or RestartEnvironment request.    Default: Grey 
    */
  var Health: js.UndefOr[EnvironmentHealth] = js.native
  /**
    * Returns the health status of the application running in your environment. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[EnvironmentHealthStatus] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The description of the AWS resources used by this environment.
    */
  var Resources: js.UndefOr[EnvironmentResourcesDescription] = js.native
  /**
    *  The name of the SolutionStack deployed with this environment. 
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * The current operational status of the environment:    Launching: Environment is in the process of initial deployment.    Updating: Environment is in the process of updating its configuration settings or application version.    Ready: Environment is available to have an action performed on it, such as update or terminate.    Terminating: Environment is in the shut-down process.    Terminated: Environment is not running.  
    */
  var Status: js.UndefOr[EnvironmentStatus] = js.native
  /**
    * The name of the configuration template used to originally launch this environment.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * Describes the current tier of this environment.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.native
  /**
    * The application version deployed in this environment.
    */
  var VersionLabel: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object EnvironmentDescription {
  @scala.inline
  def apply(): EnvironmentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDescription]
  }
  @scala.inline
  implicit class EnvironmentDescriptionOps[Self <: EnvironmentDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortableOperationInProgress(value: AbortableOperationInProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortableOperationInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortableOperationInProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AbortableOperationInProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withCNAME(value: DNSCname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCNAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CNAME")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointURL(value: EndpointURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointURL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentArn(value: EnvironmentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentId(value: EnvironmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentLinks(value: EnvironmentLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withHealth(value: EnvironmentHealth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Health")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Health")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthStatus(value: EnvironmentHealthStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HealthStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformArn(value: PlatformArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: EnvironmentResourcesDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStackName(value: SolutionStackName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SolutionStackName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: EnvironmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: ConfigurationTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: EnvironmentTier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionLabel(value: VersionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(js.undefined)
        ret
    }
  }
  
}

