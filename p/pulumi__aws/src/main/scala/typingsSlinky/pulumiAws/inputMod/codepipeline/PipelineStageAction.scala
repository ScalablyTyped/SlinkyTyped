package typingsSlinky.pulumiAws.inputMod.codepipeline

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineStageAction extends js.Object {
  
  /**
    * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
    */
  var category: Input[String] = js.native
  
  /**
    * A map of the action declaration's configuration. Configurations options for action types and providers can be found in the [Pipeline Structure Reference](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements) and [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
    */
  var configuration: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A list of artifact names to be worked on.
    */
  var inputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The action declaration's name.
    */
  var name: Input[String] = js.native
  
  /**
    * The namespace all output variables will be accessed from.
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of artifact names to output. Output artifact names must be unique within a pipeline.
    */
  var outputArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
    */
  var owner: Input[String] = js.native
  
  /**
    * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy.
    */
  var provider: Input[String] = js.native
  
  /**
    * The region in which to run the action.
    */
  var region: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The order in which actions are run.
    */
  var runOrder: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A string that identifies the action type.
    */
  var version: Input[String] = js.native
}
object PipelineStageAction {
  
  @scala.inline
  def apply(
    category: Input[String],
    name: Input[String],
    owner: Input[String],
    provider: Input[String],
    version: Input[String]
  ): PipelineStageAction = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineStageAction]
  }
  
  @scala.inline
  implicit class PipelineStageActionOps[Self <: PipelineStageAction] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: Input[String]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Input[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: Input[String]): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: Input[StringDictionary[Input[String]]]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setInputArtifactsVarargs(value: Input[String]*): Self = this.set("inputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setInputArtifacts(value: Input[js.Array[Input[String]]]): Self = this.set("inputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputArtifacts: Self = this.set("inputArtifacts", js.undefined)
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOutputArtifactsVarargs(value: Input[String]*): Self = this.set("outputArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setOutputArtifacts(value: Input[js.Array[Input[String]]]): Self = this.set("outputArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputArtifacts: Self = this.set("outputArtifacts", js.undefined)
    
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setRunOrder(value: Input[Double]): Self = this.set("runOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOrder: Self = this.set("runOrder", js.undefined)
  }
}
