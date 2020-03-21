package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.AnonCacheExpires
import typingsSlinky.evernote.mod.Types.Note
import typingsSlinky.evernote.mod.Types.Notebook
import typingsSlinky.evernote.mod.Types.NotebookDescriptor
import typingsSlinky.evernote.mod.Types.RelatedContent
import typingsSlinky.evernote.mod.Types.Tag
import typingsSlinky.evernote.mod.Types.UserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.RelatedResult")
@js.native
class RelatedResult () extends js.Object {
  def this(args: AnonCacheExpires) = this()
  var cacheExpires: js.UndefOr[Double] = js.native
  var cacheKey: js.UndefOr[String] = js.native
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.native
  var debugInfo: js.UndefOr[String] = js.native
  var experts: js.UndefOr[js.Array[UserProfile]] = js.native
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  var notes: js.UndefOr[js.Array[Note]] = js.native
  var relatedContent: js.UndefOr[js.Array[RelatedContent]] = js.native
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}

