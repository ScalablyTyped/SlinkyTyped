package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPlaylistStatus extends StObject {
  
  /**
    * The playlist&#39;s privacy status.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}
object SchemaPlaylistStatus {
  
  @scala.inline
  def apply(): SchemaPlaylistStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistStatus]
  }
  
  @scala.inline
  implicit class SchemaPlaylistStatusMutableBuilder[Self <: SchemaPlaylistStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
  }
}
