package typingsSlinky.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppearance extends js.Object {
  var appearance: String = js.native
  var font: String = js.native
}

object AnonAppearance {
  @scala.inline
  def apply(appearance: String, font: String): AnonAppearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppearance]
  }
  @scala.inline
  implicit class AnonAppearanceOps[Self <: AnonAppearance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppearance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

