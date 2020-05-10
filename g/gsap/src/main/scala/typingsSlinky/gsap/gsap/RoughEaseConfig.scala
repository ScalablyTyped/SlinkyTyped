package typingsSlinky.gsap.gsap

import typingsSlinky.gsap.gsapStrings.both
import typingsSlinky.gsap.gsapStrings.in
import typingsSlinky.gsap.gsapStrings.none
import typingsSlinky.gsap.gsapStrings.out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoughEaseConfig extends js.Object {
  var clamp: js.UndefOr[Boolean] = js.native
  var points: js.UndefOr[Double] = js.native
  var randomize: js.UndefOr[Boolean] = js.native
  var strength: js.UndefOr[Double] = js.native
  var taper: js.UndefOr[in | out | both | none] = js.native
  var template: js.UndefOr[Ease] = js.native
}

object RoughEaseConfig {
  @scala.inline
  def apply(): RoughEaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoughEaseConfig]
  }
  @scala.inline
  implicit class RoughEaseConfigOps[Self <: RoughEaseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.undefined)
        ret
    }
    @scala.inline
    def withPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(js.undefined)
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(js.undefined)
        ret
    }
    @scala.inline
    def withTaper(value: in | out | both | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taper")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: Ease): Self = {
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
  }
  
}

