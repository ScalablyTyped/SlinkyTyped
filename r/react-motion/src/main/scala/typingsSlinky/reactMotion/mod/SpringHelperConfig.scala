package typingsSlinky.reactMotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spring additional configuration
  */
@js.native
trait SpringHelperConfig extends js.Object {
  /**
    * Specifies damping
    * @defaults 26
    */
  var damping: js.UndefOr[Double] = js.native
  /**
    * Specifies both the rounding of the interpolated value and the speed (internal).
    * @defaults 0.01
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Specified stiffness
    * @defaults 170
    */
  var stiffness: js.UndefOr[Double] = js.native
}

object SpringHelperConfig {
  @scala.inline
  def apply(): SpringHelperConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringHelperConfig]
  }
  @scala.inline
  implicit class SpringHelperConfigOps[Self <: SpringHelperConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDamping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDamping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("damping")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStiffness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(js.undefined)
        ret
    }
  }
  
}

