package typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead

import typingsSlinky.jquery.JQueryXHR
import typingsSlinky.jquery.JQuery_.AjaxSettings
import typingsSlinky.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AJaxSettings
  extends AjaxSettings[js.Any] {
  var always: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[JQuery], 
      /* textStatus */ js.UndefOr[String], 
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      Unit
    ]
  ] = js.native
  var done: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[JQuery], 
      /* textStatus */ js.UndefOr[String], 
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      Unit
    ]
  ] = js.native
  var fail: js.UndefOr[
    js.Function3[
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      /* textStatus */ js.UndefOr[String], 
      /* errorThrown */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var path: js.UndefOr[String] = js.native
  var `then`: js.UndefOr[
    js.Function2[/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], Unit]
  ] = js.native
}

object AJaxSettings {
  @scala.inline
  def apply(): AJaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AJaxSettings]
  }
  @scala.inline
  implicit class AJaxSettingsOps[Self <: AJaxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways(
      value: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAlways: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(
      value: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(
      value: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], /* errorThrown */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withThen(value: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.undefined)
        ret
    }
  }
  
}

