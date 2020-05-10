package typingsSlinky.contextjs.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitSettings extends js.Object {
  var above: js.UndefOr[String | Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var fadeSpeed: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.native
  var preventDoubleContext: js.UndefOr[Boolean] = js.native
}

object InitSettings {
  @scala.inline
  def apply(): InitSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitSettings]
  }
  @scala.inline
  implicit class InitSettingsOps[Self <: InitSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbove(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* e */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDoubleContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDoubleContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDoubleContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDoubleContext")(js.undefined)
        ret
    }
  }
  
}

