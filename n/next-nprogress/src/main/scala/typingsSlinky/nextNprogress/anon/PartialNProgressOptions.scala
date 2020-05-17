package typingsSlinky.nextNprogress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<nprogress.nprogress.NProgressOptions> */
@js.native
trait PartialNProgressOptions extends js.Object {
  var barSelector: js.UndefOr[String] = js.native
  var easing: js.UndefOr[String] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var parent: js.UndefOr[String] = js.native
  var positionUsing: js.UndefOr[String] = js.native
  var showSpinner: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
  var spinnerSelector: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var trickle: js.UndefOr[Boolean] = js.native
  var trickleSpeed: js.UndefOr[Double] = js.native
}

object PartialNProgressOptions {
  @scala.inline
  def apply(): PartialNProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNProgressOptions]
  }
  @scala.inline
  implicit class PartialNProgressOptionsOps[Self <: PartialNProgressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionUsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionUsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionUsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionUsing")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSpinner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSelector")(js.undefined)
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
    def withTrickle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrickle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickle")(js.undefined)
        ret
    }
    @scala.inline
    def withTrickleSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickleSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrickleSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickleSpeed")(js.undefined)
        ret
    }
  }
  
}

