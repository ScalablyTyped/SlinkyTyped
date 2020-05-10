package typingsSlinky.jqueryTools.JQueryTools.overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskOptions extends js.Object {
  /** CSS color string (i.e. hex value) */
  var color: js.UndefOr[String] = js.native
  /** load speed in milliseconds */
  var loadSpeed: js.UndefOr[Double] = js.native
  /** Opacity of mask.  Between 0 and 1. */
  var opacity: js.UndefOr[Double] = js.native
}

object MaskOptions {
  @scala.inline
  def apply(): MaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskOptions]
  }
  @scala.inline
  implicit class MaskOptionsOps[Self <: MaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

