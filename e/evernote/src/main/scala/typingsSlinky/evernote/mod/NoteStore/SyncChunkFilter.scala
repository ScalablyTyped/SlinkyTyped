package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.IncludeExpunged
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.SyncChunkFilter")
@js.native
class SyncChunkFilter () extends js.Object {
  def this(args: IncludeExpunged) = this()
  
  var includeExpunged: js.UndefOr[Boolean] = js.native
  
  var includeLinkedNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeNoteApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  
  var includeNoteAttributes: js.UndefOr[Boolean] = js.native
  
  var includeNoteResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  
  var includeNoteResources: js.UndefOr[Boolean] = js.native
  
  var includeNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeNotes: js.UndefOr[Boolean] = js.native
  
  var includeResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  
  var includeResources: js.UndefOr[Boolean] = js.native
  
  var includeSearches: js.UndefOr[Boolean] = js.native
  
  var includeSharedNotes: js.UndefOr[Boolean] = js.native
  
  var includeTags: js.UndefOr[Boolean] = js.native
  
  var notebookGuids: js.UndefOr[Set[String]] = js.native
  
  var omitSharedNotebooks: js.UndefOr[Boolean] = js.native
  
  var requireNoteContentClass: js.UndefOr[String] = js.native
}
