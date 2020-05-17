package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedIndex extends js.Object {
  var selectedIndex: Double = js.native
  var tintColor: String = js.native
}

object SelectedIndex {
  @scala.inline
  def apply(selectedIndex: Double, tintColor: String): SelectedIndex = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedIndex]
  }
  @scala.inline
  implicit class SelectedIndexOps[Self <: SelectedIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

