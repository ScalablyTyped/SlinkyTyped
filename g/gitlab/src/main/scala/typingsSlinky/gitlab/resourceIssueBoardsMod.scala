package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceIssueBoardsMod {
  
  @JSImport("gitlab/dist/types/core/templates/ResourceIssueBoards", "ResourceIssueBoards")
  @js.native
  class ResourceIssueBoards protected () extends BaseService {
    def this(resourceType: String, options: js.Any) = this()
    
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(resourceId: String, name: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, name: String, options: Sudo): js.Promise[js.Object] = js.native
    def create(resourceId: Double, name: String): js.Promise[js.Object] = js.native
    def create(resourceId: Double, name: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def createList(resourceId: String, boardId: Double, labelId: Double): js.Promise[js.Object] = js.native
    def createList(resourceId: String, boardId: Double, labelId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def createList(resourceId: Double, boardId: Double, labelId: Double): js.Promise[js.Object] = js.native
    def createList(resourceId: Double, boardId: Double, labelId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def edit(resourceId: String, boardId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: String, boardId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, boardId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, boardId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def editList(resourceId: String, boardId: Double, listId: Double, position: Double): js.Promise[js.Object] = js.native
    def editList(resourceId: String, boardId: Double, listId: Double, position: Double, options: Sudo): js.Promise[js.Object] = js.native
    def editList(resourceId: Double, boardId: Double, listId: Double, position: Double): js.Promise[js.Object] = js.native
    def editList(resourceId: Double, boardId: Double, listId: Double, position: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def lists(resourceId: String, boardId: Double): js.Promise[GetResponse] = js.native
    def lists(resourceId: String, boardId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def lists(resourceId: Double, boardId: Double): js.Promise[GetResponse] = js.native
    def lists(resourceId: Double, boardId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(resourceId: String, boardId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, boardId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, boardId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, boardId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def removeList(resourceId: String, boardId: Double, listId: Double): js.Promise[js.Object] = js.native
    def removeList(resourceId: String, boardId: Double, listId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeList(resourceId: Double, boardId: Double, listId: Double): js.Promise[js.Object] = js.native
    def removeList(resourceId: Double, boardId: Double, listId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(resourceId: String, boardId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, boardId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, boardId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, boardId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showList(resourceId: String, boardId: Double, listId: Double): js.Promise[GetResponse] = js.native
    def showList(resourceId: String, boardId: Double, listId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showList(resourceId: Double, boardId: Double, listId: Double): js.Promise[GetResponse] = js.native
    def showList(resourceId: Double, boardId: Double, listId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
