package typingsSlinky.ionic

import typingsSlinky.ionic.anon.Branches
import typingsSlinky.ionic.anon.PartialPaginateArgsRespon
import typingsSlinky.ionic.anon.PickAppnameorg
import typingsSlinky.ionic.definitionsMod.App
import typingsSlinky.ionic.definitionsMod.AppAssociation
import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IPaginator
import typingsSlinky.ionic.definitionsMod.PaginatorState
import typingsSlinky.ionic.definitionsMod.ResourceClientCreate
import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.definitionsMod.ResourceClientPaginate
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.httpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("ionic/lib/app", "AppClient")
  @js.native
  class AppClient protected ()
    extends ResourceClient
       with ResourceClientLoad[App]
       with ResourceClientCreate[App, AppCreateDetails]
       with ResourceClientPaginate[App] {
    def this(token: String, e: AppClientDeps) = this()
    
    def createAssociation(id: String, association: Branches): js.Promise[AppAssociation] = js.native
    
    def deleteAssociation(id: String): js.Promise[Unit] = js.native
    
    val e: AppClientDeps = js.native
    
    def load(id: String): js.Promise[App] = js.native
    
    def paginate(args: js.UndefOr[scala.Nothing], orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    def paginate(args: PartialPaginateArgsRespon): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    def paginate(args: PartialPaginateArgsRespon, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
    
    val token: String = js.native
  }
  
  @JSImport("ionic/lib/app", "formatName")
  @js.native
  def formatName(app: PickAppnameorg): String = js.native
  
  @js.native
  trait AppClientDeps extends StObject {
    
    val client: IClient = js.native
  }
  object AppClientDeps {
    
    @scala.inline
    def apply(client: IClient): AppClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppClientDeps]
    }
    
    @scala.inline
    implicit class AppClientDepsMutableBuilder[Self <: AppClientDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AppCreateDetails extends StObject {
    
    val name: String = js.native
    
    val org_id: js.UndefOr[String] = js.native
  }
  object AppCreateDetails {
    
    @scala.inline
    def apply(name: String): AppCreateDetails = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCreateDetails]
    }
    
    @scala.inline
    implicit class AppCreateDetailsMutableBuilder[Self <: AppCreateDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrg_id(value: String): Self = StObject.set(x, "org_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrg_idUndefined: Self = StObject.set(x, "org_id", js.undefined)
    }
  }
}
