package typingsSlinky.readdirDashEnhanced

import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Callback
import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Options
import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced/lib/async", JSImport.Namespace)
@js.native
object libAsyncMod extends js.Object {
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Promise[js.Array[String]] = js.native
  def readdirAsync(
    dir: String,
    options: Options with (Anon_False | Anon_Stats),
    callback: Callback[js.Array[Stats | String]]
  ): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
}

