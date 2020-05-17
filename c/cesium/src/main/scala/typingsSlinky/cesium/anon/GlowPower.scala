package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlowPower extends js.Object {
  var color: js.UndefOr[Property] = js.native
  var glowPower: js.UndefOr[Property] = js.native
}

object GlowPower {
  @scala.inline
  def apply(): GlowPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlowPower]
  }
  @scala.inline
  implicit class GlowPowerOps[Self <: GlowPower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Property): Self = {
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
    def withGlowPower(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glowPower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlowPower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glowPower")(js.undefined)
        ret
    }
  }
  
}

