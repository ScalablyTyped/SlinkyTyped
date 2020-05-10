package typingsSlinky.reactBootstrap.alertMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertProps
  extends AllHTMLAttributes[Alert]
     with ClassAttributes[Alert] {
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var closeLabel: js.UndefOr[String] = js.native
  /** @deprecated since v0.29.0 */ var dismissAfter: js.UndefOr[Double] = js.native
  // TODO: Add more specific type
  var onDismiss: js.UndefOr[js.Function] = js.native
}

object AlertProps {
  @scala.inline
  def apply(): AlertProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertProps]
  }
  @scala.inline
  implicit class AlertPropsOps[Self <: AlertProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBsSize(value: Sizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBsStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
  }
  
}

