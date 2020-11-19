package typingsSlinky.gitlab.groupsMod

import typingsSlinky.gitlab.anon.Sudoproviderstringundefin
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.projectsMod.ProjectSchema
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/Groups", "Groups")
@js.native
class Groups () extends BaseService {
  
  def all(): js.Promise[js.Array[GroupSchema]] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[js.Array[GroupSchema]] = js.native
  
  def create(): js.Promise[js.Object] = js.native
  def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  
  def createLDAPLink(groupId: String, cn: js.Any, groupAccess: js.Any, provider: String): js.Promise[js.Object] = js.native
  def createLDAPLink(groupId: String, cn: js.Any, groupAccess: js.Any, provider: String, options: Sudo): js.Promise[js.Object] = js.native
  def createLDAPLink(groupId: Double, cn: js.Any, groupAccess: js.Any, provider: String): js.Promise[js.Object] = js.native
  def createLDAPLink(groupId: Double, cn: js.Any, groupAccess: js.Any, provider: String, options: Sudo): js.Promise[js.Object] = js.native
  
  def edit(groupId: String): js.Promise[js.Object] = js.native
  def edit(groupId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(groupId: Double): js.Promise[js.Object] = js.native
  def edit(groupId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  
  def projects(groupId: String): js.Promise[js.Array[ProjectSchema]] = js.native
  def projects(groupId: String, options: BaseRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
  def projects(groupId: Double): js.Promise[js.Array[ProjectSchema]] = js.native
  def projects(groupId: Double, options: BaseRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
  
  def remove(groupId: String): js.Promise[js.Object] = js.native
  def remove(groupId: String, options: Sudo): js.Promise[js.Object] = js.native
  def remove(groupId: Double): js.Promise[js.Object] = js.native
  def remove(groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
  
  def removeLDAPLink(groupId: String, cn: js.Any): js.Promise[js.Object] = js.native
  def removeLDAPLink(groupId: String, cn: js.Any, hasProviderOptions: Sudoproviderstringundefin): js.Promise[js.Object] = js.native
  def removeLDAPLink(groupId: Double, cn: js.Any): js.Promise[js.Object] = js.native
  def removeLDAPLink(groupId: Double, cn: js.Any, hasProviderOptions: Sudoproviderstringundefin): js.Promise[js.Object] = js.native
  
  def search(nameOrPath: String): js.Promise[GetResponse] = js.native
  def search(nameOrPath: String, options: Sudo): js.Promise[GetResponse] = js.native
  
  def show(groupId: String): js.Promise[GroupDetailSchema] = js.native
  def show(groupId: String, options: BaseRequestOptions): js.Promise[GroupDetailSchema] = js.native
  def show(groupId: Double): js.Promise[GroupDetailSchema] = js.native
  def show(groupId: Double, options: BaseRequestOptions): js.Promise[GroupDetailSchema] = js.native
  
  def subgroups(groupId: String): js.Promise[js.Array[GroupDetailSchema]] = js.native
  def subgroups(groupId: String, options: PaginatedRequestOptions): js.Promise[js.Array[GroupDetailSchema]] = js.native
  def subgroups(groupId: Double): js.Promise[js.Array[GroupDetailSchema]] = js.native
  def subgroups(groupId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[GroupDetailSchema]] = js.native
  
  def syncLDAP(groupId: String): js.Promise[js.Object] = js.native
  def syncLDAP(groupId: String, options: Sudo): js.Promise[js.Object] = js.native
  def syncLDAP(groupId: Double): js.Promise[js.Object] = js.native
  def syncLDAP(groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
}
