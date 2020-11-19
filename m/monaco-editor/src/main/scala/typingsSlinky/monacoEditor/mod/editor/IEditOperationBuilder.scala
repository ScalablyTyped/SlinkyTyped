package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.mod.Range
import typingsSlinky.monacoEditor.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditOperationBuilder extends js.Object {
  
  /**
    * Add a new edit operation (a replace operation).
    * @param range The range to replace (delete). May be empty to represent a simple insert.
    * @param text The text to replace with. May be null to represent a simple delete.
    */
  def addEditOperation(range: Range): Unit = js.native
  def addEditOperation(range: Range, text: String): Unit = js.native
  def addEditOperation(range: Range, text: String, forceMoveMarkers: Boolean): Unit = js.native
  def addEditOperation(range: Range, text: Null, forceMoveMarkers: Boolean): Unit = js.native
  
  /**
    * Add a new edit operation (a replace operation).
    * The inverse edits will be accessible in `ICursorStateComputerData.getInverseEditOperations()`
    * @param range The range to replace (delete). May be empty to represent a simple insert.
    * @param text The text to replace with. May be null to represent a simple delete.
    */
  def addTrackedEditOperation(range: Range): Unit = js.native
  def addTrackedEditOperation(range: Range, text: String): Unit = js.native
  def addTrackedEditOperation(range: Range, text: String, forceMoveMarkers: Boolean): Unit = js.native
  def addTrackedEditOperation(range: Range, text: Null, forceMoveMarkers: Boolean): Unit = js.native
  
  /**
    * Track `selection` when applying edit operations.
    * A best effort will be made to not grow/expand the selection.
    * An empty selection will clamp to a nearby character.
    * @param selection The selection to track.
    * @param trackPreviousOnEmpty If set, and the selection is empty, indicates whether the selection
    *           should clamp to the previous or the next character.
    * @return A unique identifier.
    */
  def trackSelection(selection: Selection): String = js.native
  def trackSelection(selection: Selection, trackPreviousOnEmpty: Boolean): String = js.native
}
