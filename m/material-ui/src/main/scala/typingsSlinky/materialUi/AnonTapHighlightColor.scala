package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTapHighlightColor extends js.Object {
  var tapHighlightColor: js.UndefOr[String] = js.native
}

object AnonTapHighlightColor {
  @scala.inline
  def apply(): AnonTapHighlightColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTapHighlightColor]
  }
  @scala.inline
  implicit class AnonTapHighlightColorOps[Self <: AnonTapHighlightColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTapHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapHighlightColor")(js.undefined)
        ret
    }
  }
  
}

