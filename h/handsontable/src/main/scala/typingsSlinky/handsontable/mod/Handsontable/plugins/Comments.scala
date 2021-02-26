package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comments extends Base {
  
  def clearRange(): Unit = js.native
  
  var contextMenuEvent: Boolean = js.native
  
  var displayDelay: Double = js.native
  
  var editor: CommentEditor = js.native
  
  var eventManager: EventManager = js.native
  
  def getComment(): String = js.native
  
  def getCommentAtCell(row: Double, column: Double): js.UndefOr[String] = js.native
  
  def getCommentMeta(row: Double, column: Double, property: String): js.Any = js.native
  
  def hide(): Unit = js.native
  
  var mouseDown: Boolean = js.native
  
  var range: CommentsRangeObject = js.native
  
  def refreshEditor(): Unit = js.native
  def refreshEditor(force: Boolean): Unit = js.native
  
  def removeComment(): Unit = js.native
  def removeComment(forceRender: Boolean): Unit = js.native
  
  def removeCommentAtCell(row: Double, col: Double): Unit = js.native
  def removeCommentAtCell(row: Double, col: Double, forceRender: Boolean): Unit = js.native
  
  def setComment(value: String): Unit = js.native
  
  def setCommentAtCell(row: Double, col: Double, value: String): Unit = js.native
  
  def setRange(range: CommentsRangeObject): Unit = js.native
  
  def show(): Boolean = js.native
  
  def showAtCell(row: Double, col: Double): Boolean = js.native
  
  def targetIsCellWithComment(event: Event): Boolean = js.native
  
  def targetIsCommentTextArea(event: Event): Boolean = js.native
  
  var timer: js.Any = js.native
  
  def updateCommentMeta(row: Double, column: Double, metaObject: js.Object): Unit = js.native
}
