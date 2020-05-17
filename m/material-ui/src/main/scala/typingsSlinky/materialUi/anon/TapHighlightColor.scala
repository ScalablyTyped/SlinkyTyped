package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapHighlightColor extends js.Object {
  var tapHighlightColor: js.UndefOr[String] = js.native
}

object TapHighlightColor {
  @scala.inline
  def apply(): TapHighlightColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapHighlightColor]
  }
  @scala.inline
  implicit class TapHighlightColorOps[Self <: TapHighlightColor] (val x: Self) extends AnyVal {
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

