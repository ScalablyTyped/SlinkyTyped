package typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod

import typingsSlinky.awsLambda.anon.Pipeline
import typingsSlinky.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsSlinky.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodePipelineCloudWatchPipelineEvent extends CodePipelineCloudWatchEvent {
  
  var account: String = js.native
  
  var detail: Pipeline = js.native
  
  var `detail-type`: `CodePipeline Pipeline Execution State Change` = js.native
  
  var id: String = js.native
  
  var region: String = js.native
  
  var resources: js.Array[String] = js.native
  
  var source: awsDotcodepipeline = js.native
  
  var time: String = js.native
  
  var version: String = js.native
}
object CodePipelineCloudWatchPipelineEvent {
  
  @scala.inline
  def apply(
    account: String,
    detail: Pipeline,
    `detail-type`: `CodePipeline Pipeline Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchPipelineEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchPipelineEvent]
  }
  
  @scala.inline
  implicit class CodePipelineCloudWatchPipelineEventOps[Self <: CodePipelineCloudWatchPipelineEvent] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Pipeline): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDetail-type`(value: `CodePipeline Pipeline Execution State Change`): Self = this.set("detail-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: awsDotcodepipeline): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
