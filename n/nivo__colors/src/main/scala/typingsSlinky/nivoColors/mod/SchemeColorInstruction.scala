package typingsSlinky.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemeColorInstruction
  extends OrdinalColorsInstruction[js.Any] {
  var scheme: ColorSchemeId = js.native
  // size is useful for diverging & sequential colors,
  // as they are array of array, whereas categorical colors
  // are simple arrays, if the size isn't specified,
  // the bigger array will be selected, this means the 11th
  // for diverging colors and 9th for sequential ones.
  var size: js.UndefOr[Double] = js.native
}

object SchemeColorInstruction {
  @scala.inline
  def apply(scheme: ColorSchemeId): SchemeColorInstruction = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemeColorInstruction]
  }
  @scala.inline
  implicit class SchemeColorInstructionOps[Self <: SchemeColorInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheme(value: ColorSchemeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

