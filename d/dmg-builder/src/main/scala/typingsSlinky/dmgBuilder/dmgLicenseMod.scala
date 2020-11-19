package typingsSlinky.dmgBuilder

import typingsSlinky.appBuilderLib.mod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dmg-builder/out/dmgLicense", JSImport.Namespace)
@js.native
object dmgLicenseMod extends js.Object {
  
  def addLicenseToDmg(packager: PlatformPackager[_], dmgPath: String): js.Promise[String | Null] = js.native
}
