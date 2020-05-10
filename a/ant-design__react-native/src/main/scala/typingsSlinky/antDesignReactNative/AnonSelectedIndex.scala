package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectedIndex extends js.Object {
  var selectedIndex: Double = js.native
}

object AnonSelectedIndex {
  @scala.inline
  def apply(selectedIndex: Double): AnonSelectedIndex = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectedIndex]
  }
  @scala.inline
  implicit class AnonSelectedIndexOps[Self <: AnonSelectedIndex] (val x: Self) extends AnyVal {
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
  }
  
}

