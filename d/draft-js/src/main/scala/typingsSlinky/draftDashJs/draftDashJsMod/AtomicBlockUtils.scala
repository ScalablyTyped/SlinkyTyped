package typingsSlinky.draftDashJs.draftDashJsMod

import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftInsertionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Modifier.AtomicBlockUtils

/* static members */
@JSImport("draft-js", "AtomicBlockUtils")
@js.native
object AtomicBlockUtils extends js.Object {
  def insertAtomicBlock(
    editorState: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState = js.native
  def moveAtomicBlock(
    editorState: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.EditorState = js.native
}

