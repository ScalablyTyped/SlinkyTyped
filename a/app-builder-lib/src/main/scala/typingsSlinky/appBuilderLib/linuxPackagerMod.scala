package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.linuxOptionsMod.LinuxConfiguration
import typingsSlinky.appBuilderLib.packagerMod.Packager
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linuxPackagerMod {
  
  @JSImport("app-builder-lib/out/linuxPackager", "LinuxPackager")
  @js.native
  class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    
    val executableName: String = js.native
  }
  
  @JSImport("app-builder-lib/out/linuxPackager", "toAppImageOrSnapArch")
  @js.native
  def toAppImageOrSnapArch(arch: Arch): String = js.native
}
