package typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead

import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectSettingsCallback extends js.Object {
  /** Triggered when a multiselect item is canceled */
  var onCancel: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Triggered when a multiselect item is clicked */
  var onClick: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
}

object MultiSelectSettingsCallback {
  @scala.inline
  def apply(): MultiSelectSettingsCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectSettingsCallback]
  }
  @scala.inline
  implicit class MultiSelectSettingsCallbackOps[Self <: MultiSelectSettingsCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCancel(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

