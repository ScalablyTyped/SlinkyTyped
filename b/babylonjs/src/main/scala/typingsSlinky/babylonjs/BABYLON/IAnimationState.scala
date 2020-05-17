package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationState extends js.Object {
  var highLimitValue: js.UndefOr[js.Any] = js.native
  var key: Double = js.native
  var loopMode: js.UndefOr[Double] = js.native
  var offsetValue: js.UndefOr[js.Any] = js.native
  var repeatCount: Double = js.native
  var workValue: js.UndefOr[js.Any] = js.native
}

object IAnimationState {
  @scala.inline
  def apply(key: Double, repeatCount: Double): IAnimationState = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], repeatCount = repeatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationState]
  }
  @scala.inline
  implicit class IAnimationStateOps[Self <: IAnimationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighLimitValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highLimitValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighLimitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highLimitValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workValue")(js.undefined)
        ret
    }
  }
  
}

