package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.IncludeContainingNotebooks
import typingsSlinky.evernote.mod.Types.RelatedContentType
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.RelatedResultSpec")
@js.native
class RelatedResultSpec () extends StObject {
  def this(args: IncludeContainingNotebooks) = this()
  
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeDebugInfo: js.UndefOr[Boolean] = js.native
  
  var maxExperts: js.UndefOr[Double] = js.native
  
  var maxNotebooks: js.UndefOr[Double] = js.native
  
  var maxNotes: js.UndefOr[Double] = js.native
  
  var maxRelatedContent: js.UndefOr[Double] = js.native
  
  var maxTags: js.UndefOr[Double] = js.native
  
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.native
  
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.native
}
