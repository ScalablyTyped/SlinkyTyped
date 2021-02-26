package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.mod.Platform
import typingsSlinky.appBuilderLib.mod.Target
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetFactoryMod {
  
  @JSImport("app-builder-lib/out/targets/targetFactory", "NoOpTarget")
  @js.native
  class NoOpTarget protected () extends Target {
    def this(name: String) = this()
    
    @JSName("options")
    val options_NoOpTarget: Null = js.native
    
    @JSName("outDir")
    def outDir_MNoOpTarget: String = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/targetFactory", "computeArchToTargetNamesMap")
  @js.native
  def computeArchToTargetNamesMap(raw: Map[Arch, js.Array[String]], platformPackager: PlatformPackager[_], platform: Platform): Map[Arch, js.Array[String]] = js.native
  
  @JSImport("app-builder-lib/out/targets/targetFactory", "createCommonTarget")
  @js.native
  def createCommonTarget(target: String, outDir: String, packager: PlatformPackager[_]): Target = js.native
  
  @JSImport("app-builder-lib/out/targets/targetFactory", "createTargets")
  @js.native
  def createTargets(
    nameToTarget: Map[String, Target],
    rawList: js.Array[String],
    outDir: String,
    packager: PlatformPackager[_]
  ): js.Array[Target] = js.native
}
