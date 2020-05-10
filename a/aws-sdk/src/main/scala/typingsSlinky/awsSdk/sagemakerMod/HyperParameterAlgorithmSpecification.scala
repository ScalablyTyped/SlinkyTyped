package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterAlgorithmSpecification extends js.Object {
  /**
    * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this parameter, do not specify a value for TrainingImage.
    */
  var AlgorithmName: js.UndefOr[ArnOrName] = js.native
  /**
    * An array of MetricDefinition objects that specify the metrics that the algorithm emits.
    */
  var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.native
  /**
    *  The registry path of the Docker image that contains the training algorithm. For information about Docker registry paths for built-in algorithms, see Algorithms Provided by Amazon SageMaker: Common Parameters. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var TrainingImage: js.UndefOr[AlgorithmImage] = js.native
  /**
    * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data directly from Amazon S3 to the container.  If you specify File mode, make sure that you provision the storage volume that is attached to the training instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts, and intermediate information.  For more information about input modes, see Algorithms. 
    */
  var TrainingInputMode: typingsSlinky.awsSdk.sagemakerMod.TrainingInputMode = js.native
}

object HyperParameterAlgorithmSpecification {
  @scala.inline
  def apply(TrainingInputMode: TrainingInputMode): HyperParameterAlgorithmSpecification = {
    val __obj = js.Dynamic.literal(TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterAlgorithmSpecification]
  }
  @scala.inline
  implicit class HyperParameterAlgorithmSpecificationOps[Self <: HyperParameterAlgorithmSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrainingInputMode(value: TrainingInputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingInputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgorithmName(value: ArnOrName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricDefinitions(value: MetricDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingImage(value: AlgorithmImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrainingImage")(js.undefined)
        ret
    }
  }
  
}

