package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedComponents extends js.Object {
  var count: js.Any = js.native
  var id: js.Any = js.native
  var marked: js.Any = js.native
  def componentCount(): Double = js.native
  def componentId(v: Double): Double = js.native
  def dfs(G: Graph, v: Double): Unit = js.native
}

object ConnectedComponents {
  @scala.inline
  def apply(
    componentCount: () => Double,
    componentId: Double => Double,
    count: js.Any,
    dfs: (Graph, Double) => Unit,
    id: js.Any,
    marked: js.Any
  ): ConnectedComponents = {
    val __obj = js.Dynamic.literal(componentCount = js.Any.fromFunction0(componentCount), componentId = js.Any.fromFunction1(componentId), count = count.asInstanceOf[js.Any], dfs = js.Any.fromFunction2(dfs), id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedComponents]
  }
  @scala.inline
  implicit class ConnectedComponentsOps[Self <: ConnectedComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComponentId(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDfs(value: (Graph, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

