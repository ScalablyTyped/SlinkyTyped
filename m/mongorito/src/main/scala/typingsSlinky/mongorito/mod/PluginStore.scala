package typingsSlinky.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginStore extends js.Object {
  var model: js.UndefOr[Model] = js.native
  var modelClass: ModelClass = js.native
  def dispatch(arg: js.Any): js.Any = js.native
  def getState(): State = js.native
}

object PluginStore {
  @scala.inline
  def apply(dispatch: js.Any => js.Any, getState: () => State, modelClass: ModelClass): PluginStore = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), modelClass = modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStore]
  }
  @scala.inline
  implicit class PluginStoreOps[Self <: PluginStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModelClass(value: ModelClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
  }
  
}

