package typingsSlinky.ionic.libSnapshotMod

import typingsSlinky.ionic.Anon_IdString
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.definitionsMod.ResourceClientPaginate
import typingsSlinky.ionic.definitionsMod.Snapshot
import typingsSlinky.ionic.libHttpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/snapshot", "SnapshotClient")
@js.native
class SnapshotClient protected ()
  extends ResourceClient
     with ResourceClientLoad[Snapshot]
     with ResourceClientPaginate[Snapshot] {
  def this(hasClientAppToken: SnapshotClientDeps) = this()
  var app: Anon_IdString = js.native
  var client: IClient = js.native
  var token: String = js.native
  def load(id: String): js.Promise[Snapshot] = js.native
}

