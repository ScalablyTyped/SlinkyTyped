package typingsSlinky.plottable.rTreeSplitStrategiesMod

import typingsSlinky.plottable.rTreeMod.RTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRTreeSplitStrategy extends js.Object {
  def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
}

object IRTreeSplitStrategy {
  @scala.inline
  def apply(split: (js.Array[RTreeNode[js.Any]], NodePair[js.Any]) => Unit): IRTreeSplitStrategy = {
    val __obj = js.Dynamic.literal(split = js.Any.fromFunction2(split))
    __obj.asInstanceOf[IRTreeSplitStrategy]
  }
  @scala.inline
  implicit class IRTreeSplitStrategyOps[Self <: IRTreeSplitStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSplit(value: (js.Array[RTreeNode[js.Any]], NodePair[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

