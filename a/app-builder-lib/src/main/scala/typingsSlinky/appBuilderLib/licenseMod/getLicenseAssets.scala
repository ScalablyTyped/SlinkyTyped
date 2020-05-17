package typingsSlinky.appBuilderLib.licenseMod

import typingsSlinky.appBuilderLib.anon.File
import typingsSlinky.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/license", "getLicenseAssets")
@js.native
object getLicenseAssets extends js.Object {
  def apply(fileNames: js.Array[String], packager: PlatformPackager[_]): js.Array[File] = js.native
}

