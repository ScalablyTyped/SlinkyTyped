package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 选项 */
@js.native
trait CreateIntersectionObserverOption extends js.Object {
  /** 初始的相交比例，如果调用时检测到的相交比例与这个值不相等且达到阈值，则会触发一次监听器的回调函数。 */
  var initialRatio: js.UndefOr[Double] = js.native
  /** 是否同时观测多个目标节点（而非一个），如果设为 true ，observe 的 targetSelector 将选中多个节点（注意：同时选中过多节点将影响渲染性能）
    *
    * 最低基础库： `2.0.0` */
  var observeAll: js.UndefOr[Boolean] = js.native
  /** 一个数值数组，包含所有阈值。 */
  var thresholds: js.UndefOr[Array[Double]] = js.native
}

object CreateIntersectionObserverOption {
  @scala.inline
  def apply(): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
  @scala.inline
  implicit class CreateIntersectionObserverOptionOps[Self <: CreateIntersectionObserverOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholds(value: Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
  }
  
}

