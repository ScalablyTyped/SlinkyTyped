package typingsSlinky.materialUiCore.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonColors extends js.Object {
  var black: String = js.native
  var white: String = js.native
}

object CommonColors {
  @scala.inline
  def apply(black: String, white: String): CommonColors = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonColors]
  }
  @scala.inline
  implicit class CommonColorsOps[Self <: CommonColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

