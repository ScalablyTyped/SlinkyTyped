package typingsSlinky.materialUiLab.anon

import typingsSlinky.materialUiLab.materialUiLabBooleans.`false`
import typingsSlinky.materialUiLab.materialUiLabStrings.circle
import typingsSlinky.materialUiLab.materialUiLabStrings.pulse
import typingsSlinky.materialUiLab.materialUiLabStrings.rect
import typingsSlinky.materialUiLab.materialUiLabStrings.text
import typingsSlinky.materialUiLab.materialUiLabStrings.wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var animation: js.UndefOr[pulse | wave | `false`] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var variant: js.UndefOr[text | rect | circle] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object Animation {
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: pulse | wave | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: text | rect | circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

