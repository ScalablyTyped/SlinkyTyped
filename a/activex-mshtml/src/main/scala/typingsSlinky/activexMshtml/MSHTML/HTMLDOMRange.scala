package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLDOMRange extends js.Object {
  @JSName("MSHTML.HTMLDOMRange_typekey")
  var MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange = js.native
  val collapsed: Boolean = js.native
  val commonAncestorContainer: IHTMLDOMNode = js.native
  val endContainer: IHTMLDOMNode = js.native
  val endOffset: Double = js.native
  val startContainer: IHTMLDOMNode = js.native
  val startOffset: Double = js.native
  def Detach(): Unit = js.native
  def cloneContents(): js.Any = js.native
  def cloneRange(): IHTMLDOMRange = js.native
  def collapse(toStart: Boolean): Unit = js.native
  def compareBoundaryPoints(how: Double, sourceRange: js.Any): Double = js.native
  def deleteContents(): Unit = js.native
  def extractContents(): js.Any = js.native
  def getBoundingClientRect(): IHTMLRect = js.native
  def getClientRects(): IHTMLRectCollection = js.native
  def insertNode(newNode: js.Any): Unit = js.native
  def selectNode(refNode: js.Any): Unit = js.native
  def selectNodeContents(refNode: js.Any): Unit = js.native
  def setEnd(refNode: js.Any, offset: Double): Unit = js.native
  def setEndAfter(refNode: js.Any): Unit = js.native
  def setEndBefore(refNode: js.Any): Unit = js.native
  def setStart(refNode: js.Any, offset: Double): Unit = js.native
  def setStartAfter(refNode: js.Any): Unit = js.native
  def setStartBefore(refNode: js.Any): Unit = js.native
  def surroundContents(newParent: js.Any): Unit = js.native
}

object HTMLDOMRange {
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotHTMLDOMRange_typekey: HTMLDOMRange,
    cloneContents: () => js.Any,
    cloneRange: () => IHTMLDOMRange,
    collapse: Boolean => Unit,
    collapsed: Boolean,
    commonAncestorContainer: IHTMLDOMNode,
    compareBoundaryPoints: (Double, js.Any) => Double,
    deleteContents: () => Unit,
    endContainer: IHTMLDOMNode,
    endOffset: Double,
    extractContents: () => js.Any,
    getBoundingClientRect: () => IHTMLRect,
    getClientRects: () => IHTMLRectCollection,
    insertNode: js.Any => Unit,
    selectNode: js.Any => Unit,
    selectNodeContents: js.Any => Unit,
    setEnd: (js.Any, Double) => Unit,
    setEndAfter: js.Any => Unit,
    setEndBefore: js.Any => Unit,
    setStart: (js.Any, Double) => Unit,
    setStartAfter: js.Any => Unit,
    setStartBefore: js.Any => Unit,
    startContainer: IHTMLDOMNode,
    startOffset: Double,
    surroundContents: js.Any => Unit
  ): HTMLDOMRange = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), cloneContents = js.Any.fromFunction0(cloneContents), cloneRange = js.Any.fromFunction0(cloneRange), collapse = js.Any.fromFunction1(collapse), collapsed = collapsed.asInstanceOf[js.Any], commonAncestorContainer = commonAncestorContainer.asInstanceOf[js.Any], compareBoundaryPoints = js.Any.fromFunction2(compareBoundaryPoints), deleteContents = js.Any.fromFunction0(deleteContents), endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], extractContents = js.Any.fromFunction0(extractContents), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), insertNode = js.Any.fromFunction1(insertNode), selectNode = js.Any.fromFunction1(selectNode), selectNodeContents = js.Any.fromFunction1(selectNodeContents), setEnd = js.Any.fromFunction2(setEnd), setEndAfter = js.Any.fromFunction1(setEndAfter), setEndBefore = js.Any.fromFunction1(setEndBefore), setStart = js.Any.fromFunction2(setStart), setStartAfter = js.Any.fromFunction1(setStartAfter), setStartBefore = js.Any.fromFunction1(setStartBefore), startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], surroundContents = js.Any.fromFunction1(surroundContents))
    __obj.updateDynamic("MSHTML.HTMLDOMRange_typekey")(MSHTMLDotHTMLDOMRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDOMRange]
  }
  @scala.inline
  implicit class HTMLDOMRangeOps[Self <: HTMLDOMRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMSHTMLDotHTMLDOMRange_typekey(value: HTMLDOMRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLDOMRange_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneContents(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneRange(value: () => IHTMLDOMRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonAncestorContainer(value: IHTMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonAncestorContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompareBoundaryPoints(value: (Double, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareBoundaryPoints")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteContents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndContainer(value: IHTMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtractContents(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBoundingClientRect(value: () => IHTMLRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoundingClientRect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClientRects(value: () => IHTMLRectCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertNode(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectNode(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectNodeContents(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNodeContents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetEndAfter(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEndBefore(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStart(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetStartAfter(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStartBefore(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStartBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartContainer(value: IHTMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurroundContents(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surroundContents")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

