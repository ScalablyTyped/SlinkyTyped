package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.materializeCssStrings.bottom
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import typingsSlinky.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TooltipOptions> */
@js.native
trait PartialTooltipOptions extends js.Object {
  var enterDelay: js.UndefOr[Double] = js.native
  var exitDelay: js.UndefOr[Double] = js.native
  var html: js.UndefOr[String] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var outDuration: js.UndefOr[Double] = js.native
  var position: js.UndefOr[top | right | bottom | left] = js.native
  var transitionMovement: js.UndefOr[Double] = js.native
}

object PartialTooltipOptions {
  @scala.inline
  def apply(): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipOptions]
  }
  @scala.inline
  implicit class PartialTooltipOptionsOps[Self <: PartialTooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withExitDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitDelay")(js.undefined)
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
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
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
    @scala.inline
    def withPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionMovement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMovement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionMovement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionMovement")(js.undefined)
        ret
    }
  }
  
}

