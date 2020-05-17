package typingsSlinky.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultObservable extends Destroyable {
  def setToDefault(): js.Any = js.native
}

object DefaultObservable {
  @scala.inline
  def apply(destroy: () => js.Any, setToDefault: () => js.Any): DefaultObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setToDefault = js.Any.fromFunction0(setToDefault))
    __obj.asInstanceOf[DefaultObservable]
  }
  @scala.inline
  implicit class DefaultObservableOps[Self <: DefaultObservable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetToDefault(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToDefault")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

