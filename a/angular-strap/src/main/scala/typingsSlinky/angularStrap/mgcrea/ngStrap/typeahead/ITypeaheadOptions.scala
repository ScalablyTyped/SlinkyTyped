package typingsSlinky.angularStrap.mgcrea.ngStrap.typeahead

import typingsSlinky.angularStrap.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypeaheadOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var autoSelect: js.UndefOr[Boolean] = js.native
  var comparator: js.UndefOr[String] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[String] = js.native
  var trimValue: js.UndefOr[Boolean] = js.native
  var watchOptions: js.UndefOr[Boolean] = js.native
}

object ITypeaheadOptions {
  @scala.inline
  def apply(): ITypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeaheadOptions]
  }
  @scala.inline
  implicit class ITypeaheadOptionsOps[Self <: ITypeaheadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withComparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double | Hide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeHide(value: /* typeahead */ ITypeahead => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeShow(value: /* typeahead */ ITypeahead => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: /* typeahead */ ITypeahead => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* typeahead */ ITypeahead => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* typeahead */ ITypeahead => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchOptions")(js.undefined)
        ret
    }
  }
  
}

