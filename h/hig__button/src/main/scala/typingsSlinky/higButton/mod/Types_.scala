package typingsSlinky.higButton.mod

import typingsSlinky.higButton.higButtonStrings.flat
import typingsSlinky.higButton.higButtonStrings.outline
import typingsSlinky.higButton.higButtonStrings.primary
import typingsSlinky.higButton.higButtonStrings.secondary
import typingsSlinky.higButton.higButtonStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types_ extends js.Object {
  var FLAT: flat = js.native
  var OUTLINE: outline = js.native
  /** @deprecated */
  var PRIMARY: primary = js.native
  /** @deprecated */
  var SECONDARY: secondary = js.native
  var SOLID: solid = js.native
}

object Types_ {
  @scala.inline
  def apply(FLAT: flat, OUTLINE: outline, PRIMARY: primary, SECONDARY: secondary, SOLID: solid): Types_ = {
    val __obj = js.Dynamic.literal(FLAT = FLAT.asInstanceOf[js.Any], OUTLINE = OUTLINE.asInstanceOf[js.Any], PRIMARY = PRIMARY.asInstanceOf[js.Any], SECONDARY = SECONDARY.asInstanceOf[js.Any], SOLID = SOLID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types_]
  }
  @scala.inline
  implicit class Types_Ops[Self <: Types_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFLAT(value: flat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOUTLINE(value: outline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRIMARY(value: primary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSECONDARY(value: secondary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSOLID(value: solid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOLID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

