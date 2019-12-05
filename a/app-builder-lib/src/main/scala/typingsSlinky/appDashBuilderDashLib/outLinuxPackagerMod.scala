package typingsSlinky.appDashBuilderDashLib

import typingsSlinky.appDashBuilderDashLib.outOptionsLinuxOptionsMod.LinuxConfiguration
import typingsSlinky.appDashBuilderDashLib.outPackagerMod.Packager
import typingsSlinky.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typingsSlinky.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/linuxPackager", JSImport.Namespace)
@js.native
object outLinuxPackagerMod extends js.Object {
  @js.native
  class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    val executableName: String = js.native
  }
  
  def toAppImageOrSnapArch(arch: Arch): String = js.native
}

