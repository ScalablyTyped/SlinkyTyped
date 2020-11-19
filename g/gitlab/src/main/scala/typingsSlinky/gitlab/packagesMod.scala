package typingsSlinky.gitlab

import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Packages", JSImport.Namespace)
@js.native
object packagesMod extends js.Object {
  
  @js.native
  class Packages () extends BaseService {
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def remove(projectId: String, packageId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, packageId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, packageId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, packageId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, packageId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, packageId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showFiles(projectId: String, packageId: Double): js.Promise[GetResponse] = js.native
    def showFiles(projectId: String, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showFiles(projectId: Double, packageId: Double): js.Promise[GetResponse] = js.native
    def showFiles(projectId: Double, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
