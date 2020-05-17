package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLSelection extends js.Object {
  @JSName("MSHTML.IHTMLSelection_typekey")
  var MSHTMLDotIHTMLSelection_typekey: IHTMLSelection = js.native
  val anchorNode: IHTMLDOMNode = js.native
  val anchorOffset: Double = js.native
  val focusNode: IHTMLDOMNode = js.native
  val focusOffset: Double = js.native
  val isCollapsed: Boolean = js.native
  val rangeCount: Double = js.native
  def addRange(range: js.Any): Unit = js.native
  def collapse(parentNode: js.Any, offfset: Double): Unit = js.native
  def collapseToEnd(): Unit = js.native
  def collapseToStart(): Unit = js.native
  def deleteFromDocument(): Unit = js.native
  def getRangeAt(index: Double): IHTMLDOMRange = js.native
  def removeAllRanges(): Unit = js.native
  def removeRange(range: js.Any): Unit = js.native
  def selectAllChildren(parentNode: js.Any): Unit = js.native
}

object IHTMLSelection {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLSelection_typekey: IHTMLSelection,
    addRange: js.Any => Unit,
    anchorNode: IHTMLDOMNode,
    anchorOffset: Double,
    collapse: (js.Any, Double) => Unit,
    collapseToEnd: () => Unit,
    collapseToStart: () => Unit,
    deleteFromDocument: () => Unit,
    focusNode: IHTMLDOMNode,
    focusOffset: Double,
    getRangeAt: Double => IHTMLDOMRange,
    isCollapsed: Boolean,
    rangeCount: Double,
    removeAllRanges: () => Unit,
    removeRange: js.Any => Unit,
    selectAllChildren: js.Any => Unit
  ): IHTMLSelection = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), anchorNode = anchorNode.asInstanceOf[js.Any], anchorOffset = anchorOffset.asInstanceOf[js.Any], collapse = js.Any.fromFunction2(collapse), collapseToEnd = js.Any.fromFunction0(collapseToEnd), collapseToStart = js.Any.fromFunction0(collapseToStart), deleteFromDocument = js.Any.fromFunction0(deleteFromDocument), focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any], getRangeAt = js.Any.fromFunction1(getRangeAt), isCollapsed = isCollapsed.asInstanceOf[js.Any], rangeCount = rangeCount.asInstanceOf[js.Any], removeAllRanges = js.Any.fromFunction0(removeAllRanges), removeRange = js.Any.fromFunction1(removeRange), selectAllChildren = js.Any.fromFunction1(selectAllChildren))
    __obj.updateDynamic("MSHTML.IHTMLSelection_typekey")(MSHTMLDotIHTMLSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelection]
  }
  @scala.inline
  implicit class IHTMLSelectionOps[Self <: IHTMLSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLSelection_typekey(value: IHTMLSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLSelection_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddRange(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnchorNode(value: IHTMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchorOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapse(value: (js.Any, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCollapseToEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseToEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollapseToStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseToStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteFromDocument(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFromDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusNode(value: IHTMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRangeAt(value: Double => IHTMLDOMRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRangeAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveAllRanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllRanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveRange(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectAllChildren(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllChildren")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

