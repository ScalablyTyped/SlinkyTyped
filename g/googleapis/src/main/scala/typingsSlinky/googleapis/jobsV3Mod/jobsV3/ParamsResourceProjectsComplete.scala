package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLanguageCodesVarargs(value: String*): Self = this.set("languageCodes", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = this.set("languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCodes: Self = this.set("languageCodes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
