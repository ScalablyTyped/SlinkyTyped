package typingsSlinky.handsontable.mod.Handsontable._editors

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLTableCellElement
import typingsSlinky.handsontable.handsontableStrings._empty
import typingsSlinky.handsontable.handsontableStrings.`bottom-left-corner`
import typingsSlinky.handsontable.handsontableStrings.`top-left-corner`
import typingsSlinky.handsontable.handsontableStrings.bottom
import typingsSlinky.handsontable.handsontableStrings.left
import typingsSlinky.handsontable.handsontableStrings.top
import typingsSlinky.handsontable.mod.Handsontable.CellProperties
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends js.Object {
  
  var TD: HTMLTableCellElement = js.native
  
  def beginEditing(): Unit = js.native
  def beginEditing(initialValue: js.UndefOr[scala.Nothing], event: Event): Unit = js.native
  def beginEditing(initialValue: js.Any): Unit = js.native
  def beginEditing(initialValue: js.Any, event: Event): Unit = js.native
  
  def cancelChanges(): Unit = js.native
  
  var cellProperties: CellProperties = js.native
  
  def checkEditorSection(): `top-left-corner` | top | `bottom-left-corner` | bottom | left | _empty = js.native
  
  def close(): Unit = js.native
  
  var col: Double = js.native
  
  def discardEditor(): Unit = js.native
  def discardEditor(validationResult: Boolean): Unit = js.native
  
  def enableFullEditMode(): Unit = js.native
  
  def extend[T /* <: Base */](): T = js.native
  
  def finishEditing(): Unit = js.native
  def finishEditing(
    restoreOriginalValue: js.UndefOr[scala.Nothing],
    ctrlDown: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def finishEditing(restoreOriginalValue: js.UndefOr[scala.Nothing], ctrlDown: Boolean): Unit = js.native
  def finishEditing(restoreOriginalValue: js.UndefOr[scala.Nothing], ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean, ctrlDown: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getEditedCell(): HTMLTableCellElement | Null = js.native
  
  def getEditedCellsZIndex(): String = js.native
  
  def getValue(): js.Any = js.native
  
  var hot: Core = js.native
  
  def init(): Unit = js.native
  
  var instance: Core = js.native
  
  def isInFullEditMode(): Boolean = js.native
  
  def isOpened(): Boolean = js.native
  
  def isWaiting(): Boolean = js.native
  
  def open(): Unit = js.native
  def open(event: Event): Unit = js.native
  
  var originalValue: js.Any = js.native
  
  def prepare(
    row: Double,
    col: Double,
    prop: String,
    TD: HTMLTableCellElement,
    originalValue: js.Any,
    cellProperties: CellProperties
  ): Unit = js.native
  def prepare(
    row: Double,
    col: Double,
    prop: Double,
    TD: HTMLTableCellElement,
    originalValue: js.Any,
    cellProperties: CellProperties
  ): Unit = js.native
  
  var prop: String | Double = js.native
  
  var row: Double = js.native
  
  def saveValue(): Unit = js.native
  def saveValue(`val`: js.UndefOr[scala.Nothing], ctrlDown: Boolean): Unit = js.native
  def saveValue(`val`: js.Any): Unit = js.native
  def saveValue(`val`: js.Any, ctrlDown: Boolean): Unit = js.native
  
  def setValue(): Unit = js.native
  def setValue(newValue: js.Any): Unit = js.native
  
  var state: EditorState = js.native
}
