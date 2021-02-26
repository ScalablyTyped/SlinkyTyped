package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.NoteAttributes
import typingsSlinky.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends StObject {
  
  var attributes: js.UndefOr[NoteAttributes] = js.native
  
  var contentLength: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Timestamp] = js.native
  
  var deleted: js.UndefOr[Timestamp] = js.native
  
  var guid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.native
  
  var largestResourceMime: js.UndefOr[String] = js.native
  
  var largestResourceSize: js.UndefOr[Double] = js.native
  
  var notebookGuid: js.UndefOr[String] = js.native
  
  var tagGuids: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[Timestamp] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: NoteAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDeleted(value: Timestamp): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setLargestResourceMime(value: String): Self = StObject.set(x, "largestResourceMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargestResourceMimeUndefined: Self = StObject.set(x, "largestResourceMime", js.undefined)
    
    @scala.inline
    def setLargestResourceSize(value: Double): Self = StObject.set(x, "largestResourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargestResourceSizeUndefined: Self = StObject.set(x, "largestResourceSize", js.undefined)
    
    @scala.inline
    def setNotebookGuid(value: String): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setTagGuids(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = StObject.set(x, "tagGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagGuidsUndefined: Self = StObject.set(x, "tagGuids", js.undefined)
    
    @scala.inline
    def setTagGuidsVarargs(value: typingsSlinky.evernote.mod.Types.Guid*): Self = StObject.set(x, "tagGuids", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = StObject.set(x, "updateSequenceNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSequenceNumUndefined: Self = StObject.set(x, "updateSequenceNum", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
