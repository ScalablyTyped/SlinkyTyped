package typingsSlinky.androiduix.android.widget.RelativeLayout.DependencyGraph

import typingsSlinky.androiduix.android.util.ArrayMap
import typingsSlinky.androiduix.android.util.SparseMap
import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var dependencies: SparseMap[String, Node] = js.native
  var dependents: ArrayMap[Node, typingsSlinky.androiduix.android.widget.RelativeLayout.DependencyGraph] = js.native
  var view: View = js.native
  def release(): Unit = js.native
}

object Node {
  @scala.inline
  def apply(
    dependencies: SparseMap[String, Node],
    dependents: ArrayMap[Node, typingsSlinky.androiduix.android.widget.RelativeLayout.DependencyGraph],
    release: () => Unit,
    view: View
  ): Node = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], dependents = dependents.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: SparseMap[String, Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependents(value: ArrayMap[Node, typingsSlinky.androiduix.android.widget.RelativeLayout.DependencyGraph]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

