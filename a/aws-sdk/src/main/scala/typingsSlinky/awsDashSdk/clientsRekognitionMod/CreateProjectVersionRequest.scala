package typingsSlinky.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectVersionRequest extends js.Object {
  /**
    * The Amazon S3 location to store the results of training.
    */
  var OutputConfig: typingsSlinky.awsDashSdk.clientsRekognitionMod.OutputConfig = js.native
  /**
    * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
    */
  var ProjectArn: typingsSlinky.awsDashSdk.clientsRekognitionMod.ProjectArn = js.native
  /**
    * The dataset to use for testing.
    */
  var TestingData: typingsSlinky.awsDashSdk.clientsRekognitionMod.TestingData = js.native
  /**
    * The dataset to use for training. 
    */
  var TrainingData: typingsSlinky.awsDashSdk.clientsRekognitionMod.TrainingData = js.native
  /**
    * A name for the version of the model. This value must be unique.
    */
  var VersionName: typingsSlinky.awsDashSdk.clientsRekognitionMod.VersionName = js.native
}

object CreateProjectVersionRequest {
  @scala.inline
  def apply(
    OutputConfig: OutputConfig,
    ProjectArn: ProjectArn,
    TestingData: TestingData,
    TrainingData: TrainingData,
    VersionName: VersionName
  ): CreateProjectVersionRequest = {
    val __obj = js.Dynamic.literal(OutputConfig = OutputConfig.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any], TestingData = TestingData.asInstanceOf[js.Any], TrainingData = TrainingData.asInstanceOf[js.Any], VersionName = VersionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProjectVersionRequest]
  }
}

