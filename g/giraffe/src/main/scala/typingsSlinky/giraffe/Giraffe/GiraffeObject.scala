package typingsSlinky.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GiraffeObject extends js.Object {
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var app: App = js.native
  var appEvents: js.UndefOr[StringMap] = js.native
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  var dataEvents: js.UndefOr[StringMap] = js.native
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.native
  var initialize: js.UndefOr[js.Function0[js.Any]] = js.native
}

object GiraffeObject {
  @scala.inline
  def apply(app: App): GiraffeObject = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiraffeObject]
  }
  @scala.inline
  implicit class GiraffeObjectOps[Self <: GiraffeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: App): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterDispose(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterDispose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDispose")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInitialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInitialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withAppEvents(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDispose(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeDispose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDispose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInitialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitialize")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEvents(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOptions(value: DefaultOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDispose(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDispose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
  }
  
}

