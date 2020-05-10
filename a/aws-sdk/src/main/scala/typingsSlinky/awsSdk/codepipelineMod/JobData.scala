package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobData extends js.Object {
  /**
    * Represents information about an action configuration.
    */
  var actionConfiguration: js.UndefOr[ActionConfiguration] = js.native
  /**
    * Represents information about an action type.
    */
  var actionTypeId: js.UndefOr[ActionTypeId] = js.native
  /**
    * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the S3 bucket used to store artifacts for the pipeline in AWS CodePipeline.
    */
  var artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.native
  /**
    * A system-generated token, such as a AWS CodeDeploy deployment ID, required by a job to continue the job asynchronously.
    */
  var continuationToken: js.UndefOr[ContinuationToken] = js.native
  /**
    * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. 
    */
  var encryptionKey: js.UndefOr[EncryptionKey] = js.native
  /**
    * The artifact supplied to the job.
    */
  var inputArtifacts: js.UndefOr[ArtifactList] = js.native
  /**
    * The output of the job.
    */
  var outputArtifacts: js.UndefOr[ArtifactList] = js.native
  /**
    * Represents information about a pipeline to a job worker.  Includes pipelineArn and pipelineExecutionId for custom jobs. 
    */
  var pipelineContext: js.UndefOr[PipelineContext] = js.native
}

object JobData {
  @scala.inline
  def apply(): JobData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobData]
  }
  @scala.inline
  implicit class JobDataOps[Self <: JobData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionConfiguration(value: ActionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withActionTypeId(value: ActionTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTypeId")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactCredentials(value: AWSSessionCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuationToken(value: ContinuationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKey(value: EncryptionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInputArtifacts(value: ArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArtifacts(value: ArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineContext(value: PipelineContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineContext")(js.undefined)
        ret
    }
  }
  
}

