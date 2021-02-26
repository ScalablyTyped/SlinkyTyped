package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSeriesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceSeriesGet {
  
  @scala.inline
  def apply(): ParamsResourceSeriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSeriesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSeriesGetMutableBuilder[Self <: ParamsResourceSeriesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setSeries_id(value: js.Array[String]): Self = StObject.set(x, "series_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries_idUndefined: Self = StObject.set(x, "series_id", js.undefined)
    
    @scala.inline
    def setSeries_idVarargs(value: String*): Self = StObject.set(x, "series_id", js.Array(value :_*))
  }
}
