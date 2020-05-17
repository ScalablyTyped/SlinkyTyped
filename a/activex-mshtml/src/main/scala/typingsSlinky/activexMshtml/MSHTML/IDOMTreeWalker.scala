package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDOMTreeWalker extends js.Object {
  @JSName("MSHTML.IDOMTreeWalker_typekey")
  var MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker = js.native
  var currentNode: js.Any = js.native
  val expandEntityReferences: Boolean = js.native
  val filter: js.Any = js.native
  val root: js.Any = js.native
  val whatToShow: Double = js.native
  def firstChild(): js.Any = js.native
  def lastChild(): js.Any = js.native
  def nextNode(): js.Any = js.native
  def nextSibling(): js.Any = js.native
  def parentNode(): js.Any = js.native
  def previousNode(): js.Any = js.native
  def previousSibling(): js.Any = js.native
}

object IDOMTreeWalker {
  @scala.inline
  def apply(
    MSHTMLDotIDOMTreeWalker_typekey: IDOMTreeWalker,
    currentNode: js.Any,
    expandEntityReferences: Boolean,
    filter: js.Any,
    firstChild: () => js.Any,
    lastChild: () => js.Any,
    nextNode: () => js.Any,
    nextSibling: () => js.Any,
    parentNode: () => js.Any,
    previousNode: () => js.Any,
    previousSibling: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): IDOMTreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMTreeWalker_typekey")(MSHTMLDotIDOMTreeWalker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMTreeWalker]
  }
  @scala.inline
  implicit class IDOMTreeWalkerOps[Self <: IDOMTreeWalker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIDOMTreeWalker_typekey(value: IDOMTreeWalker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IDOMTreeWalker_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandEntityReferences(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandEntityReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstChild(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastChild(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextNode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextSibling(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParentNode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousNode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousSibling(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhatToShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatToShow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

