package typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectSettings extends js.Object {
  var callback: js.UndefOr[MultiSelectSettingsCallback] = js.native
  /** If true, the last label will be deleted if the query is empty and backspace is pressed */
  var cancelOnBackspace: js.UndefOr[Boolean] = js.native
  /** Default items when Typeahead is loade */
  var data: js.UndefOr[js.Array[_] | js.Function0[_]] = js.native
  /** Href link on the multiselect item */
  var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.native
  /** Optional limit of maximum items to select */
  var limit: js.UndefOr[Double] = js.native
  /** Template when the limit is reached */
  var limitTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String])] = js.native
  /** Unique item identifier to remove an item from the result list when selected (use any of the item key), by default a JSON of the item will be used */
  var matchOn: js.UndefOr[String | js.Array[_]] = js.native
}

object MultiSelectSettings {
  @scala.inline
  def apply(): MultiSelectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectSettings]
  }
  @scala.inline
  implicit class MultiSelectSettingsOps[Self <: MultiSelectSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: MultiSelectSettingsCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelOnBackspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOnBackspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelOnBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOnBackspace")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFunction0(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[_] | js.Function0[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefFunction1(value: /* item */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHref(value: String | (js.Function1[/* item */ js.UndefOr[js.Any], String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitTemplateFunction1(value: /* query */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLimitTemplate(value: String | (js.Function1[/* query */ js.UndefOr[String], String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchOn(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchOn")(js.undefined)
        ret
    }
  }
  
}

