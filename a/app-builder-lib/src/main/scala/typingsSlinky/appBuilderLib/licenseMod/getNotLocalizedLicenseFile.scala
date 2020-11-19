package typingsSlinky.appBuilderLib.licenseMod

import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
@js.native
object getNotLocalizedLicenseFile extends js.Object {
  
  def apply(custom: js.UndefOr[scala.Nothing], packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  def apply(
    custom: js.UndefOr[scala.Nothing],
    packager: PlatformPackager[_],
    supportedExtension: js.Array[String]
  ): js.Promise[String | Null] = js.native
  def apply(custom: String, packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  def apply(custom: String, packager: PlatformPackager[_], supportedExtension: js.Array[String]): js.Promise[String | Null] = js.native
  def apply(custom: Null, packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  def apply(custom: Null, packager: PlatformPackager[_], supportedExtension: js.Array[String]): js.Promise[String | Null] = js.native
}
