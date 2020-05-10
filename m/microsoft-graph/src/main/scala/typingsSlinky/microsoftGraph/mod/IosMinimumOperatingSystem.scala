package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosMinimumOperatingSystem extends js.Object {
  // Version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.native
  // Version 11.0 or later.
  var v11_0: js.UndefOr[Boolean] = js.native
  // Version 12.0 or later.
  var v12_0: js.UndefOr[Boolean] = js.native
  // Version 13.0 or later.
  var v13_0: js.UndefOr[Boolean] = js.native
  // Version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.native
  // Version 9.0 or later.
  var v9_0: js.UndefOr[Boolean] = js.native
}

object IosMinimumOperatingSystem {
  @scala.inline
  def apply(): IosMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMinimumOperatingSystem]
  }
  @scala.inline
  implicit class IosMinimumOperatingSystemOps[Self <: IosMinimumOperatingSystem] (val x: Self) extends AnyVal {
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
    def withV11_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v11_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV11_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v11_0")(js.undefined)
        ret
    }
    @scala.inline
    def withV12_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v12_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV12_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v12_0")(js.undefined)
        ret
    }
    @scala.inline
    def withV13_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v13_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV13_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v13_0")(js.undefined)
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
    def withV9_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v9_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV9_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v9_0")(js.undefined)
        ret
    }
  }
  
}

