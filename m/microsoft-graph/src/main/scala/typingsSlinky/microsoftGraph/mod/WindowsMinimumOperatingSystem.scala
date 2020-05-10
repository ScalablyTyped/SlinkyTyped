package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsMinimumOperatingSystem extends js.Object {
  // Windows version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.native
  // Windows version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.native
  // Windows version 8.1 or later.
  var v8_1: js.UndefOr[Boolean] = js.native
}

object WindowsMinimumOperatingSystem {
  @scala.inline
  def apply(): WindowsMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMinimumOperatingSystem]
  }
  @scala.inline
  implicit class WindowsMinimumOperatingSystemOps[Self <: WindowsMinimumOperatingSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV10_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v10_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV10_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v10_0")(js.undefined)
        ret
    }
    @scala.inline
    def withV8_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV8_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8_0")(js.undefined)
        ret
    }
    @scala.inline
    def withV8_1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV8_1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8_1")(js.undefined)
        ret
    }
  }
  
}

