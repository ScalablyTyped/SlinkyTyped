package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinition extends js.Object {
  /**
    * An object with various properties specific to container-based jobs.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.native
  /**
    * The Amazon Resource Name (ARN) for the job definition.
    */
  var jobDefinitionArn: String = js.native
  /**
    * The name of the job definition.
    */
  var jobDefinitionName: String = js.native
  /**
    * An object with various properties specific to multi-node parallel jobs.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  /**
    * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition. For more information about specifying parameters, see Job Definition Parameters in the AWS Batch User Guide.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  /**
    * The revision of the job definition.
    */
  var revision: Integer = js.native
  /**
    * The status of the job definition.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The timeout configuration for jobs that are submitted with this job definition. You can specify a timeout duration after which AWS Batch terminates your jobs if they have not finished.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
  /**
    * The type of job definition.
    */
  var `type`: String = js.native
}

object JobDefinition {
  @scala.inline
  def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Integer, `type`: String): JobDefinition = {
    val __obj = js.Dynamic.literal(jobDefinitionArn = jobDefinitionArn.asInstanceOf[js.Any], jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinition]
  }
  @scala.inline
  implicit class JobDefinitionOps[Self <: JobDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobDefinitionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerProperties(value: ContainerProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeProperties(value: NodeProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryStrategy(value: RetryStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(js.undefined)
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
    def withTimeout(value: JobTimeout): Self = {
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
  }
  
}

