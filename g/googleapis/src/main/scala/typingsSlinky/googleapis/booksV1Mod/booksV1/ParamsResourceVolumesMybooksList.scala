package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceVolumesMybooksList extends StandardParameters {
  
  /**
    * How the book was acquired
    */
  var acquireMethod: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ISO-3166-1 code to override the IP-based location.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * ISO-639-1 language and ISO-3166-1 country code. Ex:'en_US'. Used for
    * generating recommendations.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The processing state of the user uploaded volumes to be returned.
    * Applicable only if the UPLOADED is specified in the acquireMethod.
    */
  var processingState: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Index of the first result to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.native
}
object ParamsResourceVolumesMybooksList {
  
  @scala.inline
  def apply(): ParamsResourceVolumesMybooksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVolumesMybooksList]
  }
  
  @scala.inline
  implicit class ParamsResourceVolumesMybooksListOps[Self <: ParamsResourceVolumesMybooksList] (val x: Self) extends AnyVal {
    
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
    def setAcquireMethodVarargs(value: String*): Self = this.set("acquireMethod", js.Array(value :_*))
    
    @scala.inline
    def setAcquireMethod(value: js.Array[String]): Self = this.set("acquireMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquireMethod: Self = this.set("acquireMethod", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setProcessingStateVarargs(value: String*): Self = this.set("processingState", js.Array(value :_*))
    
    @scala.inline
    def setProcessingState(value: js.Array[String]): Self = this.set("processingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingState: Self = this.set("processingState", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
