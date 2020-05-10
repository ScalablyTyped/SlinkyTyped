package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformJobDefinition extends js.Object {
  /**
    * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
    */
  var BatchStrategy: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.BatchStrategy] = js.native
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxConcurrentTransforms] = js.native
  /**
    * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
    */
  var MaxPayloadInMB: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxPayloadInMB] = js.native
  /**
    * A description of the input source and the way the transform job consumes it.
    */
  var TransformInput: typingsSlinky.awsSdk.sagemakerMod.TransformInput = js.native
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: typingsSlinky.awsSdk.sagemakerMod.TransformOutput = js.native
  /**
    * Identifies the ML compute instances for the transform job.
    */
  var TransformResources: typingsSlinky.awsSdk.sagemakerMod.TransformResources = js.native
}

object TransformJobDefinition {
  @scala.inline
  def apply(
    TransformInput: TransformInput,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobDefinition]
  }
  @scala.inline
  implicit class TransformJobDefinitionOps[Self <: TransformJobDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformInput(value: TransformInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformOutput(value: TransformOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformResources(value: TransformResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchStrategy(value: BatchStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: TransformEnvironmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrentTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxConcurrentTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPayloadInMB(value: MaxPayloadInMB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPayloadInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPayloadInMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPayloadInMB")(js.undefined)
        ret
    }
  }
  
}

