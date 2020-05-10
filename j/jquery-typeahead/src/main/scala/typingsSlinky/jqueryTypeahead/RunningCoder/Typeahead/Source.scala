package typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead

import typingsSlinky.jqueryTypeahead.jqueryTypeaheadBooleans.`false`
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.localStorage
import typingsSlinky.jqueryTypeahead.jqueryTypeaheadStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /** En extended version of `JQuery Ajax` */
  var ajax: js.UndefOr[AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])] = js.native
  /** Overrides the default configuration for the specified group. */
  var cache: js.UndefOr[Boolean | localStorage | sessionStorage] = js.native
  /** Overrides the default configuration for the specified group. */
  var compression: js.UndefOr[Boolean] = js.native
  /**  Array or function that returns an Array. The items in your array can either be strings or objects */
  var data: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
  /** Overrides the default configuration for the specified group. */
  var display: js.UndefOr[String | js.Array[String]] = js.native
  /** Overrides the default configuration for the specified group. */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** Overrides the default configuration for the specified group. */
  var filter: js.UndefOr[
    Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
  ] = js.native
  /** Overrides the default configuration for the specified group. */
  var matcher: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean]
  ] = js.native
  /** Overrides the default configuration for the specified group. */
  var maxLength: js.UndefOr[`false` | Double] = js.native
  /** Overrides the default configuration for the specified group. */
  var minLength: js.UndefOr[Double] = js.native
  /** Overrides the default configuration for the specified group. */
  var template: js.UndefOr[
    String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
  ] = js.native
  /** Overrides the default configuration for the specified group. */
  var ttl: js.UndefOr[Double] = js.native
}

object Source {
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxFunction1(value: /* query */ js.UndefOr[String] => AJaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAjax(value: AJaxSettings | (js.Function1[/* query */ js.UndefOr[String], AJaxSettings])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean | localStorage | sessionStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFunction0(value: () => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[_] | js.Function0[js.Array[_]]): Self = {
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
    def withDisplay(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction2(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: Boolean | (js.Function2[/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String], Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(value: (/* item */ js.UndefOr[js.Any], /* displayKey */ js.UndefOr[String]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
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
    def withTemplateFunction2(value: (/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplate(
      value: String | (js.Function2[/* query */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], String])
    ): Self = {
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
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
  }
  
}

