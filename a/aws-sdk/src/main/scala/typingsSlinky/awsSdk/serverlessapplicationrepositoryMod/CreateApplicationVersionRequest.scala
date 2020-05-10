package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The semantic version of the new version.
    */
  var SemanticVersion: string = js.native
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.native
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
  /**
    * The raw packaged AWS SAM template of your application.
    */
  var TemplateBody: js.UndefOr[string] = js.native
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}

object CreateApplicationVersionRequest {
  @scala.inline
  def apply(ApplicationId: string, SemanticVersion: string): CreateApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionRequest]
  }
  @scala.inline
  implicit class CreateApplicationVersionRequestOps[Self <: CreateApplicationVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSemanticVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCodeArchiveUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCodeArchiveUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeArchiveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCodeArchiveUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCodeUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCodeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCodeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCodeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateUrl")(js.undefined)
        ret
    }
  }
  
}

