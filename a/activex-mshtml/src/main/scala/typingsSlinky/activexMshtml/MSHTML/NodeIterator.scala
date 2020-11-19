package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeIterator extends js.Object {
  
  def Detach(): Unit = js.native
  
  @JSName("MSHTML.NodeIterator_typekey")
  var MSHTMLDotNodeIterator_typekey: NodeIterator = js.native
  
  val expandEntityReferences: Boolean = js.native
  
  val filter: js.Any = js.native
  
  def nextNode(): js.Any = js.native
  
  def previousNode(): js.Any = js.native
  
  val root: js.Any = js.native
  
  val whatToShow: Double = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("Detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotNodeIterator_typekey(value: NodeIterator): Self = this.set("MSHTML.NodeIterator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandEntityReferences(value: Boolean): Self = this.set("expandEntityReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNode(value: () => js.Any): Self = this.set("nextNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousNode(value: () => js.Any): Self = this.set("previousNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatToShow(value: Double): Self = this.set("whatToShow", value.asInstanceOf[js.Any])
  }
}
