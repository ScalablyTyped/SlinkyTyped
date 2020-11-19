package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.mod.Platform
import typingsSlinky.appBuilderLib.mod.Target
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtil.archMod.Arch
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/targetFactory", JSImport.Namespace)
@js.native
object targetFactoryMod extends js.Object {
  
  def computeArchToTargetNamesMap(raw: Map[Arch, js.Array[String]], platformPackager: PlatformPackager[_], platform: Platform): Map[Arch, js.Array[String]] = js.native
  
  def createCommonTarget(target: String, outDir: String, packager: PlatformPackager[_]): Target = js.native
  
  def createTargets(
    nameToTarget: Map[String, Target],
    rawList: js.Array[String],
    outDir: String,
    packager: PlatformPackager[_]
  ): js.Array[Target] = js.native
  
  @js.native
  class NoOpTarget protected () extends Target {
    def this(name: String) = this()
    
    @JSName("options")
    val options_NoOpTarget: Null = js.native
    
    @JSName("outDir")
    def outDir_MNoOpTarget: String = js.native
  }
}
