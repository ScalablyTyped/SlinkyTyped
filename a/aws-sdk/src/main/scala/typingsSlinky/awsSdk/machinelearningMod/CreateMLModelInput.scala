package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMLModelInput extends js.Object {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel.
    */
  var MLModelId: EntityId = js.native
  
  /**
    * A user-supplied name or description of the MLModel.
    */
  var MLModelName: js.UndefOr[EntityName] = js.native
  
  /**
    * The category of supervised learning that this MLModel will address. Choose from the following types:  Choose REGRESSION if the MLModel will be used to predict a numeric value. Choose BINARY if the MLModel result has two possible values. Choose MULTICLASS if the MLModel result has a limited number of values.    For more information, see the Amazon Machine Learning Developer Guide.
    */
  var MLModelType: typingsSlinky.awsSdk.machinelearningMod.MLModelType = js.native
  
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10.  sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none. We strongly recommend that you shuffle your data.   sgd.l1RegularizationAmount - The coefficient regularization L1 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var Parameters: js.UndefOr[TrainingParameters] = js.native
  
  /**
    * The data recipe for creating the MLModel. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML creates a default.
    */
  var Recipe: js.UndefOr[typingsSlinky.awsSdk.machinelearningMod.Recipe] = js.native
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) location and file name that contains the MLModel recipe. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML creates a default.
    */
  var RecipeUri: js.UndefOr[S3Url] = js.native
  
  /**
    * The DataSource that points to the training data.
    */
  var TrainingDataSourceId: EntityId = js.native
}
object CreateMLModelInput {
  
  @scala.inline
  def apply(MLModelId: EntityId, MLModelType: MLModelType, TrainingDataSourceId: EntityId): CreateMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any], MLModelType = MLModelType.asInstanceOf[js.Any], TrainingDataSourceId = TrainingDataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMLModelInput]
  }
  
  @scala.inline
  implicit class CreateMLModelInputOps[Self <: CreateMLModelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelType(value: MLModelType): Self = this.set("MLModelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingDataSourceId(value: EntityId): Self = this.set("TrainingDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMLModelName(value: EntityName): Self = this.set("MLModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMLModelName: Self = this.set("MLModelName", js.undefined)
    
    @scala.inline
    def setParameters(value: TrainingParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setRecipe(value: Recipe): Self = this.set("Recipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipe: Self = this.set("Recipe", js.undefined)
    
    @scala.inline
    def setRecipeUri(value: S3Url): Self = this.set("RecipeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeUri: Self = this.set("RecipeUri", js.undefined)
  }
}
