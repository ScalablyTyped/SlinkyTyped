package typingsSlinky.amplify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxSettings
  extends typingsSlinky.jquery.JQuery.AjaxSettings[js.Any] {
  var dataMap: js.UndefOr[js.Object | (js.Function1[/* data */ js.Any, js.Object])] = js.native
  var decoder: js.UndefOr[js.Any] = js.native
}

object AjaxSettings {
  @scala.inline
  def apply(): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings]
  }
  @scala.inline
  implicit class AjaxSettingsOps[Self <: AjaxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataMapFunction1(value: /* data */ js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataMap(value: js.Object | (js.Function1[/* data */ js.Any, js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDecoder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoder")(js.undefined)
        ret
    }
  }
  
}

