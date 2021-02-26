package typingsSlinky.draftJs.mod

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "AtomicBlockUtils")
@js.native
class AtomicBlockUtils ()
  extends typingsSlinky.draftJs.mod.Draft.Model.Modifier.AtomicBlockUtils
object AtomicBlockUtils {
  
  /* static member */
  @JSImport("draft-js", "AtomicBlockUtils.insertAtomicBlock")
  @js.native
  def insertAtomicBlock(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    entityKey: String,
    character: String
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "AtomicBlockUtils.moveAtomicBlock")
  @js.native
  def moveAtomicBlock(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  @JSImport("draft-js", "AtomicBlockUtils.moveAtomicBlock")
  @js.native
  def moveAtomicBlock(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    atomicBlock: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock,
    targetRange: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState,
    insertionMode: DraftInsertionType
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}
