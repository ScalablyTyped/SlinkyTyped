package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.AnonANDROID
import typingsSlinky.chromeApps.AnonARM
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-32`
import typingsSlinky.chromeApps.chromeAppsStrings.`x86-64`
import typingsSlinky.chromeApps.chromeAppsStrings.android
import typingsSlinky.chromeApps.chromeAppsStrings.arm
import typingsSlinky.chromeApps.chromeAppsStrings.cros
import typingsSlinky.chromeApps.chromeAppsStrings.linux
import typingsSlinky.chromeApps.chromeAppsStrings.mac
import typingsSlinky.chromeApps.chromeAppsStrings.mips
import typingsSlinky.chromeApps.chromeAppsStrings.mips64
import typingsSlinky.chromeApps.chromeAppsStrings.openbsd
import typingsSlinky.chromeApps.chromeAppsStrings.win
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the current platform.
  * @since Chrome 36.
  */
trait PlatformInfo extends js.Object {
  /**
    * The machine's processor architecture.
    * @see enum PlatformArch
    */
  var arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]]
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @see enum PlatformNaclArch
    */
  var nacl_arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]]
  /**
    * The operating system chrome is running on.
    * @see enum PlatformOs
    */
  var os: ToStringLiteral[AnonANDROID, String, Exclude[String, linux | openbsd | android | win | cros | mac]]
}

object PlatformInfo {
  @scala.inline
  def apply(
    arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]],
    nacl_arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]],
    os: ToStringLiteral[AnonANDROID, String, Exclude[String, linux | openbsd | android | win | cros | mac]]
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlatformInfo]
  }
}

