package typingsSlinky.appDashBuilderDashLib

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.appDashBuilderDashLib.appDashBuilderDashLibStrings.DOTblockmap
import typingsSlinky.appDashBuilderDashLib.outCoreMod.Target
import typingsSlinky.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typingsSlinky.appDashBuilderDashLib.outTargetsArchiveMod.ArchiveOptions
import typingsSlinky.builderDashUtilDashRuntime.outUpdateInfoMod.BlockMapDataHolder
import typingsSlinky.builderDashUtilDashRuntime.outUpdateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", JSImport.Namespace)
@js.native
object outTargetsDifferentialUpdateInfoBuilderMod extends js.Object {
  val BLOCK_MAP_FILE_SUFFIX: DOTblockmap = js.native
  def appendBlockmap(file: String): js.Promise[BlockMapDataHolder] = js.native
  def configureDifferentialAwareArchiveOptions(archiveOptions: ArchiveOptions): ArchiveOptions = js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_]): js.Promise[BlockMapDataHolder] = js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_], safeArtifactName: String): js.Promise[BlockMapDataHolder] = js.native
  def createNsisWebDifferentialUpdateInfo(artifactPath: String, packageFiles: StringDictionary[PackageFileInfo]): Anon_Arch | Null = js.native
}

