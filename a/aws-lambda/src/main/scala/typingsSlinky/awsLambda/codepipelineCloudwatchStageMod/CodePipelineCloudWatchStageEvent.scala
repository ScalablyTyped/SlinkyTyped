package typingsSlinky.awsLambda.codepipelineCloudwatchStageMod

import typingsSlinky.awsLambda.anon.Stage
import typingsSlinky.awsLambda.awsLambdaStrings.`CodePipeline Stage Execution State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsSlinky.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePipelineCloudWatchStageEvent extends CodePipelineCloudWatchEvent {
  var account: String = js.native
  var detail: Stage = js.native
  var `detail-type`: `CodePipeline Stage Execution State Change` = js.native
  var id: String = js.native
  var region: String = js.native
  var resources: js.Array[String] = js.native
  var source: awsDotcodepipeline = js.native
  var time: String = js.native
  var version: String = js.native
}

object CodePipelineCloudWatchStageEvent {
  @scala.inline
  def apply(
    account: String,
    detail: Stage,
    `detail-type`: `CodePipeline Stage Execution State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodepipeline,
    time: String,
    version: String
  ): CodePipelineCloudWatchStageEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePipelineCloudWatchStageEvent]
  }
  @scala.inline
  implicit class CodePipelineCloudWatchStageEventOps[Self <: CodePipelineCloudWatchStageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: Stage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDetail-type`(value: `CodePipeline Stage Execution State Change`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: awsDotcodepipeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

