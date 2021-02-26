package typingsSlinky.playable.anon

import typingsSlinky.playable.previewServiceTypesMod.IPreviewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewServiceIPreviewService extends StObject {
  
  var previewService: IPreviewService = js.native
}
object PreviewServiceIPreviewService {
  
  @scala.inline
  def apply(previewService: IPreviewService): PreviewServiceIPreviewService = {
    val __obj = js.Dynamic.literal(previewService = previewService.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewServiceIPreviewService]
  }
  
  @scala.inline
  implicit class PreviewServiceIPreviewServiceMutableBuilder[Self <: PreviewServiceIPreviewService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviewService(value: IPreviewService): Self = StObject.set(x, "previewService", value.asInstanceOf[js.Any])
  }
}
