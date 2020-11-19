package typingsSlinky.ckeditor.CKEDITOR.dom

import org.scalajs.dom.raw.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
@js.native
trait selection extends js.Object {
  
  val FILLING_CHAR_SEQUENCE: String = js.native
  
  def createBookmarks(serializable: js.Any): js.Array[bookmark] = js.native
  
  def createBookmarks2(normalized: js.Any): js.Array[bookmark2] = js.native
  
  val document: typingsSlinky.ckeditor.CKEDITOR.dom.document = js.native
  
  def fake(element: element): Unit = js.native
  def fake(element: element, ariaLabel: Boolean): Unit = js.native
  
  def getCommonAncestor(): element = js.native
  
  def getNative(): Selection = js.native
  
  def getRanges(): js.Array[range] = js.native
  def getRanges(onlyEditables: Boolean): js.Array[range] = js.native
  
  def getSelectedElement(): element = js.native
  
  def getSelectedText(): String = js.native
  
  def getStartElement(): element = js.native
  
  def getType(): Double = js.native
  
  def isCollapsed(): Boolean = js.native
  
  val isFake: Boolean = js.native
  
  def isHidden(): Boolean = js.native
  
  def isInTable(): Boolean = js.native
  def isInTable(allowPartialSelection: Boolean): Boolean = js.native
  
  val isLocked: Boolean = js.native
  
  def lock(): Unit = js.native
  
  def removeAllRanges(): Unit = js.native
  
  def reset(): Unit = js.native
  
  val rev: Double = js.native
  
  val root: element = js.native
  
  def scrollIntoView(): Unit = js.native
  
  def selectBookmarks(bookmarks: js.Array[bookmark | bookmark2]): selection = js.native
  
  def selectElement(element: element): Unit = js.native
  
  def selectRanges(ranges: js.Array[range]): Unit = js.native
  
  def unlock(restore: Boolean): Unit = js.native
}
