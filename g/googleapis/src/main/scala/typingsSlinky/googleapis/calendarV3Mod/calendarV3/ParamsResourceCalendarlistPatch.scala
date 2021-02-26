package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCalendarlistPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list
    * method. If you want to access the primary calendar of the currently
    * logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.native
  
  /**
    * Whether to use the foregroundColor and backgroundColor fields to write
    * the calendar colors (RGB). If this feature is used, the index-based
    * colorId field will be set to the best matching option automatically.
    * Optional. The default is False.
    */
  var colorRgbFormat: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCalendarListEntry] = js.native
}
object ParamsResourceCalendarlistPatch {
  
  @scala.inline
  def apply(): ParamsResourceCalendarlistPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCalendarlistPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceCalendarlistPatchMutableBuilder[Self <: ParamsResourceCalendarlistPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    @scala.inline
    def setColorRgbFormat(value: Boolean): Self = StObject.set(x, "colorRgbFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRgbFormatUndefined: Self = StObject.set(x, "colorRgbFormat", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCalendarListEntry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
