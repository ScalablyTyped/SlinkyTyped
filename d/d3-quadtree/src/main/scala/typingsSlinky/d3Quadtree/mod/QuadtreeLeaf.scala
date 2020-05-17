package typingsSlinky.d3Quadtree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuadtreeLeaf[T] extends js.Object {
  /**
    * The data associated with this point, as passed to quadtree.add.
    */
  var data: T = js.native
  /**
    * The length property may be used to distinguish leaf nodes from internal nodes: it is undefined for leaf nodes, and 4 for internal nodes.
    */
  var length: js.UndefOr[scala.Nothing] = js.native
  /**
    * The next datum in this leaf, if any.
    */
  var next: js.UndefOr[QuadtreeLeaf[T]] = js.native
}

object QuadtreeLeaf {
  @scala.inline
  def apply[T](data: T): QuadtreeLeaf[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadtreeLeaf[T]]
  }
  @scala.inline
  implicit class QuadtreeLeafOps[Self[t] <: QuadtreeLeaf[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: QuadtreeLeaf[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
  }
  
}

