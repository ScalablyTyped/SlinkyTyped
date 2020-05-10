package typingsSlinky.jqueryBackstretch.JQueryBackStretch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackStretchOptions extends js.Object {
  /**
    * The ratio of the width/height of the image doesn't always jive with the
    * width/height of the window. This parameter controls whether or not we
    * center the image on the X axis to account for the discrepancy.
    */
  var centeredX: js.UndefOr[Boolean] = js.native
  /**
    * This parameter controls whether or not we center the image on the Y axis
    * to account for the aforementioned discrepancy.
    */
  var centeredY: js.UndefOr[Boolean] = js.native
  /**
    * This is the speed at which the image will fade in. Integers in
    * milliseconds are accepted, as well as standard jQuery speed strings
    * (slow, normal, fast).
    */
  var duration: js.UndefOr[Double | String] = js.native
  /**
    * The amount of time in between slides, when using Backstretch as a
    * slideshow, expressed as the number of milliseconds.
    */
  var fade: js.UndefOr[Double] = js.native
}

object BackStretchOptions {
  @scala.inline
  def apply(): BackStretchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackStretchOptions]
  }
  @scala.inline
  implicit class BackStretchOptionsOps[Self <: BackStretchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenteredX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredX")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredY")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
  }
  
}

