package typingsSlinky.reactNativeFbsdk.mod

import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.link
import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import typingsSlinky.reactNativeFbsdk.reactNativeFbsdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeFbsdk.mod.ShareLinkContent
  - typingsSlinky.reactNativeFbsdk.mod.SharePhotoContent
  - typingsSlinky.reactNativeFbsdk.mod.ShareVideoContent
  - typingsSlinky.reactNativeFbsdk.mod.ShareOpenGraphContent
*/
trait ShareContent extends StObject
object ShareContent {
  
  @scala.inline
  def ShareLinkContent(contentType: link, contentUrl: String): typingsSlinky.reactNativeFbsdk.mod.ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeFbsdk.mod.ShareLinkContent]
  }
  
  @scala.inline
  def ShareOpenGraphContent(action: ShareOpenGraphAction, contentType: `open-graph`, previewPropertyName: String): typingsSlinky.reactNativeFbsdk.mod.ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeFbsdk.mod.ShareOpenGraphContent]
  }
  
  @scala.inline
  def SharePhotoContent(contentType: photo, photos: js.Array[SharePhoto]): typingsSlinky.reactNativeFbsdk.mod.SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeFbsdk.mod.SharePhotoContent]
  }
  
  @scala.inline
  def ShareVideoContent(contentType: video, video: ShareVideo): typingsSlinky.reactNativeFbsdk.mod.ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNativeFbsdk.mod.ShareVideoContent]
  }
}
