package typingsSlinky.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryMetadata extends StObject {
  
  /** True if it is a directory. */
  var isDirectory: Boolean = js.native
  
  /** Optional. Mime type for the entry.  */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The last modified time of this entry. */
  var modificationTime: js.Date = js.native
  
  /** Name of this entry (not full path name). Must not contain '/'. For root it must be empty. */
  var name: String = js.native
  
  /** File size in bytes. */
  var size: Double = js.native
  
  /** Optional. Thumbnail image as a data URI in either PNG, JPEG or WEBP format, at most 32 KB in size. Optional, but can be provided only when explicitly requested by the onGetMetadataRequested event.  */
  var thumbnail: js.UndefOr[String] = js.native
}
object EntryMetadata {
  
  @scala.inline
  def apply(isDirectory: Boolean, modificationTime: js.Date, name: String, size: Double): EntryMetadata = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryMetadata]
  }
  
  @scala.inline
  implicit class EntryMetadataMutableBuilder[Self <: EntryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setModificationTime(value: js.Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
