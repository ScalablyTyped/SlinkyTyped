package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.ARM
import typingsSlinky.chromeApps.chromeAppsStrings.MIPS
import typingsSlinky.chromeApps.chromeAppsStrings.MIPS64
import typingsSlinky.chromeApps.chromeAppsStrings.X86_32
import typingsSlinky.chromeApps.chromeAppsStrings.X86_64
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-32`
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-64`
import typingsSlinky.chromeApps.chromeAppsStrings.arm_
import typingsSlinky.chromeApps.chromeAppsStrings.mips64_
import typingsSlinky.chromeApps.chromeAppsStrings.mips_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNaclarch extends js.Object {
  var nacl_arch: ToStringLiteral[
    AnonARM, 
    /* keyof chrome-apps.AnonARM */ ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    Exclude[
      /* keyof chrome-apps.AnonARM */ ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      mips64_ | arm_ | `x86-64` | `x86-32` | mips_
    ]
  ] = js.native
  var sub_package_path: String = js.native
}

object AnonNaclarch {
  @scala.inline
  def apply(
    nacl_arch: ToStringLiteral[
      AnonARM, 
      /* keyof chrome-apps.AnonARM */ ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      Exclude[
        /* keyof chrome-apps.AnonARM */ ARM | X86_32 | X86_64 | MIPS | MIPS64, 
        mips64_ | arm_ | `x86-64` | `x86-32` | mips_
      ]
    ],
    sub_package_path: String
  ): AnonNaclarch = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNaclarch]
  }
  @scala.inline
  implicit class AnonNaclarchOps[Self <: AnonNaclarch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNacl_arch(
      value: ToStringLiteral[
          AnonARM, 
          /* keyof chrome-apps.AnonARM */ ARM | X86_32 | X86_64 | MIPS | MIPS64, 
          Exclude[
            /* keyof chrome-apps.AnonARM */ ARM | X86_32 | X86_64 | MIPS | MIPS64, 
            mips64_ | arm_ | `x86-64` | `x86-32` | mips_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nacl_arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub_package_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub_package_path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

