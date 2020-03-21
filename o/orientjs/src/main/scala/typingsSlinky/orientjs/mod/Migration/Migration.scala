package typingsSlinky.orientjs.mod.Migration

import typingsSlinky.orientjs.mod.ODB
import typingsSlinky.orientjs.mod.OServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Migration.Migration")
@js.native
class Migration () extends js.Object {
  var db: ODB = js.native
  var name: String = js.native
  var server: OServer = js.native
  def down(): js.Promise[_] = js.native
  def up(): js.Promise[_] = js.native
}

