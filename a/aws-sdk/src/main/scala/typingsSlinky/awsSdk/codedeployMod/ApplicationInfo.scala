package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
  /**
    * The application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.native
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * The destination platform type for deployment of the application (Lambda or Server).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The time at which the application was created.
    */
  var createTime: js.UndefOr[js.Date] = js.native
  /**
    * The name for a connection to a GitHub account.
    */
  var gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.native
  /**
    * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
    */
  var linkedToGitHub: js.UndefOr[Boolean] = js.native
}

object ApplicationInfo {
  @scala.inline
  def apply(): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInfo]
  }
  @scala.inline
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: ApplicationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withComputePlatform(value: ComputePlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputePlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computePlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGitHubAccountName(value: GitHubAccountTokenName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHubAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitHubAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHubAccountName")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedToGitHub(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedToGitHub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedToGitHub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedToGitHub")(js.undefined)
        ret
    }
  }
  
}

