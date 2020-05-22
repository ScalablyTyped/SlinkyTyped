package typingsSlinky.openfin

import typingsSlinky.openfin.environmentMod.Environment
import typingsSlinky.openfin.platformPlatformMod.OverrideCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/platform-provider", JSImport.Namespace)
@js.native
object platformProviderMod extends js.Object {
  def default(environment: Environment): js.Function1[/* userOverrideFn */ OverrideCallback[_], js.Promise[Unit]] = js.native
}

