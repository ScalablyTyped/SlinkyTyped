package typingsSlinky.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ToastOptions> */
@js.native
trait PartialToastOptions extends js.Object {
  var activationPercent: js.UndefOr[Double] = js.native
  var classes: js.UndefOr[String] = js.native
  var completeCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var displayLength: js.UndefOr[Double] = js.native
  var html: js.UndefOr[String] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var outDuration: js.UndefOr[Double] = js.native
}

object PartialToastOptions {
  @scala.inline
  def apply(): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastOptions]
  }
  @scala.inline
  implicit class PartialToastOptionsOps[Self <: PartialToastOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCompleteCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLength")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
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
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(js.undefined)
        ret
    }
  }
  
}

