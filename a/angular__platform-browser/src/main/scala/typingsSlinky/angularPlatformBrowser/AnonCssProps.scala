package typingsSlinky.angularPlatformBrowser

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCssProps extends js.Object {
  var cssProps: js.UndefOr[js.Any] = js.native
  var domEvents: js.UndefOr[Boolean] = js.native
  var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ js.Any, Boolean])] = js.native
  var inputClass: js.UndefOr[js.Any] = js.native
  var inputTarget: js.UndefOr[EventTarget] = js.native
  var preset: js.UndefOr[js.Array[_]] = js.native
  var recognizers: js.UndefOr[js.Array[_]] = js.native
  var touchAction: js.UndefOr[String] = js.native
}

object AnonCssProps {
  @scala.inline
  def apply(): AnonCssProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCssProps]
  }
  @scala.inline
  implicit class AnonCssPropsOps[Self <: AnonCssProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDomEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFunction1(value: /* manager */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnable(value: Boolean | (js.Function1[/* manager */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInputTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withRecognizers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecognizers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognizers")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(js.undefined)
        ret
    }
  }
  
}

