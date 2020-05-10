package typingsSlinky.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toolchain extends js.Object {
  /**
    * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS CodeStar retrieves the file during project creation.
    */
  var source: ToolchainSource = js.native
  /**
    * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
    */
  var stackParameters: js.UndefOr[TemplateParameterMap] = js.native
}

object Toolchain {
  @scala.inline
  def apply(source: ToolchainSource): Toolchain = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toolchain]
  }
  @scala.inline
  implicit class ToolchainOps[Self <: Toolchain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: ToolchainSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStackParameters(value: TemplateParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackParameters")(js.undefined)
        ret
    }
  }
  
}

