package typingsSlinky.ionic.libUpdatesMod

import typingsSlinky.atIonicCliDashFramework.definitionsMod.PackageJson
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/updates", "runUpdateNotify")
@js.native
object runUpdateNotify extends js.Object {
  def apply(env: IonicEnvironment, pkg: PackageJson): js.Promise[Unit] = js.native
}

