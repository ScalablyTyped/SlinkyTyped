package typingsSlinky.ionic.npmMod

import typingsSlinky.ionic.PartialPkgManagerOptions
import typingsSlinky.ionic.definitionsMod.NpmClient
import typingsSlinky.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/npm", "pkgFromRegistry")
@js.native
object pkgFromRegistry extends js.Object {
  def apply(npmClient: NpmClient, options: PartialPkgManagerOptions): js.Promise[js.UndefOr[PackageJson]] = js.native
}

