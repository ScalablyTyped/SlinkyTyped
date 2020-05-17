package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `16` extends Icon {
  var `16`: js.UndefOr[String] = js.native
  var `32`: js.UndefOr[String] = js.native
  var `64`: js.UndefOr[String] = js.native
}

object `16` {
  @scala.inline
  def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`]
  }
  @scala.inline
  implicit class `16Ops`[Self <: `16`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with16(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without16: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("16")(js.undefined)
        ret
    }
    @scala.inline
    def with32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without32: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("32")(js.undefined)
        ret
    }
    @scala.inline
    def with64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without64: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("64")(js.undefined)
        ret
    }
  }
  
}

