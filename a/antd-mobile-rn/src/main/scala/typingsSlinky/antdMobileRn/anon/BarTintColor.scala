package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarTintColor extends js.Object {
  var barTintColor: String = js.native
  var tintColor: String = js.native
  var unselectedTintColor: String = js.native
}

object BarTintColor {
  @scala.inline
  def apply(barTintColor: String, tintColor: String, unselectedTintColor: String): BarTintColor = {
    val __obj = js.Dynamic.literal(barTintColor = barTintColor.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], unselectedTintColor = unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarTintColor]
  }
  @scala.inline
  implicit class BarTintColorOps[Self <: BarTintColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselectedTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedTintColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

