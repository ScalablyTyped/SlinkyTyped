package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectImportExportMod {
  
  @JSImport("gitlab/dist/types/core/services/ProjectImportExport", "ProjectImportExport")
  @js.native
  class ProjectImportExport () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def download(projectId: String): js.Promise[GetResponse] = js.native
    def download(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def download(projectId: Double): js.Promise[GetResponse] = js.native
    def download(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def exportStatus(projectId: String): js.Promise[GetResponse] = js.native
    def exportStatus(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def exportStatus(projectId: Double): js.Promise[GetResponse] = js.native
    def exportStatus(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def `import`(content: String, path: String): js.Promise[js.Object] = js.native
    def `import`(content: String, path: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def importStatus(projectId: String): js.Promise[GetResponse] = js.native
    def importStatus(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def importStatus(projectId: Double): js.Promise[GetResponse] = js.native
    def importStatus(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def schedule(projectId: String): js.Promise[js.Object] = js.native
    def schedule(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def schedule(projectId: Double): js.Promise[js.Object] = js.native
    def schedule(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
  
  @js.native
  trait UploadMetadata extends StObject {
    
    var contentType: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
  }
  object UploadMetadata {
    
    @scala.inline
    def apply(): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadMetadata]
    }
    
    @scala.inline
    implicit class UploadMetadataMutableBuilder[Self <: UploadMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
}
