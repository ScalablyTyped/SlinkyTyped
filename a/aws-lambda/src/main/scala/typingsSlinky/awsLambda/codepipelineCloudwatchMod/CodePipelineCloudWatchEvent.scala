package typingsSlinky.awsLambda.codepipelineCloudwatchMod

import typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
import typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
import typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineCloudWatchPipelineEvent
  - typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineCloudWatchStageEvent
  - typingsSlinky.awsLambda.codepipelineCloudwatchActionMod.CodePipelineCloudWatchActionEvent
*/
trait CodePipelineCloudWatchEvent extends js.Object

object CodePipelineCloudWatchEvent {
  @scala.inline
  implicit def apply(value: CodePipelineCloudWatchActionEvent): CodePipelineCloudWatchEvent = value.asInstanceOf[CodePipelineCloudWatchEvent]
  @scala.inline
  implicit def apply(value: CodePipelineCloudWatchPipelineEvent): CodePipelineCloudWatchEvent = value.asInstanceOf[CodePipelineCloudWatchEvent]
  @scala.inline
  implicit def apply(value: CodePipelineCloudWatchStageEvent): CodePipelineCloudWatchEvent = value.asInstanceOf[CodePipelineCloudWatchEvent]
}

