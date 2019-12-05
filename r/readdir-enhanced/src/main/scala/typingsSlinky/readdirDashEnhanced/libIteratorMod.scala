package typingsSlinky.readdirDashEnhanced

import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Options
import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced/lib/iterator", JSImport.Namespace)
@js.native
object libIteratorMod extends js.Object {
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Options with (Anon_False | Anon_Stats)): AsyncIterableIterator[String] = js.native
}

