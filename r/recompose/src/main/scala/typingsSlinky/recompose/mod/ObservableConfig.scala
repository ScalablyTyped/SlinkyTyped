package typingsSlinky.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// setObservableConfig: https://github.com/acdlite/recompose/blob/master/docs/API.md#setObservableConfig
@js.native
trait ObservableConfig extends js.Object {
  var fromESObservable: js.UndefOr[js.Function1[/* observable */ Subscribable[_], _]] = js.native
  var toESObservable: js.UndefOr[js.Function1[/* stream */ js.Any, Subscribable[_]]] = js.native
}

object ObservableConfig {
  @scala.inline
  def apply(): ObservableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableConfig]
  }
  @scala.inline
  implicit class ObservableConfigOps[Self <: ObservableConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromESObservable(value: /* observable */ Subscribable[_] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromESObservable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFromESObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromESObservable")(js.undefined)
        ret
    }
    @scala.inline
    def withToESObservable(value: /* stream */ js.Any => Subscribable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toESObservable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToESObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toESObservable")(js.undefined)
        ret
    }
  }
  
}

