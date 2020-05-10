package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterJobDefinitionRequest extends js.Object {
  /**
    * An object with various properties specific to single-node container-based jobs. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
    */
  var containerProperties: js.UndefOr[ContainerProperties] = js.native
  /**
    * The name of the job definition to register. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
    */
  var jobDefinitionName: String = js.native
  /**
    * An object with various properties specific to multi-node parallel jobs. If you specify node properties for a job, it becomes a multi-node parallel job. For more information, see Multi-node Parallel Jobs in the AWS Batch User Guide. If the job definition's type parameter is container, then you must specify either containerProperties or nodeProperties.
    */
  var nodeProperties: js.UndefOr[NodeProperties] = js.native
  /**
    * Default parameter substitution placeholders to set in the job definition. Parameters are specified as a key-value pair mapping. Parameters in a SubmitJob request override any corresponding parameter defaults from the job definition.
    */
  var parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The retry strategy to use for failed jobs that are submitted with this job definition. Any retry strategy that is specified during a SubmitJob operation overrides the retry strategy defined here. If a job is terminated due to a timeout, it is not retried.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  /**
    * The timeout configuration for jobs that are submitted with this job definition, after which AWS Batch terminates your jobs if they have not finished. If a job is terminated due to a timeout, it is not retried. The minimum value for the timeout is 60 seconds. Any timeout configuration that is specified during a SubmitJob operation overrides the timeout configuration defined here. For more information, see Job Timeouts in the Amazon Elastic Container Service Developer Guide.
    */
  var timeout: js.UndefOr[JobTimeout] = js.native
  /**
    * The type of job definition.
    */
  var `type`: JobDefinitionType = js.native
}

object RegisterJobDefinitionRequest {
  @scala.inline
  def apply(jobDefinitionName: String, `type`: JobDefinitionType): RegisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinitionName = jobDefinitionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterJobDefinitionRequest]
  }
  @scala.inline
  implicit class RegisterJobDefinitionRequestOps[Self <: RegisterJobDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobDefinitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: JobDefinitionType): Self = {
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

