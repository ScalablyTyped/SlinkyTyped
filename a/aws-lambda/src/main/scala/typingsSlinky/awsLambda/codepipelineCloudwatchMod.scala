package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.Executionid
import typingsSlinky.awsLambda.anon.Pipeline
import typingsSlinky.awsLambda.anon.Stage
import typingsSlinky.awsLambda.awsLambdaStrings.`CodePipeline Action Execution State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.`CodePipeline Stage Execution State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineCloudwatchMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
    - typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
    - typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
  */
  trait CodePipelineCloudWatchEvent extends StObject
  object CodePipelineCloudWatchEvent {
    
    @scala.inline
    def CodePipelineCloudWatchActionEvent(
      account: String,
      detail: Executionid,
      `detail-type`: `CodePipeline Action Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent]
    }
    
    @scala.inline
    def CodePipelineCloudWatchPipelineEvent(
      account: String,
      detail: Pipeline,
      `detail-type`: `CodePipeline Pipeline Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent]
    }
    
    @scala.inline
    def CodePipelineCloudWatchStageEvent(
      account: String,
      detail: Stage,
      `detail-type`: `CodePipeline Stage Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent]
    }
  }
  
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
}
