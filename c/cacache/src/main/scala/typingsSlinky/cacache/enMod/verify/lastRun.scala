package typingsSlinky.cacache.enMod.verify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "verify.lastRun")
@js.native
object lastRun extends js.Object {
  /**
    * Returns a Date representing the last time `cacache.verify` was run on
    * `cache`.
    */
  def apply(cachePath: String): js.Promise[js.Date] = js.native
}

