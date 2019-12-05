package typingsSlinky.readdirDashEnhanced

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced/lib/stream", JSImport.Namespace)
@js.native
object libStreamMod extends js.Object {
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Options with (Anon_False | Anon_Stats)): Readable = js.native
}

