package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.linuxOptionsMod.LinuxConfiguration
import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/linuxPackager", JSImport.Namespace)
@js.native
object linuxPackagerMod extends js.Object {
  
  def toAppImageOrSnapArch(arch: Arch): String = js.native
  
  @js.native
  class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    
    val executableName: String = js.native
  }
}
