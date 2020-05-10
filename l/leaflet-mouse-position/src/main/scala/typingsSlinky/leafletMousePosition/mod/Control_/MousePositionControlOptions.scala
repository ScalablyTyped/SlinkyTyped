package typingsSlinky.leafletMousePosition.mod.Control_

import typingsSlinky.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePositionControlOptions extends ControlOptions {
  var emptyString: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[js.Function2[/* lng */ Double, /* lat */ Double, String]] = js.native
  var latFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.native
  var lngFirst: js.UndefOr[Boolean] = js.native
  var lngFormatter: js.UndefOr[js.Function1[/* lng */ Double, String]] = js.native
  var numDigits: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var wrapLng: js.UndefOr[Boolean] = js.native
}

object MousePositionControlOptions {
  @scala.inline
  def apply(): MousePositionControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePositionControlOptions]
  }
  @scala.inline
  implicit class MousePositionControlOptionsOps[Self <: MousePositionControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyString")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: (/* lng */ Double, /* lat */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLatFormatter(value: /* lat */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLatFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLngFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withLngFormatter(value: /* lng */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLngFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withNumDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapLng(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapLng")(js.undefined)
        ret
    }
  }
  
}

