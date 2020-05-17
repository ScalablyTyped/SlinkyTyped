package typingsSlinky.convertUnits.anon

import typingsSlinky.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CutOffNumber extends js.Object {
  var cutOffNumber: js.UndefOr[Double] = js.native
  var exclude: js.UndefOr[js.Array[unit]] = js.native
}

object CutOffNumber {
  @scala.inline
  def apply(): CutOffNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutOffNumber]
  }
  @scala.inline
  implicit class CutOffNumberOps[Self <: CutOffNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCutOffNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutOffNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutOffNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutOffNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
  }
  
}

