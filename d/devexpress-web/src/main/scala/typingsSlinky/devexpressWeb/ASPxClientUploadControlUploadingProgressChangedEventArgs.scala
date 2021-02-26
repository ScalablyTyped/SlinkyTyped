package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.UploadingProgressChanged event.
  */
@js.native
trait ASPxClientUploadControlUploadingProgressChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the content length of the currently uploaded file.
    */
  var currentFileContentLength: Double = js.native
  
  /**
    * Gets the name of the file being currently uploaded.
    */
  var currentFileName: String = js.native
  
  /**
    * Gets the position of the current file upload progress.
    */
  var currentFileProgress: Double = js.native
  
  /**
    * Gets the content length of the current file already uploaded to the server.
    */
  var currentFileUploadedContentLength: Double = js.native
  
  /**
    * Gets the number of the files selected for upload.
    */
  var fileCount: Double = js.native
  
  /**
    * Gets the current position of total upload progress.
    */
  var progress: Double = js.native
  
  /**
    * Gets the content length of the files selected for upload.
    */
  var totalContentLength: Double = js.native
  
  /**
    * Gets the content length of the files already uploaded to the server.
    */
  var uploadedContentLength: Double = js.native
}
object ASPxClientUploadControlUploadingProgressChangedEventArgs {
  
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): ASPxClientUploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlUploadingProgressChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlUploadingProgressChangedEventArgsMutableBuilder[Self <: ASPxClientUploadControlUploadingProgressChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentFileContentLength(value: Double): Self = StObject.set(x, "currentFileContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileName(value: String): Self = StObject.set(x, "currentFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileProgress(value: Double): Self = StObject.set(x, "currentFileProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileUploadedContentLength(value: Double): Self = StObject.set(x, "currentFileUploadedContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalContentLength(value: Double): Self = StObject.set(x, "totalContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedContentLength(value: Double): Self = StObject.set(x, "uploadedContentLength", value.asInstanceOf[js.Any])
  }
}
