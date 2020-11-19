package typingsSlinky.ckeditor.CKEDITOR.dom

import typingsSlinky.ckeditor.anon.EndNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait range extends js.Object {
  
  def checkBoundaryOfElement(element: element, checkType: Double): Boolean = js.native
  
  def checkEndOfBlock(): Boolean = js.native
  
  def checkReadOnly(): Boolean = js.native
  
  def checkStartOfBlock(): Boolean = js.native
  
  def clone(cloneId: Boolean): range = js.native
  
  def cloneContents(): documentFragment = js.native
  
  def collapse(): Boolean = js.native
  def collapse(toStart: Boolean): Boolean = js.native
  
  val collapsed: Boolean = js.native
  
  def createBookmark(): bookmark = js.native
  def createBookmark(serializable: Boolean): bookmark = js.native
  
  def createBookmark2(): bookmark2 = js.native
  def createBookmark2(normalized: Boolean): bookmark2 = js.native
  
  def createIterator(): iterator = js.native
  
  def deleteContents(): Unit = js.native
  def deleteContents(mergeThen: Boolean): Unit = js.native
  
  val document: typingsSlinky.ckeditor.CKEDITOR.dom.document = js.native
  
  val endContainer: element | text = js.native
  
  val endOffset: Double = js.native
  
  def endPath(): elementPath = js.native
  
  def enlarge(unit: Double): Unit = js.native
  def enlarge(unit: Double, excludeBrs: Boolean): Unit = js.native
  
  def extractContents(): documentFragment = js.native
  def extractContents(mergeThen: js.UndefOr[scala.Nothing], cloneId: Boolean): documentFragment = js.native
  def extractContents(mergeThen: Boolean): documentFragment = js.native
  def extractContents(mergeThen: Boolean, cloneId: Boolean): documentFragment = js.native
  
  def fixBlock(isStart: Boolean, blockTag: String): element = js.native
  
  def getBoundaryNodes(): EndNode = js.native
  
  def getCommonAncestor(): element = js.native
  def getCommonAncestor(includeSelf: js.UndefOr[scala.Nothing], ignoreTextNode: Boolean): element = js.native
  def getCommonAncestor(includeSelf: Boolean): element = js.native
  def getCommonAncestor(includeSelf: Boolean, ignoreTextNode: Boolean): element = js.native
  
  def getEnclosedNode(): node = js.native
  
  def getNextEditableNode(): element | text = js.native
  
  def getNextNode(): element = js.native
  def getNextNode(evaluator: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], boundary: element): element = js.native
  def getNextNode(evaluator: js.UndefOr[scala.Nothing], guard: js.Function1[/* element */ element, Boolean]): element = js.native
  def getNextNode(
    evaluator: js.UndefOr[scala.Nothing],
    guard: js.Function1[/* element */ element, Boolean],
    boundary: element
  ): element = js.native
  def getNextNode(evaluator: js.Function1[/* element */ element, Boolean]): element = js.native
  def getNextNode(
    evaluator: js.Function1[/* element */ element, Boolean],
    guard: js.UndefOr[scala.Nothing],
    boundary: element
  ): element = js.native
  def getNextNode(
    evaluator: js.Function1[/* element */ element, Boolean],
    guard: js.Function1[/* element */ element, Boolean]
  ): element = js.native
  def getNextNode(
    evaluator: js.Function1[/* element */ element, Boolean],
    guard: js.Function1[/* element */ element, Boolean],
    boundary: element
  ): element = js.native
  
  def getPreviousEditableNode(): element | text = js.native
  
  def getPreviousNode(): element = js.native
  def getPreviousNode(evaluator: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], boundary: element): element = js.native
  def getPreviousNode(evaluator: js.UndefOr[scala.Nothing], guard: js.Function1[/* element */ element, Boolean]): element = js.native
  def getPreviousNode(
    evaluator: js.UndefOr[scala.Nothing],
    guard: js.Function1[/* element */ element, Boolean],
    boundary: element
  ): element = js.native
  def getPreviousNode(evaluator: js.Function1[/* element */ element, Boolean]): element = js.native
  def getPreviousNode(
    evaluator: js.Function1[/* element */ element, Boolean],
    guard: js.UndefOr[scala.Nothing],
    boundary: element
  ): element = js.native
  def getPreviousNode(
    evaluator: js.Function1[/* element */ element, Boolean],
    guard: js.Function1[/* element */ element, Boolean]
  ): element = js.native
  def getPreviousNode(
    evaluator: js.Function1[/* element */ element, Boolean],
    guard: js.Function1[/* element */ element, Boolean],
    boundary: element
  ): element = js.native
  
  def getTouchedEndNode(): node = js.native
  
  def getTouchedStartNode(): node = js.native
  
  def insertNode(node: node): Unit = js.native
  
  def moveToBookmark(bookmark: bookmark): Unit = js.native
  def moveToBookmark(bookmark: bookmark2): Unit = js.native
  
  def moveToClosestEditablePosition(): Boolean = js.native
  def moveToClosestEditablePosition(element: js.UndefOr[scala.Nothing], isMoveForward: Boolean): Boolean = js.native
  def moveToClosestEditablePosition(element: element): Boolean = js.native
  def moveToClosestEditablePosition(element: element, isMoveForward: Boolean): Boolean = js.native
  
  def moveToElementEditEnd(target: element): Boolean = js.native
  
  def moveToElementEditStart(target: element): Boolean = js.native
  
  def moveToElementEditablePosition(element: element, isMoveToEnd: Boolean): Boolean = js.native
  
  def moveToPosition(node: node, position: Double): Unit = js.native
  
  def moveToRange(range: range): Unit = js.native
  
  def optimize(): Unit = js.native
  
  def optimizeBookmark(): Unit = js.native
  
  def removeEmptyBlocksAtEnd(atEnd: Boolean): Unit = js.native
  
  val root: element = js.native
  
  def scrollIntoView(): Unit = js.native
  
  def select(): selection = js.native
  
  def selectNodeContents(node: node): Unit = js.native
  
  def setEnd(endNode: node, endOffset: Double): Unit = js.native
  
  def setEndAfter(node: node): Unit = js.native
  
  def setEndAt(node: node, position: Double): Unit = js.native
  
  def setEndBefore(node: node): Unit = js.native
  
  def setStart(startNode: node, startOffset: Double): Unit = js.native
  
  def setStartAfter(node: node): Unit = js.native
  
  def setStartAt(node: node, position: Double): Unit = js.native
  
  def setStartBefore(node: node): Unit = js.native
  
  def shrink(mode: Double): Unit = js.native
  def shrink(mode: Double, selectContents: js.UndefOr[scala.Nothing], options: Boolean): Unit = js.native
  def shrink(mode: Double, selectContents: js.UndefOr[scala.Nothing], options: shrinkOptions): Unit = js.native
  def shrink(mode: Double, selectContents: Boolean): Unit = js.native
  def shrink(mode: Double, selectContents: Boolean, options: Boolean): Unit = js.native
  def shrink(mode: Double, selectContents: Boolean, options: shrinkOptions): Unit = js.native
  
  def splitBlock(): Unit = js.native
  def splitBlock(cloneId: Boolean): Unit = js.native
  
  def splitElement(toSplit: element): element = js.native
  def splitElement(toSplit: element, cloneId: Boolean): element = js.native
  
  val startContainer: element | text = js.native
  
  val startOffset: Double = js.native
  
  def startPath(): elementPath = js.native
  
  def trim(): Unit = js.native
  def trim(ignoreStart: js.UndefOr[scala.Nothing], ignoreEnd: Boolean): Unit = js.native
  def trim(ignoreStart: Boolean): Unit = js.native
  def trim(ignoreStart: Boolean, ignoreEnd: Boolean): Unit = js.native
}
