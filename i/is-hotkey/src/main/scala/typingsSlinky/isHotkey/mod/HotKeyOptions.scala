package typingsSlinky.isHotkey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotKeyOptions extends js.Object {
  var byKey: Boolean = js.native
}

object HotKeyOptions {
  @scala.inline
  def apply(byKey: Boolean): HotKeyOptions = {
    val __obj = js.Dynamic.literal(byKey = byKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotKeyOptions]
  }
  @scala.inline
  implicit class HotKeyOptionsOps[Self <: HotKeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

