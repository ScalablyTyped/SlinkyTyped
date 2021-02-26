package typingsSlinky.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.appBuilderLib.anon.Packages
import typingsSlinky.appBuilderLib.archiveMod.ArchiveOptions
import typingsSlinky.appBuilderLib.coreMod.Target
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsSlinky.builderUtilRuntime.updateInfoMod.BlockMapDataHolder
import typingsSlinky.builderUtilRuntime.updateInfoMod.PackageFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object differentialUpdateInfoBuilderMod {
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "BLOCK_MAP_FILE_SUFFIX")
  @js.native
  val BLOCK_MAP_FILE_SUFFIX: /* ".blockmap" */ String = js.native
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "appendBlockmap")
  @js.native
  def appendBlockmap(file: String): js.Promise[BlockMapDataHolder] = js.native
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "configureDifferentialAwareArchiveOptions")
  @js.native
  def configureDifferentialAwareArchiveOptions(archiveOptions: ArchiveOptions): ArchiveOptions = js.native
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "createBlockmap")
  @js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_]): js.Promise[BlockMapDataHolder] = js.native
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "createBlockmap")
  @js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_], safeArtifactName: String): js.Promise[BlockMapDataHolder] = js.native
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "createNsisWebDifferentialUpdateInfo")
  @js.native
  def createNsisWebDifferentialUpdateInfo(artifactPath: String, packageFiles: StringDictionary[PackageFileInfo]): Packages | Null = js.native
}
