package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationRequest extends js.Object {
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: string = js.native
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: string = js.native
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.native
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.native
  /**
    * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
    The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
    */
  var LicenseBody: js.UndefOr[string] = js.native
  /**
    * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your application.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
    */
  var LicenseUrl: js.UndefOr[string] = js.native
  /**
    * The name of the application that you want to publish.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: string = js.native
  /**
    * A local text readme file in Markdown language that contains a more detailed description of the application and how it works.
    The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
    */
  var ReadmeBody: js.UndefOr[string] = js.native
  /**
    * A link to the S3 object in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
    */
  var ReadmeUrl: js.UndefOr[string] = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.native
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[string] = js.native
  /**
    * The local raw packaged AWS SAM template file of your application.
    The file has the format file://&lt;path>/&lt;filename>.You can specify only one of templateBody and templateUrl; otherwise an error results.
    */
  var TemplateBody: js.UndefOr[string] = js.native
  /**
    * A link to the S3 object containing the packaged AWS SAM template of your application.You can specify only one of templateBody and templateUrl; otherwise an error results.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}

object CreateApplicationRequest {
  @scala.inline
  def apply(Author: string, Description: string, Name: string): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  @scala.inline
  implicit class CreateApplicationRequestOps[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomePageUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomePageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomePageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomePageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseBody")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReadmeBody(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadmeBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadmeBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadmeBody")(js.undefined)
        ret
    }
    @scala.inline
    def withReadmeUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadmeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadmeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadmeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSemanticVersion(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemanticVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SemanticVersion")(js.undefined)
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
    def withSpdxLicenseId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpdxLicenseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpdxLicenseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpdxLicenseId")(js.undefined)
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

