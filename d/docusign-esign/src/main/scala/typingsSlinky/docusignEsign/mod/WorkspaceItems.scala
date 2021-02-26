package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceItems extends StObject {
  
  /**
    * An object that describes the caller's workspace permissions.
    */
  var callerAuthorization: js.UndefOr[
    /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
  ] = js.native
  
  /**
    * If the item is a file, this property specifies the content type of the file.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the workspace item was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who created the workspace item.
    */
  var createdById: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who created the workspace item.
    */
  var createdByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * The file extension of a file item.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * The size of the file in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the file.
    */
  var fileUri: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace item.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *  When **true**, the item is public.
    */
  var isPublic: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime that the item was last modified.
    */
  var lastModified: js.UndefOr[String] = js.native
  
  /**
    * The id of the user who last modified the item.
    */
  var lastModifiedById: js.UndefOr[String] = js.native
  
  /**
    * Details about the user who last modified the workspace item.
    */
  var lastModifiedByInformation: js.UndefOr[
    /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
  ] = js.native
  
  /**
    * The name of the file or folder.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The number of pages in a file.
    */
  var pageCount: js.UndefOr[String] = js.native
  
  /**
    * The id of the parent folder, or the special value `root` for the root folder.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * The URI of the parent folder.
    */
  var parentFolderUri: js.UndefOr[String] = js.native
  
  /**
    * A 64-byte, Secure Hash Algorithm 256 (SHA256) checksum that the caller computes across the entirety of the original content of a file.
    * DocuSign compares this value to its own computation. If the two values are not equal, the original content and received content are not the same and the upload is refused.
    */
  var sha256: js.UndefOr[String] = js.native
  
  /**
    * The height of the thumbnail image.
    */
  var thumbHeight: js.UndefOr[String] = js.native
  
  /**
    * The width of the thumbnail image.
    */
  var thumbWidth: js.UndefOr[String] = js.native
  
  var thumbnail: js.UndefOr[/* Description of a page of a document. */ Page] = js.native
  
  /**
    * The type of workspace item. Valid values are:
    *
    * - `file`
    * - `folder`
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * An object that describes the user's workspace permissions.
    */
  var userAuthorization: js.UndefOr[
    /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
  ] = js.native
}
object WorkspaceItems {
  
  @scala.inline
  def apply(): WorkspaceItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceItems]
  }
  
  @scala.inline
  implicit class WorkspaceItemsMutableBuilder[Self <: WorkspaceItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerAuthorization(
      value: /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
    ): Self = StObject.set(x, "callerAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerAuthorizationUndefined: Self = StObject.set(x, "callerAuthorization", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedById(value: String): Self = StObject.set(x, "createdById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByIdUndefined: Self = StObject.set(x, "createdById", js.undefined)
    
    @scala.inline
    def setCreatedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "createdByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByInformationUndefined: Self = StObject.set(x, "createdByInformation", js.undefined)
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    @scala.inline
    def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsPublic(value: String): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "isPublic", js.undefined)
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedById(value: String): Self = StObject.set(x, "lastModifiedById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByIdUndefined: Self = StObject.set(x, "lastModifiedById", js.undefined)
    
    @scala.inline
    def setLastModifiedByInformation(
      value: /* This object represents the workspace user. This property is only returned in response to user specific GET call.  */ WorkspaceUser
    ): Self = StObject.set(x, "lastModifiedByInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByInformationUndefined: Self = StObject.set(x, "lastModifiedByInformation", js.undefined)
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageCount(value: String): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderUri(value: String): Self = StObject.set(x, "parentFolderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderUriUndefined: Self = StObject.set(x, "parentFolderUri", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    @scala.inline
    def setThumbHeight(value: String): Self = StObject.set(x, "thumbHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbHeightUndefined: Self = StObject.set(x, "thumbHeight", js.undefined)
    
    @scala.inline
    def setThumbWidth(value: String): Self = StObject.set(x, "thumbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbWidthUndefined: Self = StObject.set(x, "thumbWidth", js.undefined)
    
    @scala.inline
    def setThumbnail(value: /* Description of a page of a document. */ Page): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUserAuthorization(
      value: /* Provides properties that describe user authorization to a workspace. */ WorkspaceUserAuthorization
    ): Self = StObject.set(x, "userAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAuthorizationUndefined: Self = StObject.set(x, "userAuthorization", js.undefined)
  }
}
