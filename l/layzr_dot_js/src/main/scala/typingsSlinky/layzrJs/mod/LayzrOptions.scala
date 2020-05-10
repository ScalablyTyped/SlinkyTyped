package typingsSlinky.layzrJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayzrOptions extends js.Object {
  /**
    * Customize the attribute the normal resolution source is taken from.
    */
  var normal: js.UndefOr[String] = js.native
  /**
    * Customize the attribute the retina/high resolution source is taken from.
    */
  var retina: js.UndefOr[String] = js.native
  /**
    * Customize the attribute the source set is taken from.
    */
  var srcset: js.UndefOr[String] = js.native
  /**
    * Adjust when images load, relative to the viewport. Positive values make images load sooner, negative values make images load later.
    *
    * Threshold is a percentage of the viewport height, identical to the CSS vh unit.
    */
  var threshold: js.UndefOr[Double] = js.native
}

object LayzrOptions {
  @scala.inline
  def apply(): LayzrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayzrOptions]
  }
  @scala.inline
  implicit class LayzrOptionsOps[Self <: LayzrOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
    @scala.inline
    def withRetina(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcset")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

