package typingsSlinky.appBuilderLib

import typingsSlinky.appBuilderLib.nsisOptionsMod.NsisOptions
import typingsSlinky.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typingsSlinky.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisLicenseMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLicense", "computeLicensePage")
  @js.native
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}
