package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceDescription extends js.Object {
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS services that the flow uses.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.native
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  /**
    * The Amazon Simple Storage Service bucket where information about a system instance is stored.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * An object that contains summary information about a system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
  /**
    * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a system instance.
    */
  var validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.native
  /**
    * The version of the user's namespace against which the system instance was validated.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}

object SystemInstanceDescription {
  @scala.inline
  def apply(): SystemInstanceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceDescription]
  }
  @scala.inline
  implicit class SystemInstanceDescriptionOps[Self <: SystemInstanceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: DefinitionDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowActionsRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowActionsRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowActionsRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowActionsRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsConfiguration(value: MetricsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withS3BucketName(value: S3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3BucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: SystemInstanceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatedDependencyRevisions(value: DependencyRevisions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedDependencyRevisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatedDependencyRevisions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedDependencyRevisions")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatedNamespaceVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedNamespaceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatedNamespaceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatedNamespaceVersion")(js.undefined)
        ret
    }
  }
  
}

