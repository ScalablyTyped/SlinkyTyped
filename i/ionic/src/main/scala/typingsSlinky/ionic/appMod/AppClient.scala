package typingsSlinky.ionic.appMod

import typingsSlinky.ionic.anon.Branches
import typingsSlinky.ionic.anon.PartialPaginateArgsRespon
import typingsSlinky.ionic.definitionsMod.App
import typingsSlinky.ionic.definitionsMod.AppAssociation
import typingsSlinky.ionic.definitionsMod.IPaginator
import typingsSlinky.ionic.definitionsMod.PaginatorState
import typingsSlinky.ionic.definitionsMod.ResourceClientCreate
import typingsSlinky.ionic.definitionsMod.ResourceClientLoad
import typingsSlinky.ionic.definitionsMod.ResourceClientPaginate
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.httpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/app", "AppClient")
@js.native
class AppClient protected ()
  extends ResourceClient
     with ResourceClientLoad[App]
     with ResourceClientCreate[App, AppCreateDetails]
     with ResourceClientPaginate[App] {
  def this(token: String, e: AppClientDeps) = this()
  val e: AppClientDeps = js.native
  val token: String = js.native
  /* CompleteClass */
  override def create(details: AppCreateDetails): js.Promise[App] = js.native
  def createAssociation(id: String, association: Branches): js.Promise[AppAssociation] = js.native
  def deleteAssociation(id: String): js.Promise[Unit] = js.native
  def load(id: String): js.Promise[App] = js.native
  def paginate(args: PartialPaginateArgsRespon): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
  def paginate(args: PartialPaginateArgsRespon, orgId: String): IPaginator[Response[js.Array[App]], PaginatorState] = js.native
}

