package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionLocation extends js.Object {
  /**
    *  The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML and stored as a RawString. 
    */
  var appSpecContent: js.UndefOr[AppSpecContent] = js.native
  /**
    * Information about the location of application artifacts stored in GitHub.
    */
  var gitHubLocation: js.UndefOr[GitHubLocation] = js.native
  /**
    * The type of application revision:   S3: An application revision stored in Amazon S3.   GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).   String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).  
    */
  var revisionType: js.UndefOr[RevisionLocationType] = js.native
  /**
    * Information about the location of a revision stored in Amazon S3. 
    */
  var s3Location: js.UndefOr[S3Location] = js.native
  /**
    * Information about the location of an AWS Lambda deployment revision stored as a RawString.
    */
  var string: js.UndefOr[RawString] = js.native
}

object RevisionLocation {
  @scala.inline
  def apply(): RevisionLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionLocation]
  }
  @scala.inline
  implicit class RevisionLocationOps[Self <: RevisionLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppSpecContent(value: AppSpecContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSpecContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppSpecContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSpecContent")(js.undefined)
        ret
    }
    @scala.inline
    def withGitHubLocation(value: GitHubLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHubLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitHubLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHubLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionType(value: RevisionLocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionType")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Location(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Location: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Location")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: RawString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

