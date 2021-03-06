package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.audio
import typingsSlinky.electron.electronStrings.unknown_
import typingsSlinky.electron.electronStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionCheckHandlerHandlerDetails extends StObject {
  
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean = js.native
  
  /**
    * The type of media access being requested, can be `video`, `audio` or `unknown`
    */
  var mediaType: video | audio | unknown_ = js.native
  
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String = js.native
  
  /**
    * The security origin of the `media` check.
    */
  var securityOrigin: String = js.native
}
object PermissionCheckHandlerHandlerDetails {
  
  @scala.inline
  def apply(
    isMainFrame: Boolean,
    mediaType: video | audio | unknown_,
    requestingUrl: String,
    securityOrigin: String
  ): PermissionCheckHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionCheckHandlerHandlerDetails]
  }
  
  @scala.inline
  implicit class PermissionCheckHandlerHandlerDetailsMutableBuilder[Self <: PermissionCheckHandlerHandlerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: video | audio | unknown_): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestingUrl(value: String): Self = StObject.set(x, "requestingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
  }
}
