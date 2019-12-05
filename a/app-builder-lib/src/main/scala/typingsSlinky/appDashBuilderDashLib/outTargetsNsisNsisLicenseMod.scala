package typingsSlinky.appDashBuilderDashLib

import typingsSlinky.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod.NsisOptions
import typingsSlinky.appDashBuilderDashLib.outTargetsNsisNsisScriptGeneratorMod.NsisScriptGenerator
import typingsSlinky.appDashBuilderDashLib.outWinPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/nsisLicense", JSImport.Namespace)
@js.native
object outTargetsNsisNsisLicenseMod extends js.Object {
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}

