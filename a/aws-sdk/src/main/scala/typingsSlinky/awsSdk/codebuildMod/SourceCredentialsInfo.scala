package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceCredentialsInfo extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN. 
    */
  var authType: js.UndefOr[AuthType] = js.native
  /**
    *  The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET. 
    */
  var serverType: js.UndefOr[ServerType] = js.native
}

object SourceCredentialsInfo {
  @scala.inline
  def apply(): SourceCredentialsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCredentialsInfo]
  }
  @scala.inline
  implicit class SourceCredentialsInfoOps[Self <: SourceCredentialsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthType(value: AuthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authType")(js.undefined)
        ret
    }
    @scala.inline
    def withServerType(value: ServerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverType")(js.undefined)
        ret
    }
  }
  
}

