package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsStore extends Class {
  var observer: js.Any = js.native
  var options: OptionsStoreOptions = js.native
  def get(field: String): js.Any = js.native
  def set(field: String, value: js.Any): Unit = js.native
}

object OptionsStore {
  @scala.inline
  def apply(
    get: String => js.Any,
    observer: js.Any,
    options: OptionsStoreOptions,
    set: (String, js.Any) => Unit
  ): OptionsStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), observer = observer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[OptionsStore]
  }
  @scala.inline
  implicit class OptionsStoreOps[Self <: OptionsStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: OptionsStoreOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

