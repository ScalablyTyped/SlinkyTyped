package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.`x86-32`
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-64`
import typingsSlinky.chromeApps.chromeAppsStrings.arm_
import typingsSlinky.chromeApps.chromeAppsStrings.mips64_
import typingsSlinky.chromeApps.chromeAppsStrings.mips_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonARM extends js.Object {
  var ARM: arm_ = js.native
  var MIPS: mips_ = js.native
  var MIPS64: mips64_ = js.native
  var X86_32: `x86-32` = js.native
  var X86_64: `x86-64` = js.native
}

object AnonARM {
  @scala.inline
  def apply(ARM: arm_, MIPS: mips_, MIPS64: mips64_, X86_32: `x86-32`, X86_64: `x86-64`): AnonARM = {
    val __obj = js.Dynamic.literal(ARM = ARM.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS64 = MIPS64.asInstanceOf[js.Any], X86_32 = X86_32.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonARM]
  }
  @scala.inline
  implicit class AnonARMOps[Self <: AnonARM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARM(value: arm_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIPS(value: mips_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIPS64(value: mips64_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIPS64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX86_32(value: `x86-32`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X86_32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX86_64(value: `x86-64`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X86_64")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

