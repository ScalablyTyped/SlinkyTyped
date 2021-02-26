package typingsSlinky.ionic

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotMod {
  
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
  
  @js.native
  trait SnapshotClientDeps extends StObject {
    
    val app: IdString = js.native
    
    val client: IClient = js.native
    
    val token: String = js.native
  }
  object SnapshotClientDeps {
    
    @scala.inline
    def apply(app: IdString, client: IClient, token: String): SnapshotClientDeps = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotClientDeps]
    }
    
    @scala.inline
    implicit class SnapshotClientDepsMutableBuilder[Self <: SnapshotClientDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: IdString): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
