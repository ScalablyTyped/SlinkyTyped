package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.nsisOptionsMod.NsisOptions
import typingsSlinky.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typingsSlinky.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/nsis/nsisLicense", JSImport.Namespace)
@js.native
object nsisLicenseMod extends js.Object {
  
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}
