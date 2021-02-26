package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUpload extends BulkUpload[FileUpload] {
  
  @JSName("apply")
  def apply(): Unit = js.native
}
object FileUpload {
  
  @scala.inline
  def apply(
    apply: () => Unit,
    forCampaignManagement: () => FileUpload,
    forOfflineConversions: () => FileUpload,
    preview: () => Unit,
    setFileName: String => FileUpload
  ): FileUpload = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[FileUpload]
  }
  
  @scala.inline
  implicit class FileUploadMutableBuilder[Self <: FileUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
  }
}
