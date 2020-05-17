package typingsSlinky.knockback.Knockback

import typingsSlinky.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModel extends Destroyable {
  def extend(source: js.Any): js.Any = js.native
  def model(): Model = js.native
  def shareOptions(): ViewModelOptions = js.native
}

object ViewModel {
  @scala.inline
  def apply(
    destroy: () => js.Any,
    extend: js.Any => js.Any,
    model: () => Model,
    shareOptions: () => ViewModelOptions
  ): ViewModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), extend = js.Any.fromFunction1(extend), model = js.Any.fromFunction0(model), shareOptions = js.Any.fromFunction0(shareOptions))
    __obj.asInstanceOf[ViewModel]
  }
  @scala.inline
  implicit class ViewModelOps[Self <: ViewModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtend(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModel(value: () => Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShareOptions(value: () => ViewModelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareOptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

