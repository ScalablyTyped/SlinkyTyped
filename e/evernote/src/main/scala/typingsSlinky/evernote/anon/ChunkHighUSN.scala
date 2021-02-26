package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.LinkedNotebook
import typingsSlinky.evernote.mod.Types.Notebook
import typingsSlinky.evernote.mod.Types.Resource
import typingsSlinky.evernote.mod.Types.SavedSearch
import typingsSlinky.evernote.mod.Types.Tag
import typingsSlinky.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkHighUSN extends StObject {
  
  var chunkHighUSN: js.UndefOr[Double] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var expungedLinkedNotebooks: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  
  var expungedNotebooks: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  
  var expungedNotes: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  
  var expungedSearches: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  
  var expungedTags: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.native
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  
  var notes: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Note]] = js.native
  
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
}
object ChunkHighUSN {
  
  @scala.inline
  def apply(): ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkHighUSN]
  }
  
  @scala.inline
  implicit class ChunkHighUSNMutableBuilder[Self <: ChunkHighUSN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkHighUSN(value: Double): Self = StObject.set(x, "chunkHighUSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkHighUSNUndefined: Self = StObject.set(x, "chunkHighUSN", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setExpungedLinkedNotebooks(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedLinkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedLinkedNotebooksUndefined: Self = StObject.set(x, "expungedLinkedNotebooks", js.undefined)
    
    @scala.inline
    def setExpungedLinkedNotebooksVarargs(value: typingsSlinky.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedLinkedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setExpungedNotebooks(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedNotebooksUndefined: Self = StObject.set(x, "expungedNotebooks", js.undefined)
    
    @scala.inline
    def setExpungedNotebooksVarargs(value: typingsSlinky.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setExpungedNotes(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedNotesUndefined: Self = StObject.set(x, "expungedNotes", js.undefined)
    
    @scala.inline
    def setExpungedNotesVarargs(value: typingsSlinky.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedNotes", js.Array(value :_*))
    
    @scala.inline
    def setExpungedSearches(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedSearches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedSearchesUndefined: Self = StObject.set(x, "expungedSearches", js.undefined)
    
    @scala.inline
    def setExpungedSearchesVarargs(value: typingsSlinky.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedSearches", js.Array(value :_*))
    
    @scala.inline
    def setExpungedTags(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungedTagsUndefined: Self = StObject.set(x, "expungedTags", js.undefined)
    
    @scala.inline
    def setExpungedTagsVarargs(value: typingsSlinky.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedTags", js.Array(value :_*))
    
    @scala.inline
    def setLinkedNotebooks(value: js.Array[LinkedNotebook]): Self = StObject.set(x, "linkedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedNotebooksUndefined: Self = StObject.set(x, "linkedNotebooks", js.undefined)
    
    @scala.inline
    def setLinkedNotebooksVarargs(value: LinkedNotebook*): Self = StObject.set(x, "linkedNotebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotebooks(value: js.Array[Notebook]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    @scala.inline
    def setNotebooksVarargs(value: Notebook*): Self = StObject.set(x, "notebooks", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[typingsSlinky.evernote.mod.Types.Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: typingsSlinky.evernote.mod.Types.Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSearches(value: js.Array[SavedSearch]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchesUndefined: Self = StObject.set(x, "searches", js.undefined)
    
    @scala.inline
    def setSearchesVarargs(value: SavedSearch*): Self = StObject.set(x, "searches", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUpdateCount(value: Double): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
  }
}
