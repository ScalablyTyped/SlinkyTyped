package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.AnonFullMap
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.LazyMap")
@js.native
class LazyMap () extends js.Object {
  def this(args: AnonFullMap) = this()
  var fullMap: js.UndefOr[Map[String, String]] = js.native
  var keysOnly: js.UndefOr[Set[String]] = js.native
}

