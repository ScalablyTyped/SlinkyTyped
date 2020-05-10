package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidMinimumOperatingSystem extends js.Object {
  // Version 4.0 or later.
  var v4_0: js.UndefOr[Boolean] = js.native
  // Version 4.0.3 or later.
  var v4_0_3: js.UndefOr[Boolean] = js.native
  // Version 4.1 or later.
  var v4_1: js.UndefOr[Boolean] = js.native
  // Version 4.2 or later.
  var v4_2: js.UndefOr[Boolean] = js.native
  // Version 4.3 or later.
  var v4_3: js.UndefOr[Boolean] = js.native
  // Version 4.4 or later.
  var v4_4: js.UndefOr[Boolean] = js.native
  // Version 5.0 or later.
  var v5_0: js.UndefOr[Boolean] = js.native
  // Version 5.1 or later.
  var v5_1: js.UndefOr[Boolean] = js.native
}

object AndroidMinimumOperatingSystem {
  @scala.inline
  def apply(): AndroidMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMinimumOperatingSystem]
  }
  @scala.inline
  implicit class AndroidMinimumOperatingSystemOps[Self <: AndroidMinimumOperatingSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withV4_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV4_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_0")(js.undefined)
        ret
    }
    @scala.inline
    def withV4_0_3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_0_3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV4_0_3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_0_3")(js.undefined)
        ret
    }
    @scala.inline
    def withV4_1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV4_1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_1")(js.undefined)
        ret
    }
    @scala.inline
    def withV4_2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV4_2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_2")(js.undefined)
        ret
    }
    @scala.inline
    def withV4_3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV4_3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_3")(js.undefined)
        ret
    }
    @scala.inline
    def withV4_4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV4_4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v4_4")(js.undefined)
        ret
    }
    @scala.inline
    def withV5_0(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v5_0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV5_0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v5_0")(js.undefined)
        ret
    }
    @scala.inline
    def withV5_1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v5_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV5_1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v5_1")(js.undefined)
        ret
    }
  }
  
}

