package typingsSlinky.ejWebAll.ej.Spreadsheet

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLComment extends js.Object {
  
  def deleteComment(range: String, sheetIdx: Double, skipHiddenRow: Boolean): Unit = js.native
  /** This method is used to delete the comment in the specified range in Spreadsheet.
    * @param {any[]|string} Optional. If range is specified, it will delete comments for the specified range else it will use the current selected range.
    * @param {number} Optional. If sheetIdx is specified, it will delete comment in specified sheet else it will use active sheet.
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows data.
    * @returns {void}
    */
  def deleteComment(range: js.Array[_], sheetIdx: Double, skipHiddenRow: Boolean): Unit = js.native
  
  /** This method is used to edit the comment in the target Cell in Spreadsheet.
    * @param {Spreadsheet.CellIndex} Optional.
    * @returns {void}
    */
  def editComment(targetCell: CellIndex): Unit = js.native
  
  /** This method is used to find the next comment from the active cell in Spreadsheet.
    * @returns {boolean}
    */
  def findNextComment(): Boolean = js.native
  
  /** This method is used to find the previous comment from the active cell in Spreadsheet.
    * @returns {boolean}
    */
  def findPrevComment(): Boolean = js.native
  
  /** This method is used to get comment data for the specified cell.
    * @param {HTMLElement} Pass the DOM element to get comment data as object.
    * @returns {any}
    */
  def getComment(cell: HTMLElement): js.Any = js.native
  
  /** This method is used to set new comment in Spreadsheet.
    * @param {string|any[]} Optional. If we pass the range comment will set in the range otherwise it will set with selected cells.
    * @param {string} Optional. Pass the comment data.
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show comment in edit mode
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show the user name
    * @returns {void}
    */
  def setComment(range: String, data: String, showEditPanel: Boolean, showUserName: Boolean): Unit = js.native
  def setComment(range: js.Array[_], data: String, showEditPanel: Boolean, showUserName: Boolean): Unit = js.native
  
  /** This method is used to show all the comments in the Spreadsheet.
    * @returns {void}
    */
  def showAllComments(): Unit = js.native
  
  /** This method is used to show or hide the specific comment in the Spreadsheet.
    * @param {HTMLElement} Optional. Pass the cell DOM element to show or hide its comment. If pass empty argument active cell will processed.
    * @returns {void}
    */
  def showHideComment(targetCell: HTMLElement): Unit = js.native
}
