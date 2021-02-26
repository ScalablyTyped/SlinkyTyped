package typingsSlinky.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentCardNoPreviewOptions extends StObject {
  
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor] = js.native
  
  var description: String = js.native
  
  var fileIconImageUrl: String = js.native
  
  var foldColor: js.UndefOr[String] = js.native
  
  var iconThumbnailUrl: String = js.native
  
  def previewOnClick(event: PreviewClickEvent): Unit = js.native
  
  var previewUrl: String = js.native
  
  var title: String = js.native
}
object AttachmentCardNoPreviewOptions {
  
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    fileIconImageUrl: String,
    iconThumbnailUrl: String,
    previewOnClick: PreviewClickEvent => Unit,
    previewUrl: String,
    title: String
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], iconThumbnailUrl = iconThumbnailUrl.asInstanceOf[js.Any], previewOnClick = js.Any.fromFunction1(previewOnClick), previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
  
  @scala.inline
  implicit class AttachmentCardNoPreviewOptionsMutableBuilder[Self <: AttachmentCardNoPreviewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: (DownloadButtonDescriptor | CustomButtonDescriptor)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIconImageUrl(value: String): Self = StObject.set(x, "fileIconImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldColor(value: String): Self = StObject.set(x, "foldColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldColorUndefined: Self = StObject.set(x, "foldColor", js.undefined)
    
    @scala.inline
    def setIconThumbnailUrl(value: String): Self = StObject.set(x, "iconThumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewOnClick(value: PreviewClickEvent => Unit): Self = StObject.set(x, "previewOnClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
