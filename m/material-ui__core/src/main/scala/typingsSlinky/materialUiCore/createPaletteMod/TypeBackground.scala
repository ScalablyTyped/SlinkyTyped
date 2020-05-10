package typingsSlinky.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeBackground extends js.Object {
  var default: String = js.native
  var paper: String = js.native
}

object TypeBackground {
  @scala.inline
  def apply(default: String, paper: String): TypeBackground = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeBackground]
  }
  @scala.inline
  implicit class TypeBackgroundOps[Self <: TypeBackground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

