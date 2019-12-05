package typingsSlinky.readdirDashEnhanced

import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced/lib/sync", JSImport.Namespace)
@js.native
object libSyncMod extends js.Object {
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Array[String] = js.native
}

