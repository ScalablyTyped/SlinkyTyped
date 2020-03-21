package typingsSlinky.draftJs.mod

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typingsSlinky.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}

