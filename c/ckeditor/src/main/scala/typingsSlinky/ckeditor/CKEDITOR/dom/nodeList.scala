package typingsSlinky.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait nodeList extends js.Object {
  def count(): Double = js.native
  def getItem(index: Double): node = js.native
  def toArray(): js.Array[node] = js.native
}

object nodeList {
  @scala.inline
  def apply(count: () => Double, getItem: Double => node, toArray: () => js.Array[node]): nodeList = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getItem = js.Any.fromFunction1(getItem), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[nodeList]
  }
  @scala.inline
  implicit class nodeListOps[Self <: nodeList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: Double => node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToArray(value: () => js.Array[node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

