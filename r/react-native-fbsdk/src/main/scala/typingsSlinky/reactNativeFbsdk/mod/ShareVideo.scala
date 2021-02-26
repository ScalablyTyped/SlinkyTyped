package typingsSlinky.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareVideo extends StObject {
  
  /**
    * The URL to the video. Must point to the location of the video on disk.
    */
  var localUrl: String = js.native
}
object ShareVideo {
  
  @scala.inline
  def apply(localUrl: String): ShareVideo = {
    val __obj = js.Dynamic.literal(localUrl = localUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareVideo]
  }
  
  @scala.inline
  implicit class ShareVideoMutableBuilder[Self <: ShareVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalUrl(value: String): Self = StObject.set(x, "localUrl", value.asInstanceOf[js.Any])
  }
}
