package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectWrapper extends js.Object {
  /**
    * The underlying effect
    */
  var effect: Effect = js.native
  /**
    * Event that is fired right before the effect is drawn (should be used to update uniforms)
    */
  var onApplyObservable: Observable[js.Object] = js.native
  /**
    * Disposes of the effect wrapper
    */
  def dispose(): Unit = js.native
}

object EffectWrapper {
  @scala.inline
  def apply(dispose: () => Unit, effect: Effect, onApplyObservable: Observable[js.Object]): EffectWrapper = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), effect = effect.asInstanceOf[js.Any], onApplyObservable = onApplyObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectWrapper]
  }
  @scala.inline
  implicit class EffectWrapperOps[Self <: EffectWrapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEffect(value: Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnApplyObservable(value: Observable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onApplyObservable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

