package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsComplete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional.  If provided, restricts completion to specified company.  The
    * format is "projects/{project_id}/companies/{company_id}", for example,
    * "projects/api-test-project/companies/foo".
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use language_codes instead.  Optional.  The language of the
    * query. This is the BCP-47 language code, such as "en-US" or "sr-Latn".
    * For more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with the same language_code
    * are returned.  For CompletionType.COMPANY_NAME type, only companies
    * having open jobs with the same language_code are returned.  For
    * CompletionType.COMBINED type, only open jobs with the same language_code
    * or companies having open jobs with the same language_code are returned.
    * The maximum number of allowed characters is 255.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional.  The list of languages of the query. This is the BCP-47
    * language code, such as "en-US" or "sr-Latn". For more information, see
    * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with the same
    * language_codes are returned.  For CompletionType.COMPANY_NAME type, only
    * companies having open jobs with the same language_codes are returned. For
    * CompletionType.COMBINED type, only open jobs with the same language_codes
    * or companies having open jobs with the same language_codes are returned.
    * The maximum number of allowed characters is 255.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required.  Resource name of project the completion is performed within.
    * The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required.  Completion result count.  The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Required.  The query used to generate suggestions.  The maximum number of
    * allowed characters is 255.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Optional.  The scope of the completion. The defaults is
    * CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Optional.  The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsComplete {
  @scala.inline
  def apply(): ParamsResourceProjectsComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsComplete]
  }
  @scala.inline
  implicit class ParamsResourceProjectsCompleteOps[Self <: ParamsResourceProjectsComplete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

