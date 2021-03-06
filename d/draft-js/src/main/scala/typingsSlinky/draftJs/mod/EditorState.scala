package typingsSlinky.draftJs.mod

import typingsSlinky.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "EditorState")
@js.native
class EditorState ()
  extends typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState
object EditorState {
  
  /**
    * Incorporate native DOM selection changes into the EditorState. This
    * method can be used when we simply want to accept whatever the DOM
    * has given us to represent selection, and we do not need to re-render
    * the editor.
    *
    * To forcibly move the DOM selection, see `EditorState.forceSelection`.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.acceptSelection")
  @js.native
  def acceptSelection(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    selection: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "EditorState.create")
  @js.native
  def create(config: js.Object): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "EditorState.createEmpty")
  @js.native
  def createEmpty(): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  @JSImport("draft-js", "EditorState.createEmpty")
  @js.native
  def createEmpty(decorator: DraftDecoratorType): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "EditorState.createWithContent")
  @js.native
  def createWithContent(contentState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  @JSImport("draft-js", "EditorState.createWithContent")
  @js.native
  def createWithContent(
    contentState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState,
    decorator: DraftDecoratorType
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /**
    * At times, we need to force the DOM selection to be where we
    * need it to be. This can occur when the anchor or focus nodes
    * are non-text nodes, for instance. In this case, we want to trigger
    * a re-render of the editor, which in turn forces selection into
    * the correct place in the DOM. The `forceSelection` method
    * accomplishes this.
    *
    * This method should be used in cases where you need to explicitly
    * move the DOM selection from one place to another without a change
    * in ContentState.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.forceSelection")
  @js.native
  def forceSelection(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    selection: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.SelectionState
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /**
    * Force focus to the end of the editor. This is useful in scenarios
    * where we want to programmatically focus the input and it makes sense
    * to allow the user to continue working seamlessly.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.moveFocusToEnd")
  @js.native
  def moveFocusToEnd(editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /**
    * Move selection to the end of the editor without forcing focus.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.moveSelectionToEnd")
  @js.native
  def moveSelectionToEnd(editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /**
    * Push the current ContentState onto the undo stack if it should be
    * considered a boundary state, and set the provided ContentState as the
    * new current content.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.push")
  @js.native
  def push(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    contentState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState,
    changeType: EditorChangeType
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /**
    * Make the top ContentState in the redo stack the new current content and
    * push the current content onto the undo stack.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.redo")
  @js.native
  def redo(editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "EditorState.set")
  @js.native
  def set(editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState, put: js.Object): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /* static member */
  @JSImport("draft-js", "EditorState.setInlineStyleOverride")
  @js.native
  def setInlineStyleOverride(
    editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState,
    inlineStyleOverride: DraftInlineStyle
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
  
  /**
    * Make the top ContentState in the undo stack the new current content and
    * push the current content onto the redo stack.
    */
  /* static member */
  @JSImport("draft-js", "EditorState.undo")
  @js.native
  def undo(editorState: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.EditorState = js.native
}
