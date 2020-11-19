package typingsSlinky.ionic.snapshotMod

import typingsSlinky.ionic.anon.IdString
import typingsSlinky.ionic.anon.PartialPaginateArgsResponGuard
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IPaginator
import typingsSlinky.ionic.definitionsMod.PaginatorState
import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.definitionsMod.ResourceClientPaginate
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.definitionsMod.Snapshot
import typingsSlinky.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/snapshot", "SnapshotClient")
@js.native
class SnapshotClient protected ()
  extends ResourceClient
     with ResourceClientLoad[Snapshot]
     with ResourceClientPaginate[Snapshot] {
  def this(hasClientAppToken: SnapshotClientDeps) = this()
  
  var app: IdString = js.native
  
  var client: IClient = js.native
  
  def load(id: String): js.Promise[Snapshot] = js.native
  
  def paginate(args: PartialPaginateArgsResponGuard): IPaginator[Response[js.Array[Snapshot]], PaginatorState] = js.native
  
  var token: String = js.native
}
