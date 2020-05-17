package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `4` extends js.Object {
  var `1`: js.UndefOr[Font] = js.native
  var `2`: js.UndefOr[Font] = js.native
  var `3`: js.UndefOr[Font] = js.native
  var `4`: js.UndefOr[Font] = js.native
  var `5`: js.UndefOr[Font] = js.native
  var `6`: js.UndefOr[Font] = js.native
}

object `4` {
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  @scala.inline
  implicit class `4Ops`[Self <: `4`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(js.undefined)
        ret
    }
    @scala.inline
    def with2(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(js.undefined)
        ret
    }
    @scala.inline
    def with3(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(js.undefined)
        ret
    }
    @scala.inline
    def with4(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(js.undefined)
        ret
    }
    @scala.inline
    def with5(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(js.undefined)
        ret
    }
    @scala.inline
    def with6(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(js.undefined)
        ret
    }
  }
  
}

