package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionInfo extends js.Object {
  /**
    *  The version of a Lambda function that production traffic points to. 
    */
  var currentVersion: js.UndefOr[Version] = js.native
  /**
    *  The alias of a Lambda function. For more information, see Introduction to AWS Lambda Aliases. 
    */
  var functionAlias: js.UndefOr[LambdaFunctionAlias] = js.native
  /**
    *  The name of a Lambda function. 
    */
  var functionName: js.UndefOr[LambdaFunctionName] = js.native
  /**
    *  The version of a Lambda function that production traffic points to after the Lambda function is deployed. 
    */
  var targetVersion: js.UndefOr[Version] = js.native
  /**
    *  The percentage of production traffic that the target version of a Lambda function receives. 
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.native
}

object LambdaFunctionInfo {
  @scala.inline
  def apply(): LambdaFunctionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionInfo]
  }
  @scala.inline
  implicit class LambdaFunctionInfoOps[Self <: LambdaFunctionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionAlias(value: LambdaFunctionAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: LambdaFunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetVersionWeight(value: TrafficWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersionWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetVersionWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersionWeight")(js.undefined)
        ret
    }
  }
  
}

