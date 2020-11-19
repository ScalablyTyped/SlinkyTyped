package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.handlerMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-lambda/trigger/codepipeline-cloudwatch", JSImport.Namespace)
@js.native
object codepipelineCloudwatchMod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
    - typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
    - typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
  */
  trait CodePipelineCloudWatchEvent extends js.Object
  
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
}
