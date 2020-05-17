package typingsSlinky.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearanceString extends js.Object {
  var appearance: String = js.native
}

object AppearanceString {
  @scala.inline
  def apply(appearance: String): AppearanceString = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearanceString]
  }
  @scala.inline
  implicit class AppearanceStringOps[Self <: AppearanceString] (val x: Self) extends AnyVal {
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
  }
  
}

