package typingsSlinky.androiduix.android.widget.RelativeLayout

import typingsSlinky.androiduix.android.util.SparseMap
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.widget.RelativeLayout.DependencyGraph.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyGraph_ extends js.Object {
  var mKeyNodes: SparseMap[String, Node] = js.native
  var mNodes: js.Any = js.native
  var mRoots: js.Any = js.native
  def add(view: View): Unit = js.native
  def clear(): Unit = js.native
  /* private */ def findRoots(rulesFilter: js.Any): js.Any = js.native
  def getSortedViews(sorted: js.Array[View], rules: js.Array[Double]): Unit = js.native
}

object DependencyGraph_ {
  @scala.inline
  def apply(
    add: View => Unit,
    clear: () => Unit,
    findRoots: js.Any => js.Any,
    getSortedViews: (js.Array[View], js.Array[Double]) => Unit,
    mKeyNodes: SparseMap[String, Node],
    mNodes: js.Any,
    mRoots: js.Any
  ): DependencyGraph_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), findRoots = js.Any.fromFunction1(findRoots), getSortedViews = js.Any.fromFunction2(getSortedViews), mKeyNodes = mKeyNodes.asInstanceOf[js.Any], mNodes = mNodes.asInstanceOf[js.Any], mRoots = mRoots.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyGraph_]
  }
  @scala.inline
  implicit class DependencyGraph_Ops[Self <: DependencyGraph_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFindRoots(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRoots")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSortedViews(value: (js.Array[View], js.Array[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortedViews")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMKeyNodes(value: SparseMap[String, Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mKeyNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNodes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMRoots(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mRoots")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

