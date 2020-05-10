package typingsSlinky.node.inspectorMod.Profiler

import typingsSlinky.node.inspectorMod.Runtime.CallFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profile node. Holds callsite information, execution statistics and child nodes.
  */
@js.native
trait ProfileNode extends js.Object {
  /**
    * Function location.
    */
  var callFrame: CallFrame = js.native
  /**
    * Child node ids.
    */
  var children: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The reason of being not optimized. The function may be deoptimized or marked as don't optimize.
    */
  var deoptReason: js.UndefOr[String] = js.native
  /**
    * Number of samples where this node was on top of the call stack.
    */
  var hitCount: js.UndefOr[Double] = js.native
  /**
    * Unique id of the node.
    */
  var id: Double = js.native
  /**
    * An array of source position ticks.
    */
  var positionTicks: js.UndefOr[js.Array[PositionTickInfo]] = js.native
}

object ProfileNode {
  @scala.inline
  def apply(callFrame: CallFrame, id: Double): ProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileNode]
  }
  @scala.inline
  implicit class ProfileNodeOps[Self <: ProfileNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrame(value: CallFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDeoptReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deoptReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeoptReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deoptReason")(js.undefined)
        ret
    }
    @scala.inline
    def withHitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionTicks(value: js.Array[PositionTickInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionTicks")(js.undefined)
        ret
    }
  }
  
}

