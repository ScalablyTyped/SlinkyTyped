package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeIterator extends js.Object {
  @JSName("MSHTML.NodeIterator_typekey")
  var MSHTMLDotNodeIterator_typekey: NodeIterator = js.native
  val expandEntityReferences: Boolean = js.native
  val filter: js.Any = js.native
  val root: js.Any = js.native
  val whatToShow: Double = js.native
  def Detach(): Unit = js.native
  def nextNode(): js.Any = js.native
  def previousNode(): js.Any = js.native
}

object NodeIterator {
  @scala.inline
  def apply(
    Detach: () => Unit,
    MSHTMLDotNodeIterator_typekey: NodeIterator,
    expandEntityReferences: Boolean,
    filter: js.Any,
    nextNode: () => js.Any,
    previousNode: () => js.Any,
    root: js.Any,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(Detach = js.Any.fromFunction0(Detach), expandEntityReferences = expandEntityReferences.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], nextNode = js.Any.fromFunction0(nextNode), previousNode = js.Any.fromFunction0(previousNode), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.NodeIterator_typekey")(MSHTMLDotNodeIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
  @scala.inline
  implicit class NodeIteratorOps[Self <: NodeIterator] (val x: Self) extends AnyVal {
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
    def withMSHTMLDotNodeIterator_typekey(value: NodeIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.NodeIterator_typekey")(value.asInstanceOf[js.Any])
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
    def withNextNode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousNode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNode")(js.Any.fromFunction0(value))
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

