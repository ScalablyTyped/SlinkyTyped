package typingsSlinky.merkle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerkleTree extends js.Object {
  def depth(): Double = js.native
  def level(level: Double): js.UndefOr[Double] = js.native
  def levels(): Double = js.native
  def nodes(): Double = js.native
  def root(): String = js.native
}

object MerkleTree {
  @scala.inline
  def apply(
    depth: () => Double,
    level: Double => js.UndefOr[Double],
    levels: () => Double,
    nodes: () => Double,
    root: () => String
  ): MerkleTree = {
    val __obj = js.Dynamic.literal(depth = js.Any.fromFunction0(depth), level = js.Any.fromFunction1(level), levels = js.Any.fromFunction0(levels), nodes = js.Any.fromFunction0(nodes), root = js.Any.fromFunction0(root))
    __obj.asInstanceOf[MerkleTree]
  }
  @scala.inline
  implicit class MerkleTreeOps[Self <: MerkleTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLevel(value: Double => js.UndefOr[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevels(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNodes(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

