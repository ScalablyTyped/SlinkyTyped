package typingsSlinky.nprogress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NProgressOptions extends js.Object {
  var barSelector: String = js.native
  var easing: String = js.native
  var minimum: Double = js.native
  var parent: String = js.native
  var positionUsing: String = js.native
  var showSpinner: Boolean = js.native
  var speed: Double = js.native
  var spinnerSelector: String = js.native
  var template: String = js.native
  var trickle: Boolean = js.native
  var trickleSpeed: Double = js.native
}

object NProgressOptions {
  @scala.inline
  def apply(
    barSelector: String,
    easing: String,
    minimum: Double,
    parent: String,
    positionUsing: String,
    showSpinner: Boolean,
    speed: Double,
    spinnerSelector: String,
    template: String,
    trickle: Boolean,
    trickleSpeed: Double
  ): NProgressOptions = {
    val __obj = js.Dynamic.literal(barSelector = barSelector.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], positionUsing = positionUsing.asInstanceOf[js.Any], showSpinner = showSpinner.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], spinnerSelector = spinnerSelector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], trickle = trickle.asInstanceOf[js.Any], trickleSpeed = trickleSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[NProgressOptions]
  }
  @scala.inline
  implicit class NProgressOptionsOps[Self <: NProgressOptions] (val x: Self) extends AnyVal {
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
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionUsing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionUsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSpinner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinnerSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrickle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrickleSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trickleSpeed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

