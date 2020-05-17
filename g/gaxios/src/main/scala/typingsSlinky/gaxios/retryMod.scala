package typingsSlinky.gaxios

import typingsSlinky.gaxios.anon.Config
import typingsSlinky.gaxios.anon.ShouldRetry
import typingsSlinky.gaxios.commonMod.GaxiosError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaxios/build/src/retry", JSImport.Namespace)
@js.native
object retryMod extends js.Object {
  def getRetryConfig(err: GaxiosError[_]): js.Promise[Config | ShouldRetry] = js.native
}

