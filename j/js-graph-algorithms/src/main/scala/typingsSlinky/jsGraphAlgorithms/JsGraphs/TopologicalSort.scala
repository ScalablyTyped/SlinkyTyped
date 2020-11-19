package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopologicalSort extends js.Object {
  
  def dfs(G: DiGraph, v: Double): Unit = js.native
  
  var marked: js.Any = js.native
  
  def order(): js.Array[Double] = js.native
  
  var postOrder: js.Any = js.native
}
object TopologicalSort {
  
  @scala.inline
  def apply(dfs: (DiGraph, Double) => Unit, marked: js.Any, order: () => js.Array[Double], postOrder: js.Any): TopologicalSort = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), marked = marked.asInstanceOf[js.Any], order = js.Any.fromFunction0(order), postOrder = postOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSort]
  }
  
  @scala.inline
  implicit class TopologicalSortOps[Self <: TopologicalSort] (val x: Self) extends AnyVal {
    
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
    def setDfs(value: (DiGraph, Double) => Unit): Self = this.set("dfs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMarked(value: js.Any): Self = this.set("marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: () => js.Array[Double]): Self = this.set("order", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostOrder(value: js.Any): Self = this.set("postOrder", value.asInstanceOf[js.Any])
  }
}
